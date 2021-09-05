 def findLongestConseqSubseq(self,arr, N):
        #code here
        count=1
        l=[]
        l1=[]
        l2=[]
        for i in range(N):
            l1.append(arr[i])
        l2=sorted(l1)
        
           
        for i in range(N-1):
            if(l2[i]+1==l2[i+1]):
                count=count+1
            else:
                l.append(count)
                count=0
        
            
        l.sort()
        print(l[-1])
