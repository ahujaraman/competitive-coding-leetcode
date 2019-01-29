class TimeMap:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.key_timestamp_map = collections.defaultdict(list)
        self.key_value_map = collections.defaultdict(list)

    def set(self, key: 'str', value: 'str', timestamp: 'int') -> 'None':
        self.key_timestamp_map[key].append(timestamp)
        self.key_value_map[key].append(value)

    def get(self, key: 'str', timestamp: 'int') -> 'str':
        cur_list = self.key_timestamp_map.get(key)
        if len(cur_list)==0:
            return ""
        correct_position = bisect.bisect_left(cur_list,timestamp)
        if  correct_position==len(cur_list):
            return self.key_value_map.get(key)[-1]
        if cur_list[correct_position]!=timestamp and correct_position==0:
            return ""
        if cur_list[correct_position]==timestamp:
            return self.key_value_map.get(key)[correct_position]
        else:
            return self.key_value_map.get(key)[correct_position-1]


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)
