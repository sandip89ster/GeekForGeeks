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
		    int temp=0,sum=0;
		    int arrSize = in.nextInt();
		    for(int i=0; i<arrSize-1; i++){
		        int num=in.nextInt();
		        sum=num+sum;
		    }for(int i=0; i<=arrSize;i++){
		        temp=temp+i;
		    }
		    System.out.println(temp-sum);
		}
	}
}