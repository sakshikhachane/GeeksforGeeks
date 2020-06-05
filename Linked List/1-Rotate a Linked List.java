/*
Given a singly linked list of size N. The task is to rotate the linked list counter-clockwise by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Input:
The first line of input contains the number of testcases T. For each test case, the first line of input contains the length of a linked list and the next line contains linked list elements and the last line contains k, by which linked list is to be rotated.

Output:
For each test case, print the rotated linked list.

User Task:
The task is to complete the function rotate() which takes a head reference as the first argument and k as the second argument. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 103
1 <= k <= 103

Example:
Input:
2
8
1 2 3 4 5 6 7 8
4
5
2 4 7 8 9
3
Output:
5 6 7 8 1 2 3 4
8 9 2 4 7

Explanation:
Testcase 1: After rotating the linked list by 4 elements (anti-clockwise), we reached to node 5, which is (k+1)th node from beginning, now becomes head and tail of the linked list is joined to the previous head.
Testcase 2: After rotating the linked list by 3 elements (anti-clockwise), we will get the resulting linked list as 8 9 2 4 7.

 */
// { Driver Code Starts
    import java.util.*;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    } 
    
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Node head = null;
                Node tail = null;
                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    if(i==0)
                    {
                        head = new Node(a);
                        tail = head;
                    }
                    else{
                        tail.next = new Node(a);
                        tail = tail.next;
                    }
                }
                int k = sc.nextInt();
                Rotate g = new Rotate();
                head = g.rotate(head,k); // rotate linked list anti-clockwise by k nodes
                printList(head);
            }
        }
        public static void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
    }
    // } Driver Code Ends
    
    
    /*Complete the function below
    Node is as follows:
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    */
    class Rotate {
        
         /*  This function should rotate list counter-
        clockwise by k and return new head (if changed) */
        public Node rotate(Node head, int k) {
            
            if (k == 0) return null; 
      
            // Let us understand the below code for example k = 4 
            // and list = 10->20->30->40->50->60. 
            Node current  = head; 
      
            // current will either point to kth or NULL after this 
            // loop. current will point to node 40 in the above example 
            int count = 1; 
            while (count < k && current !=  null) 
            { 
                current = current.next; 
                count++; 
            } 
      
            // If current is NULL, k is greater than or equal to count 
            // of nodes in linked list. Don't change the list in this case 
            if (current == null) 
                return null; 
      
            // current points to kth node. Store it in a variable. 
            // kthNode points to node 40 in the above example 
            Node kthNode = current; 
      
            // current will point to last node after this loop 
            // current will point to node 60 in the above example 
            while (current.next != null) 
                current = current.next; 
      
            // Change next of last node to previous head 
            // Next of 60 is now changed to node 10 
      
            current.next = head; 
      
            // Change head to (k+1)th node 
            // head is now changed to node 50 
            head = kthNode.next; 
      
            // change next of kth node to null 
            kthNode.next = null; 
            return head;
    }
    }
    