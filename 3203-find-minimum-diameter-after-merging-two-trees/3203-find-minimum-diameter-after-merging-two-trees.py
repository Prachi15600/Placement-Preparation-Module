from collections import defaultdict
class Solution:
    def create_graph(self, edges):
        graph = defaultdict(list)
        for edge in edges:
            graph[edge[0]].append(edge[1])
            graph[edge[1]].append(edge[0])
        return graph
    
    def graph_info(self, edges):
        graph = self.create_graph(edges)

        def dfs(node, par):
            height1, height2, diameter = 0, 0, 0
            for child in graph[node]:
                if child != par:
                    child_dia, child_height = dfs(child, node)
                    diameter = max(diameter, child_dia)
                    if child_height + 1> height1:
                        height2 = height1
                        height1 = child_height + 1
                    elif child_height+1>height2:
                        height2 = child_height+1
            diameter = max(diameter, height1+height2)
            return diameter, height1
        
        diameter, max_height = dfs(0, -1)
        return diameter, min(len(graph)-1, (diameter+1)//2)

    def minimumDiameterAfterMerge(self, edges1: List[List[int]], edges2: List[List[int]]) -> int:
        tree1 = self.graph_info(edges1)
        tree2 = self.graph_info(edges2)
        return max([tree1[0], tree2[0], tree1[1]+tree2[1]+1])