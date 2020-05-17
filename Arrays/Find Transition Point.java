/*
Find Transition Point
You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. Transition point is a point where "0" ends and "1" begins.
Note that, if there is no "1" exists, print -1.

Input:

You have to complete the method which takes 2 argument: the array arr[] and size of array N. You should not read any input from stdin/console. There are multiple test cases. For each test cases, this method will be called individually.

Output:
Your function should return transition point.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 500000
0 ≤ C[i] ≤ 1

Example:
Input
1
5
0 0 0 1 1

Output
3
*/

//Approach 1:
// { Driver Code Starts
    import java.util.*;

    class Sorted_Array {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                GfG obj = new GfG();
                System.out.println(obj.transitionPoint(arr, n));
                T--;
            }
        }
    }// } Driver Code Ends
    
    
    
    class GfG {
        int transitionPoint(int arr[], int n) {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==1)
                {
                    return i;
                }
            }
            return -1;
        }
    }

    