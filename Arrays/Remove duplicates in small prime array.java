/*
Given an array consisting of only prime numbers, remove all duplicate numbers from it. 
Note: Retain the first occurrence of the duplicate element.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines, first of which contains N, the size of array. The second line contains N space separated elements of the array. 

Output:
Print the resultant array with no duplicate elements. 

Your Task:
Complete the function removeDuplicate() that takes given array and N as input parameters and returns modified array which has no duplicates.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1<=T<=200
1<=N=1000
2<=A[i]<100

Example:
Sample Input:
1
6
2 2 3 3 7 5

Sample Output:
2 3 7 5

Explanation:
After removing the duplicate 2 and 3 we get 2 3 7 5.
*/


// { Driver Code Starts
    import java.util.*;
    import java.util.Scanner;
    
    class GFG
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0; i<n; i++)
                {
                    arr[i] = sc.nextInt();
                }
                Solution g = new Solution();
                int result[] = g.removeDuplicate(arr,n);
                
                for(int i=0;i<result.length;i++)
                    System.out.print(result[i] + " ");
                System.out.println();
            t--;
            }
        }
    }
    
    
    // } Driver Code Ends
    
    
    
    class Solution
    {
        int[] removeDuplicate(int arr[], int n)
        {
            int duplicate=Integer.MIN_VALUE;
            int index=0;
            HashSet<Integer> h=new HashSet<Integer>();
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            
            for(int i=0;i<arr.length;i++)
            {
                if(!h.contains(arr[i]))
                {
                    h.add(arr[i]);
                    arr1.add(arr[i]);
                }
            }
            
            
            int arr2[]=new int[arr1.size()];
            for(int j=0;j<arr1.size();j++)
            {
                arr2[j]=(int)arr1.get(j);
            }
    
            return arr2;
        }
    }
    