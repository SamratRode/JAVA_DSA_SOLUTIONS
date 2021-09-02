from itertools import chain
n=int(input("enter the number of test cases: "))
s=input("enter the number string: ")
l=len(s)
l1=[]
l2=[]
count=0
for i in range(0,l,2):
    l1.append(int(s[i]))
    
print(l1)
for i in range(0,n,1):
    if(i%2==0):
        l2.append([1]*l1[i])
    else:
        l2.append([-1]*l1[i])
print(l2)
flatten_list = list(chain.from_iterable(l2))
print(type(flatten_list[1]))
sum=0
for i in range(0,len(flatten_list)-1):
    for j in range(i+1,len(flatten_list)):
        for k in range(i,j):
            sum=sum+ int(flatten_list[k])
            if(sum==0):
                count=count+1
                print(count)
print(count)

