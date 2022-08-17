class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        out = []
        for i in range(len(boxes)):

            lower_temp = boxes[:i]
            lower_temp = lower_temp[::-1]
            upper_temp = boxes[i+1:]

            count = 0

            for x in range(1,len(lower_temp)+1):
                if lower_temp[x-1]=='1':
                    count+=x

            for x in range(1,len(upper_temp)+1):
                if upper_temp[x-1]=='1':
                    count+=x

            out.append(count)

        return out