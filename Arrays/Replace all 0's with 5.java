/*
You are given an integer N. You need to convert all zeroes of N to 5.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a single integer N denoting the number.

Output Format:
For each test case, there will be a new line containing an integer where all zero's are converted to 5.

Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.
Expected Time Complexity: O(log10N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= n <= 10000

Example:
Input
2
1004
121
Output
1554
121
Explanation:
Test Case 1: There are two zeroes in "1004", on replacing all zeroes with "5", the new number will be "1554".
Test Case 2: Since there are no zeroes in "121", the number remains as "121".
*/

// { Driver Code Starts
    import java.util.Scanner;
    import java.lang.Math;
    
    class Convert_To_Five {
        static GfG g = new GfG();

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int N = sc.nextInt();
                System.out.println(g.convertfive(N));
                T--;
            }
        }
    }// } Driver Code Ends
    
    
    class GfG {
        int convertfive(int num) {
            String number = String.valueOf(num);
            StringBuilder sb = new StringBuilder(number);
            StringBuilder sb1 = new StringBuilder();
            
            for(int i=0;i<sb.length();i++)
            {
                if(sb.charAt(i)=='0')
                {
                    sb1.append('5');
                }
                else
                {
                    sb1.append(sb.charAt(i));
                }
            }
            
             return Integer.parseInt(sb1.toString());
        }
    }


/* GFG SOLUTION:
public class ReplaceDigits {
    static int replace0with5(int number)
    {
        return number += calculateAddedValue(number);
    }

    // returns the number to be added to the
    // input to replace all zeroes with five
    private static int calculateAddedValue(int number)
    {

        // amount to be added
        int result = 0;

        // unit decimal place
        int decimalPlace = 1;

        if (number == 0) {
            result += (5 * decimalPlace);
        }

        while (number > 0) {
            if (number % 10 == 0)
                // a number divisible by 10, then
                // this is a zero occurrence in the input
                result += (5 * decimalPlace);

            // move one decimal place
            number /= 10;
            decimalPlace *= 10;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.print(replace0with5(1020));
    }
}


*/