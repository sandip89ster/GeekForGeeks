for _ in range(int(input(""))):
    N=int(input(""))
    arr=[]
    input_val=input("").split(" ")
    for i in input_val:
        try:
           arr.append(int(i))
        except:
            pass
    R=[0 for i in range(N)]
    R[0]=1
    maxLen = 1
    for i in range(1,N):
        l=1
        for j in range(0,i):
            if arr[j]<arr[i]:
                l=max(l,R[j]+1)
        R[i]=l
        maxLen=max(maxLen,l)
    print(maxLen)
