////{ Driver Code Starts
//import java.util.*;
//
//class Node {
//    int data;
//    Node next;
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//public class ReorderList {
//    Node head; // head of lisl
//    Node last; // last of linked list
//
//    /* Linked list Node*/
//
//    /* Utility functions */
//
//    /* Inserts a new Node at front of the list. */
//    public void addToTheLast(Node node) {
//
//        if (head == null) {
//            head = node;
//            last = head;
//        } else {
//            // Node temp = head;
//            // while (temp.next != null) temp = temp.next;
//
//            last.next = node;
//            last = last.next;
//        }
//    }
//    /* Function to print linked list */
//    void printList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    /* Drier program to test above functions */
//    public static void main(String args[]) {
//
//        /* Constructed Linked List is 1->2->3->4->5->6->
//           7->8->8->9->null */
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t > 0) {
//            int n = sc.nextInt();
//            ReorderList llist = new ReorderList();
//
//            int a1 = sc.nextInt();
//            Node head = new Node(a1);
//            llist.addToTheLast(head);
//            for (int i = 1; i < n; i++) {
//                int a = sc.nextInt();
//                llist.addToTheLast(new Node(a));
//            }
//
//            llist.head = new Solution().reorderlist(llist.head);
//
//            llist.printList();
//
//            t--;
//        }
//    }
//}
//// } Driver Code Ends
//
//
///* Following is the Linked list node structure */
//
///*class Node
//{
//    int data;
//    Node next;
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}*/
//
//class Solution {
//
//    Node reverse(Node head){
//        // stack overflow error due to excess recursive calls
//
//        // if(head==null || head.next==null) return head;
//
//        // Node rev = reverse(head.next);
//        // head.next.next = head;
//        // head.next = null;
//        // return rev;
//
//        Node curr = head, prev = null;
//        while(curr!=null){
//            Node temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//    }
//
//    Node reorderlist(Node head) {
//        Node slow = head, fast = head.next, p1 = head;
//
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        Node p2 = reverse(slow.next);
//        slow.next = null;
//
//        while(p2!=null){
//            Node temp1 = p1.next, temp2 = p2.next;
//            p1.next = p2;
//            p2.next = temp1;
//            p1 = temp1;
//            p2 = temp2;
//        }
//
//        return head;
//    }
//}
