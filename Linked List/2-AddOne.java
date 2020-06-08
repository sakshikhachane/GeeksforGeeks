// { Driver Code Starts
    import java.util.*;
    class Node1{
    int data;
    Node1 next;
    Node1(int d){
    data=d;
    next=null;
    } 
    }
    class AddOne{static Node1 head;
        public static void insert(Node1 node){
            if (head == null) {
                head = node;
            } else {
                Node1 temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
    
                temp.next = node;
            }
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                if(n==0){
            System.out.println("1");
            continue;}
                
                head=null;
                while(n>0){
                        insert(new Node1(n%10));
                    n/=10;
                }
            GfG1 g=new GfG1();
            Node1 mnode=g.addOne(head);
            print(mnode);
            System.out.println();
            }
        }
        public static void print(Node1 mnode){
            while(mnode!=null){
                System.out.print(mnode.data);
                mnode=mnode.next;
            }
        }
    }// } Driver Code Ends
    
    
    /*Complete the given Function
    Node is as follows
    class Node{
    int data;
    Node next;
    Node(int d){
    data=d;
    next=null;
    } 
    }*/
    class GfG1{
        public Node1 addOne(Node1 head){
                Node1 p=head;
                
                while(p.next!=null)
                {
                    p=p.next;
                    System.out.println(p.data);
                }
                System.out.println(p.data);
                p.data+=1;
                System.out.println(p.data);
                p=p.next;
                
                return head;
             }
    }