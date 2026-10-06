import java.util.Scanner;

public class SwapTwoNodes {
    public static void print(Node<Integer> head){

        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static  Node<Integer> takeInput(){
        Node<Integer> head=null , tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while (data != -1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
//                Node<Integer> temp=head;
//                while(temp.next != null){
//                    temp=temp.next;
//                }
//                temp.next=newNode;
                tail.next=newNode;
                tail=newNode; //tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }

    public static Node<Integer> swap(Node<Integer> head , int m , int n){
        Node<Integer> curr1=head , curr2=head , prev1=null , prev2 = null;

        for(int i=0 ; i<m ; i++){
            prev1=curr1;
            curr1=curr1.next;
        }
        for(int j=0 ; j<n ; j++){
            prev2=curr2;
            curr2=curr2.next;
        }

        curr2.next=prev1.next.next;
        prev1.next=curr2;


        curr1.next=prev2.next.next;
        prev2.next=curr1;

        return head;

    }


    public static void main(String[] args){
        Node<Integer> head=takeInput();
        head=swap(head,1,2);
        print(head);

    }

}
