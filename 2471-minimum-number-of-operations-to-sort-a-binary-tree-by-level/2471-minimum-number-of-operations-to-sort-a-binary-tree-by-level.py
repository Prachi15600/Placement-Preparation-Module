class Solution:
    def minimumOperations(self, root: Optional[TreeNode]) -> int:
        def calc(level):
            n = len(level)

            sorted_level = sorted(level)
            elem_to_index = {
                elem: i
                for i, elem in enumerate(level)
            }
            
            result = 0
            for i in range(n - 1):
                min_elem = sorted_level[i]
                j = elem_to_index[min_elem]
                if j != i:
                    result += 1
                    elem_to_index[level[i]] = j
                    level[j] = level[i]
            return result

        result = 0
        prev_level = [root]
        while prev_level:
            current_level = []
            for node in prev_level:
                if node.left is not None:
                    current_level.append(node.left)
                if node.right is not None:
                    current_level.append(node.right)
            
            current_level_vals = [
                node.val for node in current_level
            ]
            result += calc(current_level_vals)
            prev_level = current_level
        
        return result