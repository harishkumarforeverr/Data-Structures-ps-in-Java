//my approach
/*package whatever //do not write package name here */

import java.io.*;

class Recursion {
	public static void main (String[] args) {
		Recursion obj=new Recursion();
		 obj.BinaryNo(13/2,13%2);
	} 
	public void BinaryNo(int q, int r){  
	    if(q<0)
	    return ;
	    if(q==0){ 
	      System.out.println(r); 
	      return;
	    }
	    BinaryNo(q/2,q%2);
	    System.out.println(r);
	    
	   
	    
	}
	
}



///###################################################################################################################################################
// another approach
/*package whatever //do not write package name here */

import java.io.*;

class Recursion {
	public static void main (String[] args) {
		Recursion obj=new Recursion();
		 System.out.println(obj.BinaryNo(13));;
	} 
	public int BinaryNo(int q){    
	     if(q<0)
	     return -1;
	     if(q==0)
	     return q%10;
	     return (q%2)+(10*BinaryNo(q/2));
	}
	
}
