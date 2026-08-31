class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set()
        l = 0
        res =0

        for _ in range(len(s)):
            while s[_] in charSet:
                charSet.remove(s[l])
                l +=1
            charSet.add(s[_])
            res= max(res , _-l +1)
        
        return res
        