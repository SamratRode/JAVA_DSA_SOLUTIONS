def rearrangeArray(arr, N) :
       
    
    mp = {}
    visited = {}    
    for i in range(N) :
        if(arr[i] in mp) :
            mp[arr[i]] += 1
        else :
            mp[arr[i]] = 1
       
    pq = []
       
    
    for i in range(N) :
        val = arr[i]
        if((val in mp) and ((val not in visited) or (visited[val] != 1))) :
            pq.append([mp[val], val])
        visited[val] = 1   
    pq.sort()
    pq.reverse()
       
   
    result = [0]*N
       
    
    prev = [-1, -1]
    l = 0
    count=0

   
    while (len(pq) != 0) :
           
        
        k = pq[0]
        pq.pop(0)
        result[l] = k[1]
        count=count+1
           
        
        if (prev[0] > 0) :
         
            pq.append(prev)
            pq.sort()
            pq.reverse()
           
        
        prev = [k[0] - 1, k[1]]
        l += 1
         
    for it in result :
        if (it == 0) :
               
            
            print("-1")
            return   
    print(count)
a=int(input("Enter"))
b=0
while(b<a):
    n0=int(input())
    s0=input()
    l0=len(s0)
    l1=[]
    count=0
    parity_list=[]
    for i0 in range(0,l0,2):
        l1.append(int(s0[i0]))
    for i0 in range(0,len(l1)):
        parity_list.append(l1[i0]%2)
    rearrangeArray(parity_list,len(parity_list))
    b=b+1
                    

    