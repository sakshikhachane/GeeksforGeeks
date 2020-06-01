/*
Given an array of distinct elements. Find the third largest element in it. 

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case is N, size of the array. The second line of each test case contains N space separated values of the array a[].

Output:
Print the third largest element of the array. If the array has less than 3 elements print -1. 

Your Task:
You don't need to read input or print anything. Your task is to complete the function thirdLargest() which takes the array a[] and the size of the array as inputs and returns the third largest element in the array. Return -1 if there are less than 3 elements in the input.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105

Example:
Sample Input:
2
5
2 4 1 3 5
2
10 2

Sample Output:
3
-1

Explanation:
Test Case 1: Largest number is 5, followed by 4 and then 3. Hence, the answer is 3.
Test Case 2: Since there are less than 3 numbers, output is -1.
*/

// { Driver Code Starts
    import java.util.Scanner;
    import java.util.*;
    import java.io.*;
    
    
    
    
    class ThirdLargestElement
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                long n =sc.nextLong();
                Long arr[] = new Long[(int)n];
                for(long i=0;i<n;i++)
                    arr[(int)i] = sc.nextLong();
                GfG g = new GfG();
                System.out.println(g.thirdLargest(arr));
            t--;
            }
        }
    }// } Driver Code Ends
    
    
    class GfG
    {
        long thirdLargest(Long a[])
        {
            if(a.length<3)
         {
             return -1;
         }
         else
         {
             Arrays.sort(a);
             return a[a.length-3];
         }
        }
    }
    
/*
// Java program to find third Largest element in an array 
class GFG { 
  
    static void thirdLargest(int arr[], int arr_size) { 
         There should be atleast three elements 
        if (arr_size < 3) { 
            System.out.printf(" Invalid Input "); 
            return; 
        } 
  
        // Initialize first, second and third Largest element 
        int first = arr[0], second = Integer.MIN_VALUE, 
                            third = Integer.MIN_VALUE; 
  
        // Traverse array elements to find the third Largest 
        for (int i = 1; i < arr_size; i++) { 
            /* If current element is greater than first, 
        then update first, second and third 
            if (arr[i] > first) { 
                third = second; 
                second = first; 
                first = arr[i]; 
            } /* If arr[i] is in between first and second 
            else if (arr[i] > second) { 
                third = second; 
                second = arr[i]; 
            } /* If arr[i] is in between second and third 
            else if (arr[i] > third) { 
                third = arr[i]; 
            } 
        } 
  
        System.out.printf("The third Largest element is %d\n", third); 
    } 
  
    /* Driver program to test above function 
    public static void main(String []args) { 
        int arr[] = {12, 13, 1, 10, 34, 16}; 
        int n = arr.length; 
        thirdLargest(arr, n); 
    } 
} 
 */