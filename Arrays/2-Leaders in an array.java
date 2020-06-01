/*
Leaders in an array
Given an array A of positive integers. Your task is to find the leaders in the array.

Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, the leaders will be printed.

User Task:
The task is to complete the function leader() which returns an array of leaders in same order as they appear in the array. The printing is automatically done by driver code.

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 107

Example:
Input:
4
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
3
4 1 4

Output:
17 5 2
4 0
7 7 3
4 4

Explanation:
Testcase 1: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next leader is 5. The right most element is always a leader so it is also included.
Testcase 2: 4 and 0 are leaders.
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements of right side of 7 (at index 3) are smaller than 7. And, the last element 3 is itself a leader since no elements are on its right.
Testcase 4: 4 is equal to the 4 on its right so we make it a leader. The other 4 is rightmost so it is also a leader.
*/


// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Array {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            
            while(t-->0){
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                
                Leader obj = new Leader();
                
                StringBuffer str = new StringBuffer();
                ArrayList<Integer> res = new ArrayList<Integer>();
                res = obj.leaders(arr, n);
                
                for(int i=0; i<res.size(); i++){
                    str.append(res.get(i)+" ");
                }
                System.out.println(str);
            }
            
        }
    }
    // } Driver Code Ends
    
    
    class Leader{
        
        // This functions find the leaders in the array and returns
        // arraylist containing the leaders
        // arr: input array
        // n: size of array
        static ArrayList<Integer> leaders(int arr[], int n){
           
            ArrayList<Integer> leaders1 = new ArrayList<Integer>();
            
            int largest=arr[n-1];
            leaders1.add(largest);
            
            for(int i=n-2;i>=0;i--)
            {
                if(largest<=arr[i])
                {
                    largest= arr[i];
                    leaders1.add(largest);
                }
            }
            Collections.reverse(leaders1); 
                
                return leaders1;
         
        }
        
    }
    