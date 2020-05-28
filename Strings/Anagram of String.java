/*
Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of 2 strings to make the anagrams.

Output Format:
For each testcase, in a new line, output the minimum number of characters to be deleted to make both the strings anagram.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function.

Constraints:
1 <= T <= 100
1 <= |S1|, |S2| <= 105

Example:
Input:
2
bcadeh
hea
cddgk
gcd

Output:
3
2
*/

//Approach 1:
// { Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
            HashMap<Character,Integer> h=new HashMap<Character,Integer>();
            HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
            
            for(int i=0;i<s.length();i++)
            {
                if(!h.containsKey(s.charAt(i)))
                {
                    h.put(s.charAt(i),1);
                }
                else
                {
                    int count=(int) h.get(s.charAt(i));
                    h.put(s.charAt(i),count+1);
                }
            }
            int count=0;
            for(int i=0;i<s1.length();i++)
            {
                if(h.containsKey(s1.charAt(i)))
                {
                    int cnt=(int)h.get(s1.charAt(i))-1;
                    if(cnt==0)
                    {
                        h.remove(s1.charAt(i));
                    }
                    else
                    {
                        h.put(s1.charAt(i),cnt);
                    }
                }
                else
                {
                    count++;
                }
            }
            
            Iterator itr=h.entrySet().iterator();
            
            while(itr.hasNext())
            {
                Map.Entry element = (Map.Entry)itr.next();
                int cnt=(int)element.getValue();
                count+=cnt;
            }
            
            
            return count;
        }
}


//Approach 2:
// Java implementation to count number of deletions 
// required from two strings to create an anagram 

class GFG { 

	final static int CHARS = 26; 

	static int countDeletions(String str1, String str2) { 
		int arr[] = new int[CHARS]; 
		for (int i = 0; i < str1.length(); i++) { 
			arr[str1.charAt(i) - 'a']++; 
		} 

		for (int i = 0; i < str2.length(); i++) { 
			arr[str2.charAt(i) - 'a']--; 
		} 

		int ans = 0; 
		for (int i = 0; i < CHARS; i++) { 
			ans += Math.abs(arr[i]); 
		} 
		return ans; 
	} 

	static public void main(String[] args) { 
		String str1 = "bcadeh", str2 = "hea"; 
		System.out.println(countDeletions(str1, str2)); 
	} 
} 

