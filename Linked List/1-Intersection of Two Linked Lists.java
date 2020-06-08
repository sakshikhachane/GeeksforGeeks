/*
Given two linked lists, the task is to complete the function findIntersection(), that returns the intersection of two linked lists. Each of the two linked list contains distinct node values.

Input:
First line of input contains number of test cases T. Then T test cases follow.
In each test case, first line contains the number n, i.e. number of nodes in list 1 and second lines contains the n space separated values of the nodes.
Similarly, third line contains m, i.e. number of nodes in list 2 and fourth line of test case contains the data of m nodes of list 2.

Output:
The intersection list will be printed in a new line for each test case.
Note: The order of nodes in this list should be same as the order in which those particular nodes appear in input list 1.

User Task:
You task is to complete the function findIntersection() which takes the heads of the 2 input linked lists as parameter and returns the head of intersection list. Returned list will be automatically printed by driver code.

Constraints:
1 <= T <= 1000
1 <= n,m <= 103

Expected time complexity: O(m+n)
Expected auxiliary space: O(m+n)

Example:
Input:
1
6
9 6 4 2 3 8
4
1 2 8 6
Output:
6 2 8
*/

// { Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/
class Sol
{
    public Node findIntersection(Node head1, Node head2)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        Node p=head2;
        
        while(p!=null)
        {
            h.add(p.data);
            p=p.next;
        }
        
        p=head1;
        Node prev=null;
        while(p.next!=null)
        {
            if(h.contains(p.data))
            {
                h.remove(p.data);
            	prev=p;
            	p=p.next;   
               
            }
            else
            {
                if(p==head1)
                {
                    p=p.next;
                    head1=p;
                }
                else
                {
                    prev.next=p.next;
                    p=p.next;
                }
            }
        }
        if(h.contains(p.data))
        {
        
        	prev=p;
        	p=p.next;
           
        }
        else
        {
            if(p==head1)
            {
                p=p.next;
                head1=p;
            }
            else
            {
                prev.next=p.next;
                p=p.next;
            }
        }
        return head1;
    }
}