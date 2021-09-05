class Solution:
    
    # arr[] : the input array
    # N : size of the array arr[]
    
    #Function to return length of longest subsequence of consecutive integers.
    def findLongestConseqSubseq(self,arr, N):
        #code here
        count=0
        l=[]
        l1=[]
        l2=[]
        for i in range(N):
            l1.append(arr[i])
        l2=l1.sort()
            
        for i in range(N-1):
            if(l2[i]==l2[i+1]):
                count=count+1
            else:
                count=0
            l.append(count)
        l.sort()
        print(l[-1])
