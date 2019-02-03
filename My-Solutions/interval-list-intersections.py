# Definition for an interval.
# class Interval:
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution:
    def intervalIntersection(self, A: 'List[Interval]', B: 'List[Interval]') -> 'List[Interval]':
        result = []
        i,j = 0,0
        while i<len(A) and j<len(B):
            if B[j].start<=A[i].start <=B[j].end and B[j].start<=A[i].end <=B[j].end:
                cur = Interval(A[i].start,A[i].end)
                result.append(cur)
                i+=1
            elif A[i].start<=B[j].start <=A[i].end and A[i].start<=B[j].end <=A[i].end:
                cur = Interval(B[j].start,B[j].end)
                result.append(cur)
                j+=1
            elif B[j].start<=A[i].end <=B[j].end:
                cur = Interval(B[j].start,A[i].end)
                result.append(cur)
                i+=1
            elif  B[j].start<=A[i].start <=B[j].end:
                cur = Interval(A[i].start,B[j].end)
                result.append(cur)
                j+=1
            elif A[i].start < B[j].start and A[i].end<B[j].end:
                i+=1
            else:
                j+=1
        return result
