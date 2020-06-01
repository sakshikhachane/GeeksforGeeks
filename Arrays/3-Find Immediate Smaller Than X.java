/*
Find Immediate Smaller Than X
Given an array arr[] of size N containing positive integers and an integer X. You need to find the value in the array which is smaller than X and closest to it. You will be given a function immediateSmaller() whose signature description given below:
immediateSmaller(arr, N, X): The parameters are array arr[], size of array - N and integer X.

Input Format: The input line contains T, denotes the number of testcases. Each testcases contains three lines. First line contains N. Second line contains elements of array space separated. Third line contains an integer X.

Output Format: For each testcase in new line, you need to print the element which is closest to it. If not found then print "-1" without quotes.

User Task: Since this is a functional problem you need to complete the given function immediateSmaller(). You don't have to worry about the input given. The printing is done by the driver code.

Constraints:
1 <= T <= 100
1 <= N <= 103
1 <= arr[i], X <= 104

Sample Input:
2
5
4 67 13 12 15
16
5
1 2 3 4 5
1

Sample Output:
15
-1

Explanation:
Testcase 1:  For a given value 16, there are four values which are smaller than it. But 15 is the number which is smaller and closest to it with minimum difference of 1.
Testcase 2: For a given value 1, no value is smaller than it and closest to it in the given array.
*/


// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            
            for(int i =0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            int x = Integer.parseInt(read.readLine());
            System.out.println(new Solution().immediateSmaller(arr, n, x));
        }
    }
}
// } Driver Code Ends

class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        Arrays.sort(arr);
        
        if(x<=arr[0])
        {
            return -1;
        }
        else if(x>arr[n-1])
        {
            return arr[n-1];
        }
        else
        {
            int smaller=-1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<x)
                {
                    smaller=arr[i];
                }
                else
                {
                    break;
                }
            }
            return smaller;
        }
        
        
    }
}
