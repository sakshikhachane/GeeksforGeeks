/*
Given an array A of N integers. The task is to find a peak element in it in O( log N ) .
An array element is peak if it is not smaller than its neighbours. For corner elements, we need to consider only one neighbour.
Note: There may be multiple peak element possible, in that case you may return any valid index (0 based indexing).

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N. Then in the next line are N space separated values of the array.

Output:
For each test case output will be 1 if the index returned by the function is an index with peak element.

User Task:
You don't have to take any input. Just complete the provided function peakElement() and return the valid index.
Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= A[] <= 106

Example:
Input:
2
3
1 2 3
2
3 4
Output:
1
1

Explanation:
Testcase 1: In the given array, 3 is the peak element as it is greater than its neighbour.
Testcase 2: 4 is the peak element as it is greater than its neighbour elements.
 
*/

// { Driver Code Starts
    import java.util.*;
    class PeakElement{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int[] a=new int[n];
                for(int i=0;i<n;i++)
                    a[i]=sc.nextInt();
            
                int A=new Peak().peakElement(a,n);
                int f=0;
                if(n==1)
                f=1;
                else
                if(A==0 && a[0]>=a[1])
                f=1;
                else if(A==n-1 && a[n-1]>=a[n-2])
                f=1;
                else if(a[A] >=a[A+1] && a[A]>= a[A-1])
                f=1;
                else
                f=0;
                System.out.println(f);
            }
        }
    }// } Driver Code Ends
    
    
    /*Complete the function below*/
    
    class Peak
    {
        // Function to find the peak element
        // a[]: input array
        // n: size of array a[]
        public int peakElement(int[] arr,int n)
        {
            if(n>=2)
            {
                if(arr[0]>arr[1]){
                    return 0;
                }    
            }
            
           for(int i=1;i<n-1;i++)
           {
               if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
               {
                   return i;
               }
           }
           
           if(n>=2)
           {
               if(arr[n-1]>arr[n-2])
           {
               return n-1;
           }
           }
           
           
           return 0;
        }
    }


//Use this method:
/*
 Divide and Conquer can be used to find a peak in O(Logn) time. The idea is based on the technique of Binary Search to check if the middle element is the peak element or not. If the middle element is not the peak element, then check if the element on the right side is greater than the middle element then there is always a peak element on the right side. If the element on the left side is greater than the middle element then there is always a peak element on the left side. Form a recursion and the peak element can be found in log n time.

Algorithm:
Create two variables, l and r, initilize l = 0 and r = n-1
Iterate the steps below till l <= r, lowerbound is less than the upperbound
Check if the mid value or index mid = (l+r)/2, is the peak element or not, if yes then print the element and terminate.
Else if the element on the left side of the middle element is greater then check for peak element on the left side, i.e. update r = mid - 1
Else if the element on the right side of the middle element is greater then check for peak element on the right side, i.e. update l = mid + 1
*/

// A Java program to find a peak
// element using divide and conquer
import java.util.*;
import java.lang.*;
import java.io.*;

class PeakElement {
    // A binary search based function
    // that returns index of a peak element
    static int findPeakUtil(
        int arr[], int low, int high, int n)
    {
        // Find index of middle element
        // (low + high)/2
        int mid = low + (high - low) / 2;

        // Compare middle element with its
        // neighbours (if neighbours exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
            && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

        // If middle element is not peak
        // and its left neighbor is
        // greater than it, then left half
        // must have a peak element
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

        // If middle element is not peak
        // and its right neighbor
        // is greater than it, then right
        // half must have a peak
        // element
        else
            return findPeakUtil(
                arr, (mid + 1), high, n);
    }

    // A wrapper over recursive function
    // findPeakUtil()
    static int findPeak(int arr[], int n)
    {
        return findPeakUtil(arr, 0, n - 1, n);
    }

    // Driver method
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.println(
            "Index of a peak point is " + findPeak(arr, n));
    }
}
