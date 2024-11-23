class Solution:
    def rotateTheBox(self, box: List[List[str]]) -> List[List[str]]:
        m, n = len(box), len(box[0])
        
        for row in box:
            r = w = n - 1             
            while r >= 0:               
                if row[r] == '*':
                    w = r - 1 
                elif row[r] == '#':
                    if r < w:
                        row[r] = '.'
                        row[w] = '#'                        
                    w -= 1
                r -= 1

        return [list(col)[::-1] for col in zip(*box)]