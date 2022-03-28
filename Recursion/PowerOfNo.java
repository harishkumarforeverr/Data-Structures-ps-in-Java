/*package whatever //do not write package name here */

import java.io.*;

class Recursion {
	public static void main (String[] args) {
		Recursion obj=new Recursion();
		System.out.println(obj.PowerOfNo(2,3));
	} 
	public int PowerOfNo(int base, int exp){ 
	    if(exp<0)
	    return -1;
	    if(exp==1 || exp==0)
	    return base;
	    return base*PowerOfNo(base,exp-1);
	}
	
}
