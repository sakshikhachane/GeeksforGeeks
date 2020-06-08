/*
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

User Task:
The task is to complete the function reverseWords() which reverse words from the given string and prints the answer. The newline is automatically appended by the driver code.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno
Output:
much.very.program.this.like.i
mno.pqr

Explanation:
Testcase 1: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i.
Testcase 2: After reversing the whole string , the input string becomes mno.pqr.
*/

// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class GFG {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while (test > 0) {
                String s = sc.next();
    
                Reverse obj = new Reverse();
                obj.reverseWords(s);
                 System.out.println();
    
                test--;
            }
        }
    }
    // } Driver Code Ends
    
    
    class Reverse {
    
        public static void reverseWords(String s) {
            String arr[]=s.split("\\.");
            int i=0,n=arr.length-1;
            while(i<n)
            {
                String t=arr[i];
                arr[i]=arr[n];
                arr[n]=t;
                n--;
                i++;
            }
            
            String res=String.join(".",arr);
            System.out.print(res);
            
          
        }
    }