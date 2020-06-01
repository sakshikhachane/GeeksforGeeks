/*

Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
    
}*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int testcases=sc.nextInt();
	    
	    while(testcases--> 0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        Arrays.sort(arr);
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	    }
	 }
}

// Use this approach:
// Java program to sort an array of 0, 1 and 2 
import java.io.*; 

class countzot { 

	// Sort the input array, the array is assumed to 
	// have values in {0, 1, 2} 
	static void sort012(int a[], int arr_size) 
	{ 
		int lo = 0; 
		int hi = arr_size - 1;   //lo must be 0, mid must be 1 and high must be 2
		int mid = 0, temp = 0; 
		while (mid <= hi) { 
			switch (a[mid]) { 
			case 0: { 
				temp = a[lo]; 
				a[lo] = a[mid]; 
				a[mid] = temp; 
				lo++; 
				mid++; 
				break; 
			} 
			case 1: 
				mid++; 
				break; 
			case 2: { 
				temp = a[mid]; 
				a[mid] = a[hi]; 
				a[hi] = temp; 
				hi--; 
				break; 
			} 
			} 
		} 
	} 

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int arr_size) 
	{ 
		int i; 
		for (i = 0; i < arr_size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(""); 
	} 

	/*Driver function to check for above functions*/
	public static void main(String[] args) 
	{ 
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int arr_size = arr.length; 
		sort012(arr, arr_size); 
		System.out.println("Array after seggregation "); 
		printArray(arr, arr_size); 
	} 
} 


//Approach 3 : count the number of 0's,1's and 2's
// Java program to sort an array of 0, 1 and 2 
import java.io.*; 

class countzot { 

	// Sort the input array, the array is assumed to 
	// have values in {0, 1, 2} 
	static void sort012(int a[], int arr_size) 
	{ 
		int lo = 0; 
		int hi = arr_size - 1; 
		int mid = 0, temp = 0; 
		while (mid <= hi) { 
			switch (a[mid]) { 
			case 0: { 
				temp = a[lo]; 
				a[lo] = a[mid]; 
				a[mid] = temp; 
				lo++; 
				mid++; 
				break; 
			} 
			case 1: 
				mid++; 
				break; 
			case 2: { 
				temp = a[mid]; 
				a[mid] = a[hi]; 
				a[hi] = temp; 
				hi--; 
				break; 
			} 
			} 
		} 
	} 

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int arr_size) 
	{ 
		int i; 
		for (i = 0; i < arr_size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(""); 
	} 

	/*Driver function to check for above functions*/
	public static void main(String[] args) 
	{ 
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int arr_size = arr.length; 
		sort012(arr, arr_size); 
		System.out.println("Array after seggregation "); 
		printArray(arr, arr_size); 
	} 
