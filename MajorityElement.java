import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		int items = scanner.nextInt();
		int size=0,temp=0; boolean flag=false;
		while(items-->0){
		    Map<Integer,Integer> map = new HashMap<>();
		    size=scanner.nextInt();
		    for(int i=0; i<size; i++){
		    int num=scanner.nextInt();
		    if(map.get(num)==null){
		        map.put(num, 1);
		    }else{
		        map.put(num, map.get(num)+1);
		    }
		   }
		   for(Map.Entry<Integer,Integer> mapp : map.entrySet()){
		       if(mapp.getValue()>size/2){
		           temp=mapp.getKey();
		           flag=true;
		           break;
		       }
		   }
		   if(flag){
		       System.out.println(temp);
		       temp=0;
		       flag=false;
		   }else{
		       System.out.println(-1);
		   }
		        
		}
	}
}
