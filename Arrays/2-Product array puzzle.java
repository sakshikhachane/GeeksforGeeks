package Arrays;
/*
Given an array A of size N, construct a Product Array P (of same size) such that P is equal to the product of all the elements of A except A[i].

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line is N. The second line contains N elements separated by spaces. It is guranteed that the product of all the elements of the array will not exceed 1e18.

Output:
For every test case, print the product array in a new line. If the array has only one element print 1. 

Your Task:
You do not have to read input. Your task is to complete productExceptSelf() function and returns the Product vector P that holds product except for self at each index.

Note: Try to solve this problem without using the division operation.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N <= 1000
0 <= Ai <= 200

Example:
Input:
2
5
10 3 5 6 2
2
12 0
Output:
180 600 360 300 900
0 12

Explanation:
Testcase1: For the product array P, at i=0 we have 3*5*6*2. At i=1 10*5*6*2. At i=2 we have 10*3*6*2. At i=3 we have 10*3*5*2. At i=4 we have 10*3*5*6
So P is 180 600 360 300 900
*/


// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        long[] product=new long[(int)n];
        
        long left[]=new long[n];
        long right[]=new long[n];
        left[0]=1;
        right[n-1]=1;
        
        
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*arr[i-1];
        }
        
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*arr[i+1];
        }
        
        for(int i=0;i<n;i++)
        {
            product[(int)i]=left[i]*right[i];
        }
        
        return product;
	} 
	
} 
//Another approach:
/*
class ProductArray {
    void productArray(int arr[], int n)
    {

        // Base case
        if (n == 1) {
            System.out.print("0");
            return;
        }

        int i, temp = 1;


        int prod[] = new int[n];

        for (int j = 0; j < n; j++)
            prod[j] = 1;

        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }


        temp = 1;


        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        return;
    }

    public static void main(String[] args)
    {
        ProductArray pa = new ProductArray();
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }
}

*/