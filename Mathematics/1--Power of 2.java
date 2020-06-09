/*
Given a positive integer N. The task is to check if N is a power of 2. That is N is 2x for some x.

Input:
The first line contains T denoting the number of test cases. Each test case contains a single positive integer N.

Output:
Print "YES" if it is a power of 2 else "NO" (Without the double quotes).

Constraints:
1 <= T <= 100
0 <= N <= 1018

Example:
Input :
2
1
98

Output :
YES
NO

Explanation:
Testcase 1:  1 is equal to 2 raised to 0 (20 == 1).
*/

/*
// Java Program to find whether a 
// no is power of two 
class GFG { 
	/* Function to check if x is power of 2*/
	static boolean isPowerOfTwo(int n) 
	{ 
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) 
			== (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		if (isPowerOfTwo(31)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 

		if (isPowerOfTwo(64)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 
--------------------------------------------------------------

// Java program to find whether 
// a no is power of two 
import java.io.*; 

class GFG { 

	// Function to check if 
	// x is power of 2 
	static boolean isPowerOfTwo(int n) 
	{ 
		if (n == 0) 
			return false; 

		while (n != 1) { 
			if (n % 2 != 0) 
				return false; 
			n = n / 2; 
		} 
		return true; 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		if (isPowerOfTwo(31)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 

		if (isPowerOfTwo(64)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 

------------------------------------------------------------------------------
// Java program to efficiently 
// check for power for 2 

class Test { 
	/* Method to check if x is power of 2*/
	static boolean isPowerOfTwo(int x) 
	{ 
		/* First x in the below expression is 
		for the case when x is 0 */
		return x != 0 && ((x & (x - 1)) == 0); 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		System.out.println(isPowerOfTwo(31) ? "Yes" : "No"); 
		System.out.println(isPowerOfTwo(64) ? "Yes" : "No"); 
	} 
} 

