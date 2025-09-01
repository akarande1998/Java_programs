package org.example;

public class DeleteNodeFromSpecificPosition {
    public static Node deleteNodeFromSpecificPosition(Node head,int position){
        if(head==null){
            return null;
        }

        Node temp=head;
        Node prev=null;
        if(position==1){
            head=temp.next;
            return head;
        }

        for(int i=1;temp!=null&&i<position;i++){
            prev=temp;
            temp=temp.next;

        }
        if(temp!=null){
            prev.next=temp.next;
        }else{
            System.out.println("data Not found");
        }
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        Node output=deleteNodeFromSpecificPosition(head,5);

        while (output!=null){
            System.out.print(output.data+" ");
            output=output.next;
        }
    }
}
