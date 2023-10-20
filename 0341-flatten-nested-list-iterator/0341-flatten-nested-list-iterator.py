class NestedIterator:
    def __init__(self, nestedList: [NestedInteger]):
        
        def flatten(items):
            for x in items:
                if x.getInteger() is not None:
                    yield x.getInteger()
                else:
                    yield from flatten(x.getList())
                    
        self.g = flatten(nestedList)
        self.buff = None
    
    def next(self) -> int:
        if self.buff is not None:
            ans = self.buff
            self.buff = None
            return ans
        else:
            return next(self.g)
    
    def hasNext(self) -> bool:
        try:
            self.buff = next(self.g)
            return True
        except StopIteration:
            return False