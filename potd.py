
#code here
arr=[5,8,7,6,2,3,1,0,8,4]
print(arr)
N=10
count=1
l=[]
l1=[]
l2=[]
for i in range(N):
    l1.append(arr[i])
l2=sorted(l1)
print(l2)
            
            
for i in range(N-1):
    if(l2[i]+1==l2[i+1]):
        count=count+1
    else:
        l.append(count)
        count=0
            
                
l.sort()
print(l[-1])
print(l)


