import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int items = Integer.parseInt(br.readLine()); 
		int size=0;  
		while(items-->0){
		    Map<String, Integer> map = new HashMap<>();
		    size = Integer.parseInt(br.readLine());
		    int n = size/2;
		    String temp=null;
		    boolean flag=false;
		    String line = br.readLine(); 
		    String[] strs = line.trim().split("\\s+");
		    for(int i=0; i<size; i++){
		        if(!(map.containsKey(strs[i]))){
		            map.put(strs[i],1);
		        }else{
		            map.put(strs[i], map.get(strs[i])+1);
		            if(map.get(strs[i])>n){
		                flag=true;
		                temp=strs[i];
		                break;
		            }
		        }
		    }
		    if(flag){
		        System.out.println(temp);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}
