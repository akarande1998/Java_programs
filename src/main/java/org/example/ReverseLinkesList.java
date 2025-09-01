package org.example;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }
}
public class ReverseLinkesList {
    public static Node reverseLinkedList(Node head){
        Node prev=null,next,curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }

    public static void main(String[] args) {
        Node head=new Node(3);
        head.next=new Node(5);
        head.next.next=new Node(7);

        Node output=reverseLinkedList(head);

        while (output!=null){
            System.out.print(output.data+ " ");
            output=output.next;

        }
    }
}
