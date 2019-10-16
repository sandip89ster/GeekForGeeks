item=int(input(""))
for i in range(item):
    size=int(input(""))
    array=input("")
    array_split=[]
    for i in array.split(' '):
        try:
            if i is not None:
                array_split.append(int(i))
        except:
            pass
    dict={};cnt=0;zero_cnt=0;final=[]
    for i in array_split:
        if i!=0:
            cnt+=1
            if i not in dict:
                dict[i]=1
            else:
                dict[i]=dict.get(i)+1
    zero_cnt=size-cnt
    if zero_cnt>0:
        for i in range(zero_cnt):
            final.append(0)
    if (dict.get(1) is not None and dict.get(1)>0):
        try:
            for i in range(dict.get(1)):
                final.append(1)
        except:
            pass
    if (dict.get(2) is not None and dict.get(2)>0):
        try:
            for i in range(dict.get(2)):
                final.append(2)
        except:
            pass
    final=[str(i) for i in final]
    print(" ".join(final))
