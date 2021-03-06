/*
You are given an array A, of N elements. You need to find minimum distance between given two integers x and y.

Distance: The distance (index-based) between two elements of the array.

Input Format:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. The first line of each test case contains an integer N denoting size array. Then in the next line are N space separated values of the array A. The last line of each test case contains two integers  x and y.

Output Format:
For each test case, print the required answer .

Your Task:
Your task is to complete the function minDist which returns  an integer denoting the minimum distance between two integers x and y in the array. If no such distance is possible then return -1.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 105
0 <= A, x, y <= 105

Example:
Input:
2
4
1 2 3 2
1 2
7
86 39 90 67 84 66 62 
42 12
Output:
1
-1

Explanation:
Testcase1: x = 1 and y = 2. There are two distances between x and y, which are 1 and 3 out of which the minDistance between x and y is 1.
Testcase2: x = 42 and y = 12. We return -1 as the x and y don't exist in the array.
*/

// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
class MinDist {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            long x = Long.parseLong(xy[0]);
            long y = Long.parseLong(xy[1]);
            GfG g = new GfG();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*Complete the function below*/
class GfG {
    long minDist(long arr[], long n, long x, long y) {
    
        int index_x=-1;
        int index_y=-1;
        long min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                index_x=i;
            }
            else if(arr[i]==y)
            {
                index_y=i;
            }
            
            if((index_x!=-1 && index_y!=-1)&& (min!=Math.abs(index_x-index_y)))
            {
                min=Math.min(min,Math.abs(index_x-index_y));
            }

        }
        
        if(index_x==-1 || index_y==-1)
        {
            return -1;
        }
        else
        {
            return min;
        }
    }
}
