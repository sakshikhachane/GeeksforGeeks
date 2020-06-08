/*
Given two numbers A and B. The task is to find out their LCM and GCD.

Input:
The first line of input contains an integer T denoting the number of testcases. T testcases follow. In each test cases, there are two numbers A and B separated by space.

Output:
For each testcase in a new line, print LCM and GCD separated by space.

Constraints:
1 <= T <= 104
1 <= A <= 108
1 <= B <= 108

Example:
Input:
2
5 10
14 8

Output:
10 5
56 2

Explanation:
Testcase 1: LCM and GCD of given numbers 5 and 10 are: 10 and 5.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static long lcm(long num1,long num2,long gcd)
     {
         return ((long)(num1*num2))/gcd;
     }
     
     static long gcd(long num1,long num2)
     {
         if(num1==0)
         {
             return num2;
         }
         return gcd(num2%num1,num1);
     }
     
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int testcases=sc.nextInt();
	    
	    while(testcases--> 0)
	    {
	        long num1=sc.nextLong();
	        long num2=sc.nextLong();
	        
	        long gcd1=gcd(num1,num2);
	        long lcm1=lcm(num1,num2,gcd1);
	        
	        
	        System.out.println(lcm1+" "+gcd1);
	    }
	 }
}