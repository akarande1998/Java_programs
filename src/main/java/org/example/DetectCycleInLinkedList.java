package org.example;

public class DetectCycleInLinkedList {
    public static boolean detectCycleInLinkeList(Node head){
        if(head==null){
            return false;
        }
        Node fast=head;
        Node slow=head;

        while(fast!=null&&fast.next!=null&&slow!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;

        boolean output=detectCycleInLinkeList(head);

        System.out.println("output "+output);
    }
}
