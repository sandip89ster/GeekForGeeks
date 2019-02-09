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
		    int max_so_far=Integer.MIN_VALUE, max_ending_here=0;
		    int arrSize = in.nextInt();
		    for(int i=0; i<arrSize; i++){
		        int num=in.nextInt();
		        max_ending_here=num+max_ending_here;
		        if(max_so_far<max_ending_here){
		            max_so_far=max_ending_here;
		        }if(max_ending_here<0){
		            max_ending_here=0;
		        }
		    }
		  System.out.println(max_so_far);  
		}
	}
}