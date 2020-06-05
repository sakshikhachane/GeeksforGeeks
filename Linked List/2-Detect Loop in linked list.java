/*
Given a linked list of N nodes. The task is to check if the the linked list has a loop. Linked list can contain self loop.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and next line contains the data of linked list.

Output:
For each testcase, print "True", if linked list contains loop, else print "False".

User Task:
The task is to complete the function detectloop() which contains reference to the head as only argument. This function should return 1 if linked list contains loop, else return 0.

Challenge : Try to solve the problem with constant space and Linear time complexity.

Constraints:
1 <= T <= 100
1 <= N <= 104
1 <= Data on Node <= 103

Example:
Input:
2
3
1 3 4
2
4
1 8 3 4
0
Output:
True
False

Explaination:
Testcase 1: In above test case N = 3. The linked list with nodes N = 3 is given. Then value of x=2 is given which means last node is connected with xth node of linked list. Therefore, there exists a loop. 
Testcase 2: For N = 4 ,x = 0 means then lastNode->next = NULL, then the Linked list does not contains any loop.
*/

// { Driver Code Starts
// Java program to detect loop in a linked list
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    static Node head; // head of list
    /* Linked list Node*/
    /* Inserts a new Node at front of the list. */
    public static void push(int new_data) {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    /* Drier program to test above functions */
    public static void main(String args[]) {
        int t, d, n, i, x, c;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (d = 0; d < t; d++) {
            n = sc.nextInt();
            // GFG gfg = new GFG();
            head = null;
            Node q;
            for (i = 0; i < n; i++) {
                x = sc.nextInt();
                push(x);
            }
            Node p;
            p = head;
            q = head;
            while (q.next != null) q = q.next;
            c = sc.nextInt();
            if (c > 0) {
                c = c - 1;
                for (i = 0; i < c; i++) {
                    p = p.next;
                }
                q.next = p;
            }
            Solution sln = new Solution();
            if (sln.detectLoop(head) == 1)
                System.out.print("True\n");
            else
                System.out.print("False\n");
            // System.gc();
        }
    }
}
// } Driver Code Ends


/* Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class Solution {
    public int detectLoop(Node head) {
        Node temp = head;
        HashMap<Node,Integer>m = new HashMap<>();
        while(temp.next!=null){
        if(m.containsKey(temp))
            return 1;
        m.put(temp,1);
        temp =temp.next;
        }
        if(temp.next == null)
            return 0;
        return 0;
    }
}