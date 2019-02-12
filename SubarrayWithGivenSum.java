/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int items = in.nextInt();
		while(items-->0){
		    int temp=0,i=0,start=0;
		    Boolean flag=false;
		    int arrSize = in.nextInt();
		    int total = in.nextInt();
		    int[] a = new int[arrSize];
		    for(int j=0;j<arrSize;j++ ){
		        a[j]=in.nextInt();
		    }
		    for(;i<arrSize;i++){
		        temp=temp+a[i];
		        if(temp>total){
		            start++;
		            i=start;
		            temp=a[start];
		            if(temp==total){
    		            System.out.println((start+1)+" "+(i+1));
    		            flag=true;
    		            break;
		        }
		        }else if(temp==total){
		            System.out.println((start+1)+" "+(i+1));
		            flag=true;
		            break;
		        }
		    }
		    if(!flag){
		        System.out.println(-1);
		    }
		 }
		
	}
}