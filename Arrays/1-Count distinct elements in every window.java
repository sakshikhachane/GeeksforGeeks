/*
Count distinct elements in every window
Given an array A[] of size N and an integer K. Your task is to complete the function countDistinct() which prints the count of distinct numbers in all windows of size k in the array A[].

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two integers N and K. Then in the next line are N space separated values of the array A[].

Output:
For each test case in a new line print the space separated values denoting counts of distinct numbers in all windows of size k in the array A[].

Constraints:
1 <= T <= 100
1 <= N <= K <= 105
1 <= A[i] <= 105 , for each valid i

Example(To be used only for expected output):
Input:
2
7 4
1 2 1 3 4 2 3
3 2
4 1 1

Output:
3 4 4 3
2 1
*/


// { Driver Code Starts
    import java.util.Scanner;
    import java.util.*;
    import java.io.*;
    import java.util.HashMap;
    
    class CountELements {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                // int k = sc.nextInt();
    
                GfG g = new GfG();
                g.countDistinct(a, k, n);
                System.out.println();
    
                t--;
            }
        }
    }// } Driver Code Ends
    
    
    
    class GfG {
         static void countDistinct(int arr[], int k,int n)
        {
            HashMap<Integer, Integer> hM=
                          new HashMap<Integer, Integer>();
    
          
            int dist_count = 0;
    
            for (int i = 0; i < k; i++)
            {
                if (hM.get(arr[i]) == null)
                {
                    hM.put(arr[i], 1);
                    dist_count++;
                }
                else
                {
                   int count = hM.get(arr[i]);
                   hM.put(arr[i], count+1);
                }
            }
    
            System.out.print(dist_count+" ");
    
            for (int i = k; i < arr.length; i++)
            {
    
                if (hM.get(arr[i-k]) == 1)
                {
                    hM.remove(arr[i-k]);
                    dist_count--;
                }
                else 
                {
                   int count = hM.get(arr[i-k]);
                   hM.put(arr[i-k], count-1);
                }
    
                if (hM.get(arr[i]) == null)
                {
                    hM.put(arr[i], 1);
                    dist_count++;
                }
                else 
                {
                   int count = hM.get(arr[i]);
                   hM.put(arr[i], count+1);
                }
    
                System.out.print(dist_count+" ");
            }
        }
    }