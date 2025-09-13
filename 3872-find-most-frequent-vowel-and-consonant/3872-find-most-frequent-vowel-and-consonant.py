class Solution:
    def maxFreqSum(self, s: str) -> int:
        maxVowel = 0
        maxConsonent = 0
        freq = [0] * 26
        vowel = {'a', 'e', 'i', 'o', 'u'}

        for ch in s:
            i = ord(ch) - ord('a')
            freq[i] += 1
            if ch in vowel:
                maxVowel = max(maxVowel, freq[i])
            else :
                maxConsonent = max(maxConsonent, freq[i])

        return maxVowel + maxConsonent
        
        