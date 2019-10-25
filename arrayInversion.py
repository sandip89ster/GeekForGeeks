def mergeSort(arr, n): 
    temp_arr = [0]*n 
    return _mergeSort(arr, temp_arr, 0, n-1) 

def _mergeSort(arr, temp_arr, left, right): 
    inv_count = 0
    if left < right: 
        mid = (left + right)//2
        inv_count = _mergeSort(arr, temp_arr, left, mid) 
        inv_count += _mergeSort(arr, temp_arr, mid + 1, right) 
        inv_count += merge(arr, temp_arr, left, mid, right) 
    return inv_count 

def merge(arr,temp_arr,left,mid,right):
    i = left
    j = mid+1
    k = left
    inv_count = 0
    while i <= mid and j <= right: 
        if arr[i] <= arr[j]: 
            temp_arr[k] = arr[i] 
            k += 1
            i += 1
        else: 
            temp_arr[k] = arr[j] 
            inv_count += (mid-i+1) 
            k += 1
            j += 1
    while i <= mid: 
        temp_arr[k] = arr[i] 
        k += 1
        i += 1
  
    while j <= right: 
        temp_arr[k] = arr[j] 
        k += 1
        j += 1
        
    for val in range(left, right+1):
        arr[val]=temp_arr[val]
    
    return inv_count
    
    
items=int(input(""))
for i in range(items):
    inputs=[]
    size=int(input(""))
    input_value=input("")
    for i in input_value.split(' '):
        try:
            inputs.append(int(i))
        except:
            pass
    print(mergeSort(inputs,len(inputs)))
