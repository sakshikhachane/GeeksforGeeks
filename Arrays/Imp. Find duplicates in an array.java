/*
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N which denotes the number of elements in the array. The second line of each test case contains n space separated integers denoting elements of the array a[].

Output:
Print the duplicate elements from the given array. The order of the output should be in sorted order. Print -1 if no duplicate exists.

Your Task:
Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in sorted manner. If no such element is found return -1. 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
Note : The extra space is only for the array to be returned.
Try and perform all operation withing the provided array. 

Constraints:
1 <= T <= 100
1 <= N <= 105
0 <= A[i] <= N-1, for each valid i

Example:
Sample Input:
2
4
0 3 1 2
5
2 3 1 2 3 

Sample Output:
-1
2 3 

Explanation:
Testcase 1: N=4 and all elements from 0 to (N-1 = 3) are present in the given array. Therefore output is -1.
Testcase 2: 2 and 3 occur more than once in the given array.
*/


// { Driver Code Starts

    //Naive algo
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                Solution g = new Solution();
                ArrayList<Integer> ans = g.duplicates(a, n);
                for (Integer val : ans) System.out.print(val + " ");
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        public static ArrayList<Integer> duplicates(int arr[], int n) {
            ArrayList<Integer> list =new ArrayList<Integer>();
            int flag=0;
            Arrays.sort(arr);
            int duplicate=arr[0];
           
            for(int i=1;i<n;i++)
            {
                if(arr[i]==duplicate)
                {
                    flag=1;
                    if(!list.contains(arr[i]))
                    {
                         list.add(arr[i]);
                    }
                   
                }
                else
                {
                    duplicate=arr[i];
                }
            }
            if(flag==0)
            {
                list.add(-1);
            }
            return list;
        }
    }
    


    //Better algo if array consists of 0 to n-1 elements only
    /*
    Approach:
    The elements in the array is from 0 to n-1 and all of them are positive. So to find out the duplicate elements, a HashMap is required, but the question is to solve the problem in constant space. There is a catch, the array is of length n and the elements are from 0 to n-1 (n elements).
     The array can be used as a HashMap.
    Algorithm:
    Traverse the array from start to end.
    For every element,take its absolute value and if the abs(array[i])‘th element is positive, the element has not encountered before, else if negative the element has been encountered before print the absolute value of the current element.
    */

    // Java code to find 
// duplicates in O(n) time 

class FindDuplicate 
{ 
// Function to print duplicates 
	void printRepeating(int arr[], int size) 
	{ 
		int i; 
		System.out.println("The repeating elements are : "); 
	
		for (i = 0; i < size; i++) 
		{ 
			if (arr[ Math.abs(arr[i])] >= 0) 
				arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
			else
				System.out.print(Math.abs(arr[i]) + " "); 
		}		 
	} 

	// Driver program 
	public static void main(String[] args) 
	{ 
		FindDuplicate duplicate = new FindDuplicate(); 
		int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
		int arr_size = arr.length; 

		duplicate.printRepeating(arr, arr_size); 
	} 
} 


    //Approach when array elements are from 0 to n-1
    /*
        Algorithm:
        Traverse the given array from start to end.
        For every element in the array increment the arr[i]%n‘th element by n.
        Now traverse the array again and print all those indices i for which arr[i]/n is greater than 1. Which guarantees that the number n has been added to that index.
        
        Note: This approach works because all elements are in the range from 0 to n-1 and arr[i]/n would be greater than 1 only if a value “i” has appeared more than once.
    */
    import java.util.*; 
class GFG{ 
  
// function to find repeating elements 
static void printRepeating(int arr[], int n) 
{ 
    // First check all the values that are 
    // present in an array then go to that 
    // values as indexes and increment by 
    // the size of array 
    for (int i = 0; i < n; i++) 
    { 
        int index = arr[i] % n; 
        arr[index] += n; 
    } 
  
    // Now check which value exists more 
    // than once by dividing with the size 
    // of array 
    for (int i = 0; i < n; i++) 
    { 
        if ((arr[i]/n) > 1) 
            System.out.println(i +" "); 
    } 
} 
  
// Driver's code 
public static void main(String args[]) 
{ 
    int arr[] = {1, 6, 3, 1, 3, 6, 6}; 
    int arr_size = arr.length; 
  
    System.out.println("The repeating elements are: "); 
    printRepeating( arr, arr_size); 
} 
} 
