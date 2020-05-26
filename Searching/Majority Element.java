/*
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Input:  
The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.

Output: 
For each test case the output will be the majority element of the array. Output "-1" if no majority element is there in the array.

User Task:
The task is to complete the function findMajority() which finds the majority element in the array. If no majority exists, return -1.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T<= 100
1 <= N <= 107
0 <= Ai <= 106

Example:
Input:
2
5
3 1 3 3 2
3
1 2 3
Output:
3
-1

Explanation:
Testcase 1: Since, 3 is present more than N/2 times, so it is the majority element.
Testcase 2: Since, each element in {1,2,3} appears only once so there is no majority element.
 */


 // { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Majority().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Majority
{
    static int majorityElement(int a[], int size)
    {
        int max_index=0,max_element=-1;
        
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(!h.containsKey(a[i]))
            {
                h.put(a[i],1);
            }
            else{
                int count=(int)h.get(a[i]);
                h.put(a[i],count+1);
            }
        }
        
        Iterator itr = h.entrySet().iterator(); 

  
        while (itr.hasNext()) { 
            Map.Entry element = (Map.Entry)itr.next(); 
            int count = (int)element.getValue();
            
            if(count >(a.length/2)){
                max_element= (int)element.getKey();
                break;
            }
        } 
        
        return max_element;
    }
}

/*
Complexity Analysis:
Time Complexity: O(n).
One traversal of the array is needed, so the time complexity is linear.
Auxiliary Space : O(n).
Since a hashmap requires linear space.


(Using Moore’s Voting Algorithm): This method only works when the majority element does exist in the array. In the problem definition, it is said that the majority element may or may not exist but for applying this approach let's assume that the majority element does exist in the given input array.


Approach: This is a two-step process.
The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.
Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.

Step 1: Finding a Candidate The algorithm for the first phase that works in O(n) is known as Moore’s Voting Algorithm. Basic idea of the algorithm is that if each occurrence of an element e can be cancelled with all the other elements that are different from e then e will exist till end if it is a majority element.

Step 2: Check if the element obtained in step 1 is majority element or not. Traverse through the array and check if the count of the element found is greater than half the size of the array, then print the answer else print "No majority element".

Algorithm:

Loop through each element and maintains a count of majority element, and a majority index, maj_index
If the next element is same then increment the count if the next element is not same then decrement the count.
if the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
Now again traverse through the array and find the count of majority element found.
If the count is greater than half the size of the array, print the element
Else print that there is no majority element

*/

class MajorityElement 
{
    /* Function to print Majority Element */
    void printMajority(int a[], int size) 
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else 
            System.out.println("No Majority Element");
    }

    /* Function to find the candidate for Majority */
    int findCandidate(int a[], int size) 
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more
       than n/2 times */
    boolean isMajority(int a[], int size, int cand) 
    {
        int i, count = 0;
        for (i = 0; i < size; i++) 
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
    }

    /* Driver program to test the above functions */
    public static void main(String[] args) 
    {
        MajorityElement majorelement = new MajorityElement();
        int a[] = new int[]{1, 3, 3, 1, 2};
        int size = a.length;
        majorelement.printMajority(a, size);
    }
}

/*
Complexity Analysis:
Time Complexity: O(n).
As two traversal of the array is needed, so the time complexity is linear.

Auxiliary Space : O(1).
As no extra space is required
*/