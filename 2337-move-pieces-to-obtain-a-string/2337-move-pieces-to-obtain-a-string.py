class Solution:
	def canChange(self, start: str, target: str) -> bool:

		length = len(start)

		start_index , target_index = 0 , 0

		while start_index < length or target_index < length:

			while start_index < length and start[start_index] == '_':
				start_index = start_index + 1

			while target_index < length and target[target_index] == '_':
				target_index = target_index + 1

			if start_index == length or target_index == length:

				if start_index == length and target_index == length:
					return True
				else:
					return False

			if start[start_index] != target[target_index]:
				return False

			if start[start_index] == 'L' and start_index < target_index:
				return False

			if start[start_index] == 'R' and start_index > target_index:
				return False

			start_index = start_index + 1

			target_index = target_index + 1

		return True