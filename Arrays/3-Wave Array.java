package Arrays;

/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).

Input Format:
The first line contains an integer T, depicting total number of test cases. T testcases follow. The first line of each testcase contains an integer N depicting the size of the array. The second line contains N space separated elements of the array.

Output Format:
For each testcase, in a new line, print the array into wave-like array.

User Task:
The task is to complete the function convertToWave() which converts the given array to wave array. The newline is automatically added by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
0 ≤ A[i] ≤107

Example:
Input:
2
5
1 2 3 4 5
6
2 4 7 8 9 10

Output:
2 1 4 3 5
4 2 8 7 10 9

Explanation:
Testcase 1: Array elements after sorting it in wave form are 2 1 4 3 5.
Testcase 2: Array elements after sorting it in wave form are 4 2 8 7 10 9.
*/


// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class ArrayWave {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            
            while(t-->0)
            {
                int n = Integer.parseInt(br.readLine().trim());// taking size of array
                int arr[] = new int[n]; // declaring array of size n
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
                }
                
                Wave obj = new Wave();
                
                
                obj.convertToWave(arr, n);
                
                StringBuffer sb = new StringBuffer(); 
                for (int i = 0; i < n; i++) 
                    sb.append(arr[i] + " "); 
                    
                System.out.println(sb); // print array
            }
        }
    }
    
    
     // } Driver Code Ends
    
    
    class Wave{
        public static void convertToWave(int arr[], int n){
            for(int i=0;i<n-1;i=i+2)
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        
    }
    
    
    // { Driver Code Starts.
      // } Driver Code Ends