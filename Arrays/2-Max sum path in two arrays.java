/*
You are given two sorted arrays A and B, where elements of the arrays denote the prize you get on visiting the cell. You need to find the maximum prize you can get if you can start from the leftmost position of either of the arrays and end at rightmost position of the either of the arrays. The condition is you can only move towards the right cell and change the current array to another array by jumping to the first occurrence of the element having the same prize value as the current cell.
Note: The common jumping cells should be considered as one instead of two, i.e, add the value on jumping once not twice.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T cases follow.
Each test case contains 3 lines. The first line contains two space-separated integers l1 and l2 denoting the length of the two sorted array A and B. In the second line is the space-separated values of array A and in the third line are space-separated values of array B.

Output:
For each test case, the output is the max sum obtained in such a fashion.

User Task:
Complete the function max_path_sum that takes 4 arguments, the first two arguments represent the 2 arrays A[] and B[] and the last two arguments l1, l2 denotes the size of array A and B respectively. The function returns the sum of the maximum sum path to reach from the beginning of any array to end of any of the two arrays.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N, M <= 105
1 <= A[], B[] <= 106

Example:
2
5 4
2 3 7 10 12
1 5 7 8 
3 3
1 2 4
1 2 7

Output
35 
10

Explanation:
Testcase 1: For first test case the path will be 1+5+7+10+12 = 35.
Testcase 2: For the second test case the path will be 1+2 +7=10.

*/


// { Driver Code Starts
    import java.util.*;

    class ArrPathSum1
    {
        // Driver Code
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            
            while(T>0)
            {
                int m = sc.nextInt();
                int n = sc.nextInt();
                int ar1[] = new int[m];
                int ar2[] = new int[n];
                for(int i=0; i<m; i++)
                    ar1[i] = sc.nextInt();
                for(int i=0; i<n; i++)
                    ar2[i] = sc.nextInt();
            
            GfG g = new GfG();
            System.out.println(g.maxPathSum(ar1,ar2));
            T--;
            }
        }
    }// } Driver Code Ends
    
    
    class GfG
    {
        int maxPathSum(int ar1[], int ar2[])
        {
            int i = 0, j = 0; 
      
            int result = 0, sum1 = 0, sum2 = 0,m=ar1.length,n=ar2.length; 
      
            while (i < m && j < n)  
            { 
                if (ar1[i] < ar2[j]) 
                    sum1 += ar1[i++]; 
    
                else if (ar1[i] > ar2[j]) 
                    sum2 += ar2[j++]; 
      
                else
                { 
                    result += Math.max(sum1, sum2); 
      
                    sum1 = 0; 
                    sum2 = 0; 
    
                    while (i < m && j < n && ar1[i] == ar2[j])  
                    { 
                        result = result + ar1[i++]; 
                        j++; 
                    } 
                } 
            } 
     
            while (i < m) 
                sum1 += ar1[i++]; 
    
            while (j < n)  
                sum2 += ar2[j++]; 
     
            result += Math.max(sum1, sum2); 
      
            return result; 
        }
    }