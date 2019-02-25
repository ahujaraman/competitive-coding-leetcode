class Solution:
    def findJudge(self, N: int, trust: List[List[int]]) -> int:
        no_judge = set()
        graph = collections.defaultdict(list)
        for x,y in trust:
            no_judge.add(x)
            graph[x].append(y)
        
        if len(no_judge) < N-1:
            return -1
        jugde = 0
        for i in range(1,N+1):
            if i not in no_judge:
                jugde = i
        
        for i in no_judge:
            if jugde not in graph[i]:
                return -1
        
        if len(graph[jugde]) ==0:
            return jugde
        else:
            return -1