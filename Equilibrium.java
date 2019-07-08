import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int items = Integer.parseInt(br.readLine());
		while(items-->0){
		    int sum=0,temp=0;boolean flag=false;
		    int cases = Integer.parseInt(br.readLine());
		    String line = br.readLine();
		    String[] strs = line.trim().split("\\s+");
		    if(strs.length<=1){
		        System.out.println(1);
		        flag=true;
		    }else{
		        for(int i=0; i<strs.length; i++){
		            sum=sum+Integer.parseInt(strs[i]);
		        }
		        int leftsum=0;
		        for(int i=0; i<strs.length;i++){
		            sum=sum-Integer.parseInt(strs[i]);
		            if(sum==leftsum){
		                System.out.println(i+1);
		                flag=true;
		                break;
		            }
		            leftsum=leftsum+Integer.parseInt(strs[i]);
		        }
		    }if(!flag){
		        System.out.println(-1);
		    }
		}
	}
}
