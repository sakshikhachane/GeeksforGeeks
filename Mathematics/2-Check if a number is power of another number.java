/*
Given two positive numbers x and y, check if y is a power of x or not.

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain two positive numbers x and y.

Output:
Print 1 if y is a power of x, else print 0.

Constraints: 
1 <= T <= 30
1 <= x <= 103
1 <= y <= 108

Example:
Input:
2
2 8
1 3
Output:
1
0

Explanation: 8 is a power of 2, but 3 is not a power of 1.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static boolean isPower(int x, int y) 
    { 
        if (x == 1) 
            return (y == 1); 

        int pow = 1; 
        while (pow < y) 
            pow = pow * x; 
 
        return (pow == y); 
    } 
    
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int testcases=sc.nextInt();
	    
	    while(testcases--> 0)
	    {
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        
	        System.out.println(isPower(x,y)?1:0);
	    }
	 }
}