class GfG
{
    /*You are required to complete this method*/ 
    int maxLen(int[] arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen=0, count=0;
        for(int i=0; i<arr.length;i++){
            count=count+(arr[i]==1?1:-1);
            if(map.containsKey(count)){
                maxlen=Math.max(maxlen,i-map.get(count));
            }else{
                map.put(count,i);
            }
        }
        return maxlen;
    }
}
