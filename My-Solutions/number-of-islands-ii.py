class Solution:
    def numIslands2(self, m, n, positions):
        """
        :type m: int
        :type n: int
        :type positions: List[List[int]]
        :rtype: List[int]
        """
        
        visited = set()
        component_number_to_points = collections.defaultdict(list)
        point_to_component = collections.defaultdict(int)
        component,island_count,result = 0,0,[]

        for position in positions:
            i,j = position[0],position[1]
            visited.add((i,j))
            component+=1
            component_number_to_points[component].append((i,j))
            point_to_component[(i)*n+(j)] = component
            
            if  (i-1,j) not in visited and ((i+1,j) not in visited) and ((i,j-1) not in visited) and ((i,j+1) not in visited):
                island_count +=1
                result.append(island_count)
            else:
                merge = set()
                if (i-1,j) in visited:
                    merge.add(point_to_component.get((i-1)*n + (j)))
                if (i+1,j) in visited:
                    merge.add(point_to_component.get((i+1)*n + (j)))
                if (i,j-1) in visited:
                    merge.add(point_to_component.get((i) *n +(j-1)))
                if (i,j+1) in visited:
                    merge.add(point_to_component.get((i)*n+ (j+1)))
            

                merge = list(merge)
                for comp in merge:
                    cur_points = component_number_to_points.get(comp)
                    if cur_points:
                        component_number_to_points[component].extend(cur_points)
                        for point in cur_points:
                            i,j = point[0],point[1]
                            point_to_component[(i)*n+(j)]=component
                        del component_number_to_points[comp]
                island_count -= (len(merge)-1)
                result.append(island_count)
        
        return result
                    
