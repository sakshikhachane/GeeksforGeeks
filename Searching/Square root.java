/*
Given an integer x. The task is to find the square root of x. If x is not a perfect square, then return floor(√x).

Input:
First line of input contains number of testcases T. For each testcase, the only line contains the number x.

Output:
For each testcase, print square root of given integer.

Your Task:
The task is to complete the function floorSqrt() which should return the square root of given number x.
Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 10000
1 ≤ x ≤ 107

Example:
Input:
2
5
4
Output:
2
2

Explanation:
Testcase 1: Since, 5 is not perfect square, so floor of square_root of 5 is 2.
Testcase 2: Since, 4 is a perfect square, so its square root is 2.
*/

// { Driver Code Starts
    import java.util.Scanner;

    class SquartRoot
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                long a = sc.nextInt();
                SquareRoot obj = new SquareRoot();
                System.out.println(obj.floorSqrt(a));
            t--;
            }
        }
    }// } Driver Code Ends
    
    
    /*You are required to complete
    this function*/
    
    // Function to find square root
    // x: element to find square root
    class SquareRoot
    {
         long floorSqrt(long x)
         {
            return (long)Math.sqrt(x);
         }
    }

    
    /*
    // A Java program to find floor(sqrt(x) 
public class Test 
{ 
	public static int floorSqrt(int x) 
	{ 
		// Base Cases 
		if (x == 0 || x == 1) 
			return x; 

		// Do Binary Search for floor(sqrt(x)) 
		int start = 1, end = x, ans=0; 
		while (start <= end) 
		{ 
			int mid = (start + end) / 2; 

			// If x is a perfect square 
			if (mid*mid == x) 
				return mid; 

			// Since we need floor, we update answer when mid*mid is 
			// smaller than x, and move closer to sqrt(x) 
			if (mid*mid < x) 
			{ 
				start = mid + 1; 
				ans = mid; 
			} 
			else // If mid*mid is greater than x 
				end = mid-1; 
		} 
		return ans; 
	} 

	// Driver Method 
	public static void main(String args[]) 
	{ 
		int x = 11; 
		System.out.println(floorSqrt(x)); 
	} 
} 

Complexity Analysis:
Time complexity: O(log n).
The time complexity of binary search is O(log n).
Space Complexity: O(1).
Constant extra space is needed.
    */