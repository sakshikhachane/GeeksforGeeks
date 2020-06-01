package Arrays;

/*
Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each test case contains an integer n which denotes the number of houses. Next line contains space separated numbers denoting the amount of money in each house.

Output:
For each testcase, in a newline, print an integer which denotes the maximum amount he can take home.

Expected Time Complexity: O(N).
Expected Space Complexity: O(N).

Constraints:
1 <= T <= 200
1 <= n <= 104
1 <= a[i] <= 104

Example:
Input:
2
6
5 5 10 100 10 5
3
1 2 3
Output:
110
4

Explanation:
Testcase1:
5+100+5=110
Testcase2:
1+3=4
*/

// { Driver Code Starts
    import java.util.*;
    import java.io.*;
    
    class GFG
     {
        public static void main (String[] args)
         {
           
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while(t-- > 0){
              int n = sc.nextInt();
              int arr[] = new int[n];
              
              for(int i = 0; i<n; ++i)
                   arr[i] = sc.nextInt();
                
                System.out.println(new solve().FindMaxSum(arr, n));
         }
       }
    }// } Driver Code Ends
    
    
    class solve{
        // Function to return maximum of sum without adjacent elements
        public int FindMaxSum(int arr[], int n){
           if (n == 0)
            return 0;
     
            int value1 = arr[0];
            if (n == 1)
                return value1;
     
            int value2 = Math.max(arr[0], arr[1]);
            if (n == 2)
                return value2;
      
            // contains maximum stolen value at the end
            int max_val = 0;
     
            // Fill remaining positions
            for (int i=2; i<n; i++)
            {
                max_val = Math.max(arr[i]+value1, value2);
                value1 = value2;
                value2 = max_val;
            }
     
            return max_val;
        }
    }

    /*
    Algorithm:
Tackle some basic cases, if the length of the array is 0, print 0, if the length of the array is 1, print the first element, if the length of the array is 2, print maximum of two elements.

Create two variables value1 and value2 value1 as array[0] and value2 as maximum of array[0] and array[1] and a variable max_val to store the answer

Traverse the array from the second element to the end of array.

For every index, update max_val as maximum of value1 + array[i] and value2, this step defines the two cases, if an element is selected then the previous element cannot be selected and if an element is not selected then the previous element can be selected.

For every index, Update value1 = value2 and value2 = max_val

Print the value of max_val

    */