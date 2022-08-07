from sortedcontainers import SortedList
class MyCalendar:
    def __init__(self):
        self.events = SortedList()
        self.events0 = SortedList()
        self.n = 0
        
    def book(self, start, end):
        if self.events:
            i = bisect.bisect(self.events0, start)
            for j in range(max(0, i - 1), min(self.n, i + 2)):
                if not (start >= self.events[j][1] or end <= self.events[j][0]):
                    return False
        self.events.add((start, end))
        self.events0.add(start)
        self.n += 1
        return True    

    
        


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)