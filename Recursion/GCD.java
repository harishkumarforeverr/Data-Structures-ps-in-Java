/*package whatever //do not write package name here */

import java.io.*;

class Recursion {
	public static void main (String[] args) {
		Recursion obj=new Recursion();
		System.out.println(obj.GCD(8,4));
	} 
	public int GCD(int a, int b){ 
	    if(a<0 || b<0)
	    return -1;
	    if(b==0)
	    return a;
	    
	    return GCD(b,a%b);
	}
	
}
