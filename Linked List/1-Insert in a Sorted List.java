/*
Given a sorted singly linked list and a data, your task is to insert the data in the linked list in a sorted way i.e. order of the list doesn't change.

Input:
The function takes 2 arguments as input, reference pointer to the head of the sorted single linked list and an integer data value which is to be inserted in the list.
There are multiple test cases and for each test case, the function will be called separately.

Output:
For each test, the output will be space-separated integers denoting the values of the linked list.

User Task:
The task is to complete the function sortedInsert() which should insert the element in sorted Linked List.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 104
-99999 <= A[i] <= 99999, for each valid i

Example:
Input:
2
6
25 36 47 58 69 80
19
2
50 100
75

Output:
19 25 36 47 58 69 80
50 75 100

Explanation:
Testcase 1: After inserting 19 at particular place, the linked list is like 19, 25, 36, 47, 58, 69, 80.
*/


// { Driver Code Starts


    import java.util.*;
    import java.io.*;
    
    class Node{
        int data;
        Node next;
        
        Node(int x){
            data = x;
            next = null;
        }
        
    }
    class GFG{
        static void printList(Node node) 
        { 
            while (node != null) 
            { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
            System.out.println(); 
        }
        public static void main(String args[]) throws IOException { 
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                Node head = new Node(sc.nextInt());
                Node tail = head;
                for(int i=0; i<n-1; i++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                int k = sc.nextInt();
                Solution g = new Solution();
                head = g.sortedInsert(head,k);
                printList(head); 
                t--;
            }
        } 
    } 
       // } Driver Code Ends
    
    
    /*class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }*/
    
    // sortedInsert method should return the head of the modified linked list.
    class Solution {
        Node sortedInsert(Node head1, int key) {
            Node p=head1;
            Node prev=head1;
            Node n=new Node(key);
            if(key<=p.data || head1==null)
            {
                
                n.next=p;
                head1=n;
            }
            else
            {
                while (p.next != null && 
                       p.next.data < key) 
                      p = p.next; 
      
                n.next = p.next; 
                p.next = n; 
                
            }
           
            
            return head1;
        }
    }