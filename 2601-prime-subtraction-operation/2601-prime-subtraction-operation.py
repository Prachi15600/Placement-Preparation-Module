class Solution:
    def primeSubOperation(self, nums: List[int]) -> bool: 
        def isSorted(nums):
            return all(nums[i] < nums[i+1] for i in range(len(nums) - 1))
            
        # if already sorted
        if (isSorted(nums)):
            return True
        
        def sieveOfEratosthenes(limit):
            isPrime = [True] * (limit + 1)
            isPrime[0], isPrime[1] = False, False 

            for i in range(2, int(limit ** 0.5) + 1):
                if isPrime[i]:  # If the number is prime
                    for j in range(i * i, limit + 1, i):  # Mark multiples of i as not prime
                        isPrime[j] = False

            primes = [i for i in range(2, limit + 1) if isPrime[i]]
            return primes

        # generate primes upto 1000
        primes = sieveOfEratosthenes(1000)
        
        def getSmallPrime(n):
            idx = bisect.bisect_left(primes, n)  
            return primes[idx - 1] 
        
        for idx, n in enumerate(nums):
            if (idx == 0):
                p = getSmallPrime(nums[idx])
                if (nums[idx] - p < 0):
                    continue
                nums[idx] -= p
            else:
                # (nums[i] - p >= nums[i - 1])
                # (nums[i] - nums[i - 1] >= p)
                
                p = getSmallPrime(nums[idx] - nums[idx - 1])
                if (nums[idx] - p < 0):
                    continue
                    
                nums[idx] -= p
        
        return isSorted(nums)