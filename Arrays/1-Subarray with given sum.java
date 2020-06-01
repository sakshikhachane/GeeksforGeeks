/*
Subarray with given sum
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

User Task:
The task is to complete the function subarraySum() which finds starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else -1 is printed. The driver code automatically appends a new line.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= Ai <= 1010

Example:
Input:
3
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
4 15
5 7 1 2
Output:
2 4
1 5
1 4

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12.
Testcase2: sum of elements from 1st position to 5th position is 15.
Testcase 3: Sum of elements from 1st to 4th position is 15.
*/



// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class Array{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int t = sc.nextInt();
    
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int s = sc.nextInt();
    
                int[] m = new int[n];
                for (int j = 0; j < n; j++) {
                    m[j] = sc.nextInt();
                }
                
                Subarray obj = new Subarray();
                obj.subarraySum(n, s, m);
                System.out.println();
            }
        }
    
    }// } Driver Code Ends
    
    
    class Subarray{
        
        // Function to find subarray with given sum
        static void subarraySum(int n, int sum, int[] arr) {
            
       int curr_sum, i, j,flag=0; 
      
            // Pick a starting point 
            for (i = 0; i < n; i++)  
            { 
                curr_sum = arr[i]; 
      
                // try all subarrays starting with 'i' 
                for (j = i + 1; j <= n; j++)  
                { 
                    if (curr_sum == sum)  
                    { 
                        int p = j - 1;
                        flag=1;
                        System.out.print((i+1) + " " + (p+1)); 
                        break;
                    } 
                    if (curr_sum > sum || j == n) 
                        break; 
                    curr_sum = curr_sum + arr[j]; 
                } 
                if(flag==1)
                {
                    break;
                }
            } 
            if(flag==0)
            {
                System.out.print("-1");
            }
        }
    }