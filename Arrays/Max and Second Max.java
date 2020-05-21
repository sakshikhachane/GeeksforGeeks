/*
Given an array arr[] of size N of positive integers which may have duplicates. The task is to find the maximum and second maximum from the array, and both of them should be distinct, so If no second max exists, then the second max will be -1.

Input Format:
The first line of input contains the number of test cases T. For each test case, the first line of input contains the size of array N, the next line contains array elements.

Output Format:
For each test case, print the maximum and second maximum from the array. IF no second max exists, print "-1" for the second max.

User Task:
The task is to complete the function largestAndSecondLargest(), which should return maximum and second maximum element from the array with first element as maximum element and second element as second maximum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= arr[i] <= 106

Example:
Input:
3
5
1 2 3 4 5
3
2 1 2
2
5 5

Output:
5 4
2 1
5 -1

Explanation:
Testcase 1: From the given array elements, 5 is the largest and 4 is the second largest.
Testcase 2: From the given array elements, 2 is the largest and 1 is the second largest.
Testcase 3: From the given array elements, 5 is the largest and -1 is the second largest.
*/

/ { Driver Code Starts
    //Initial Template for Java
    
    /*package whatever //do not write package name here */
    
    import java.io.*;
    import java.util.*;
    
    
     // } Driver Code Ends
    
    
            
    
    //User function Template for Java
    
    // Solution class to implement function largestAndSecondLargest
    class ArrayMax{
        
        // Function to find largest and second largest element in the array
        static void largestAndSecondLargest(int sizeOfArray, int arr[]){
            
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            Arrays.sort(arr);
            max=arr[sizeOfArray-1];
            int flag=0;
            for(int i=sizeOfArray-2;i>=0;i--)
            {
                if(arr[i]!=max)
                {
                    flag=1;
                    max2=arr[i];
                    break;
                }
            }
            if(flag==0)
            {
                max2=-1;
            }
            System.out.println(max + " " + max2);
            
            
            
            
            
            
            
        }
    }
    
    // { Driver Code Starts.
    
    // Driver class
    class Array {
        
        // Driver code
        public static void main (String[] args) throws IOException{
            // Taking input using buffered reader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int testcases = Integer.parseInt(br.readLine());
            
            // looping through all testcases
            while(testcases-- > 0){
                int sizeOfArray = Integer.parseInt(br.readLine());
                
                int arr[] = new int[sizeOfArray];
                
                String line = br.readLine();
                String[] elements = line.trim().split("\\s+");
                
                for(int index = 0;index < sizeOfArray; index++){
                    arr[index] = Integer.parseInt(elements[index]);
                }
                
                ArrayMax obj = new ArrayMax();
                obj.largestAndSecondLargest(sizeOfArray, arr);
            }
        }
    }  // } Driver Code Ends