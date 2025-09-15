class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        hmap = {}

        for ch in brokenLetters:
            hmap[ch] = True

        words = text.split(" ")
        count = 0
        
        for word in words:
            canType = True
            for ch in word:
                if ch in hmap:
                    canType = False
                    break
            
            if canType:
                count = count + 1

        return count

        