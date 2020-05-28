/*
Given an array of size N-1 such that it can only contain distinct integers in the range of 1 to N. Find the missing element.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N denoting the size of the array. The subsequent line contains N-1 space separated array elements.

Output:
Print the missing number.

Your Task :
Complete the function MissingNumber() that takes array and N as input and returns the value of the missing number.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 106
1 ≤ array[i] ≤ 106

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
Testcase 2: Given array : 1 2 3 4 5 6 7 8 10. Missing element is 9.

*/

//Method 1:
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        HashSet<Integer> h=new HashSet<Integer>();
        
        for(int i=0;i<n-1;i++)
        {
            h.add(array[i]);
        }
        
        for(int i=1;i<=n;i++)
        {
            if(!h.contains(i))
            {
                return i;
            }
        }
        
        return -1;
    }
}

//Method 2:
/*
Approach: XOR has certain properties
Assume a1 ^ a2 ^ a3 ^ ...^ an = a and a1 ^ a2 ^ a3 ^ ...^ an-1 = b
Then a ^ b = an
Using this property, the missing element can be found. Calculate XOR of all the natural number from 1 to n and store it as a. Now calculate XOR of all the elements of the array and store it as b. The missing number will be a ^ b.
^ is XOR operator.

Algorithm:
Create two variables a = 0 and b = 0
Run a loop from 1 to n with i as counter.
For every index update a as a = a ^ i
Now traverse the array from start to end.
For every index update b as b = b ^ array[i]
Print the missing number as a ^ b.
 */

class Main {
    // Function to find missing number
    static int getMissingNo(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        /* For xor of all the elements 
           in array */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        /* For xor of all the elements 
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }

    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = { 1, 2, 4, 5, 6 };
        int miss = getMissingNo(a, 5);
        System.out.println(miss);
    }
}
