class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        non_duplicate = list(set(nums))
        output = []
        for i in non_duplicate:
            if nums.count(i) > (len(nums)/3):
                output.append(i)
        return output