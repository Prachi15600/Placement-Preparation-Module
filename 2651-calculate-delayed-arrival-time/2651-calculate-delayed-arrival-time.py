class Solution:
    def findDelayedArrivalTime(self, arrivalTime: int, delayedTime: int) -> int:
        time = arrivalTime + delayedTime
        if time<24:
            return time
        else:
            return time - 24