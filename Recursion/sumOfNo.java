/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		GFG obj=new GFG();
		System.out.println(obj.sumOfNo(123));
	} 
	public int sumOfNo(int n){
	    if(n<0)
	    return 0;
	    if(n==0)
	    return 0;
	    return (n%10)+sumOfNo(n/10);
	}
	
}
