/*
Equilibrium point
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.
Note: The output should be based on 1-based indexing, i.e. if the equilibrium point occurs at 1st position then output would be 1.

User Task:
The task is to complete the function equilibriumPoint() which returns the point of equilibrium.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).
*/

// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Equilibrium {
    
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                long arr[] = new long[n];
                String inputLine[] = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Long.parseLong(inputLine[i]);
                }
    
                EquilibriumPoint obj = new EquilibriumPoint();
    
                System.out.println(obj.equilibriumPoint(arr, n));
            }
        }
    }// } Driver Code Ends
    
    
    class EquilibriumPoint {
    
    
        public static int equilibriumPoint(long arr[], int n) {
            
            long leftsum[]=new long[n];
            long rightsum[]=new long[n];
            
            leftsum[0]=0;
            for(int i=1;i<n;i++)
            {
                rightsum[0]+=arr[i];
            }
            
            if(leftsum[0]==rightsum[0])
            {
                return 1;
            }
            
            for (int i = 1; i < n; ++i) { 
                leftsum[i]=leftsum[i-1]+arr[i-1];
                
                rightsum[i]=rightsum[i-1]-arr[i];
                if(leftsum[i]==rightsum[i])
                {
                    return i+1;
                }
            } 
      
    
            return -1; 
            
        }
    }
    