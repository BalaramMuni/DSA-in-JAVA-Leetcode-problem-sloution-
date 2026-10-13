class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        def reverse(p,q):
            while(p<=q):
                temp=s[p]
                s[p]=s[q]
                s[q]=temp
                p+=1
                q-=1

        s=list(s)
        n=len(s)
        for i in range(0,n,2*k):
            if(n-i-1<k):
                reverse(i,n-1)
            else:
                reverse(i,i+k-1)
        
        return "".join(s)
        