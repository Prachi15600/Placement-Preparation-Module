class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n = len(nums1)
        m = len(nums2)
        arr = [-1]*n
        hm = {}
        st = []

        for i in range(m-1,-1,-1):
            while st and st[-1] <= nums2[i]:
                st.pop()

            if not st:
                hm[nums2[i]] = -1

            else:
                hm[nums2[i]] = st[-1]
            st.append(nums2[i])
        
        for i in range(n):
            arr[i] = hm[nums1[i]]

        return arr
