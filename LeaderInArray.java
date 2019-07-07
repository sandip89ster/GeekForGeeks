import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int items = Integer.parseInt(br.readLine());
		while(items-->0){
		    int size = Integer.parseInt(br.readLine());
		    String line = br.readLine();
		    String[] strs = line.trim().split("\\s+");
		    int high = Integer.parseInt(strs[size-1]);
		    List<Integer> list = new ArrayList<>();
		    list.add(Integer.parseInt(strs[size-1]));
		    StringBuffer buffer = new StringBuffer();
		    for(int i=size-2; i>=0; i--){
		        if(high<=Integer.parseInt(strs[i])){
		            list.add(Integer.parseInt(strs[i]));
		            high=Integer.parseInt(strs[i]);
		        }
		    }
		    Collections.sort(list,Collections.reverseOrder());
		    for(Integer k : list){
		        buffer.append(k+" ");
		    }
		    System.out.println(buffer);
		}
	}
}
