class Solution:
	def minimumTime(self, n: int, relations: List[List[int]], time: List[int]) -> int:
		graph = defaultdict(list)
		indegree = defaultdict(lambda:0)
		t = [0]+time.copy()

		for i,j in relations:
			graph[j].append(i)

			indegree[i] += 1

		stack= []
		for i in range(n):
			if indegree[i+1] == 0:
				stack.append((i+1))


		while stack:
			p = stack.pop(0)

			for val in graph[p]:
				t[val] = max(t[val],t[p]+time[val-1])
				indegree[val] -= 1
				if indegree[val] == 0:
					stack.append(val)


		return max(t)