class Solution:
	def maxCount(self, banned: List[int], n: int, maxSum: int) -> int:

		result = 0
		current_sum = 0
		hashmap = defaultdict(int)

		for ban in banned:

			hashmap[ban] = 1

		for num in range(1 , n + 1):

			if num not in hashmap:

				if (current_sum + num) <= maxSum:

					current_sum = current_sum + num

					result = result + 1
				else:
					break

		return result

