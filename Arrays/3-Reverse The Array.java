/*
Reverse The Array
Given an array arr of size n. You need to reverse the array.

Input Format: 
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two line input, 1st line is the size of array and the 2nd line is the integer array elements.

Output Format: 
For each testcase, in a new line, print the reversed array.

Your Task:
This is a function problem. You just need to complete the function reverseArray that takes arr and n as parameters and reverses arr. The driver code then prints arr.

Constraints:
1 <= T <= 100
1 <= n  <= 106
1 <= arri <= 106

Example:
Input:
2
5
1 1 2 2 3
2
4 2
Output:
3 2 2 1 1
2 4

Explanation:
Testcase 1: The array is {1 1 2 2 3}. The reversed array is {3 2 2 1 1}.
Testcase 2: The array is {4 2} and the reversed array is {2 4}.
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
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            obj.reverseArray(input, n);
            
            for(int i = 0; i < n; i++)
                System.out.print(input[i] + " ");
                
            System.out.println();
            
        }
    }
} 

// } Driver Code Ends


//User function Template for Java

class Get
{
    public static void reverseArray(int arr[], int n)
    {
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
      
      
    }
}

