class Solution:
    def strStr(self, haystack: str, neddle: str) -> int:
        for i in range(len(haystack) - len(neddle)+1):
            if (haystack[i] == neddle[0]):
                if haystack[i:i+ len(neddle)] == neddle:
                    return i
        return -1