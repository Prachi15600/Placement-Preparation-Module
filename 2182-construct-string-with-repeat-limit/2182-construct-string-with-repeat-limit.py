class Solution:
	def repeatLimitedString(self, s: str, repeatLimit: int) -> str:
		maxHeap = []
		res = ""
		for k, v in collections.Counter(s).items():
			heappush(maxHeap, (-ord(k), v))
		while maxHeap:            
			char1, freq1 = heappop(maxHeap)
			if not res or chr(-char1) != res[-1]:
				if freq1 > repeatLimit:
					res += chr(-char1) * repeatLimit
					freq1 -= repeatLimit
					heappush(maxHeap, (char1, freq1))
				else:
					res += chr(-char1) * (freq1)
			else:
				if len(maxHeap) == 0:
					return res
				else:
					char2, freq2 = heappop(maxHeap)
					res += chr(-char2)
					freq2 -= 1
					if freq2 > 0:
						heappush(maxHeap, (char2, freq2))
					heappush(maxHeap, (char1, freq1))
		return res