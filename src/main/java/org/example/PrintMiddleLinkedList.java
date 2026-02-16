package org.example;

public class PrintMiddleLinkedList {

    //head->1->3->5
    //ouput 3
    // [Naive Approach] Two Passes - O(n) Time and O(1) Space

   /* static int getLength(Node head) {

        int length = 0;

        // Count nodes in linked list
        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    static int getMiddle(Node head) {

        int length = getLength(head);

        // traverse till we reached half of length
        int midIndex = length / 2;
        while (midIndex > 0) {
            head = head.next;
            midIndex--;
        }

        return head.data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
       //head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
    }*/

    // [Expected Approach] Hare and Tortoise Algorithm - O(n) Time and O(1) Space

    static int getMiddle(Node head) {

        Node slowptr = head;
        Node fastptr = head;

        while (fastptr != null && fastptr.next != null) {

            // move the fast pointer by two nodes
            fastptr = fastptr.next.next;

            // move the slow pointer by one node
            slowptr = slowptr.next;
        }

        return slowptr.data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
    }
}

