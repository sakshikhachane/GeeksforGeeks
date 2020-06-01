package Arrays;

/*
Given a binary array A[] of size N. The task is to arrange the array in increasing order.

Note: The binary array contains only 0  and 1.

Input:
The first line of input contains an integer T, denoting the test cases. Every test case contains two lines, the first line is N(size of the array) and the second line is space-separated elements of the array.

Output:
Space-separated elements of sorted arrays. There should be a new line between the output of every test case.

Your Task:
Complete the function SortBinaryArray() which takes given array as input and returns the sorted array. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Challenge: Try doing it in one pass.

Constraints:
1 < = T <= 100
1 <= N <= 106
0 <= A[i] <= 1

Example:
Input:
2
5
1 0 1 1 0
10
1 0 1 1 1 1 1 0 0 0
Output:
0 0 1 1 1
0 0 0 0 1 1 1 1 1 1
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
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    int index=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==0)
	        {
	            arr[index++]=0;
	        }
	    }
	    
	    for(int i=index;i<n;i++)
	    {
	        arr[i]=1;
	    }
	    
	    return arr;
	} 
} 
