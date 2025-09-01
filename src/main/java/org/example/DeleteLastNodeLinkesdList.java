package org.example;

public class DeleteLastNodeLinkesdList {
    public  static Node deleteLastNodeLinkedList(Node head){
       if(head==null ||head.next==null){
            return null;
        }
        Node temp=head;
        while (temp.next.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        Node output=deleteLastNodeLinkedList(head);

        while (output!=null){
            System.out.print(output.data+" ");
            output=output.next;
        }
    }
}
