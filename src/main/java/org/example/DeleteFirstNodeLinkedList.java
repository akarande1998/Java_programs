package org.example;

public class DeleteFirstNodeLinkedList {
    public static Node deleteFirstNodeLinkedList(Node head){
        head=head.next;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        Node output=deleteFirstNodeLinkedList(head);

        while(output!=null){
            System.out.print(output.data+" ");
            output=output.next;
        }
    }
}
