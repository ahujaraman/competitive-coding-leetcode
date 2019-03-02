"""
        Push - O(n) , All others O(1)
"""

class MyQueue:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.push_stack = []
        self.pop_stack = []

    def push(self, x: int) -> None:
        """
        Push element x to the back of queue.
        """
        self.push_stack.append(x)

    def pop(self) -> int:
        """
        Removes the element from in front of queue and returns that element.
        """
        self.peek()
        return self.pop_stack.pop()

    def peek(self) -> int:
        """
        Get the front element.
        """
        if len(self.pop_stack)==0:
            while len(self.push_stack):
                self.pop_stack.append(self.push_stack.pop())
        return self.pop_stack[-1]

    def empty(self) -> bool:
        """
        Returns whether the queue is empty.
        """
        return len(self.push_stack)==0 and len(self.pop_stack)==0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()