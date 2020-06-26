/*
Given an array of positive integers. The task is to find inversion count of array.

Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, the size of array. The second line of each test case contains N elements.

Output:
Print the inversion count of array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
1 ≤ C ≤ 1018

Example:
Input:
1
5
2 4 1 3 5

Output:
3

Explanation:
Testcase 1: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
*/

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
	        long count=0;
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        count=mergesort(arr,0,arr.length-1);
	        System.out.println(count);
	        
	    }
	 }
	 static long mergesort(int[] arr,int l,int r)
	 {
	     long count=0;
	     if(l<r)
	     {
	         int m=(l+r)/2;
	         count+=mergesort(arr,l,m);
	         count+=mergesort(arr,m+1,r);
	         count+=merge(arr,l,m,r);
	     }
	     return count;
	 }
	 
	 static long merge(int[] arr, int l,int m,int r)
	 {
	     long count=0;
	     int left[]=Arrays.copyOfRange(arr,l,m+1);
	     int right[]=Arrays.copyOfRange(arr,m+1,r+1);
	     
	     int i=0,j=0,k=l;
	     while((i<left.length) && (j<right.length))
	     {
	         if(left[i]>right[j])
	         {
	             arr[k++]=right[j++];
	             count=count+(long)(m+1)-(long)(l+i);
	         }
	         else
	         {
	            arr[k++]=left[i++];
	         }
	     }
	     
	     while(i<left.length)
	     {
	        arr[k++]=left[i++];
	     }
	     
	     while(j<right.length)
	     {
	        arr[k++]=right[j++];
	     }
	     
	     
	     return count;
	 }
}