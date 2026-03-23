import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        Node a=head;
        Node b=head;
        while(b!=null && b.next!=null) {
            a=a.next;
            b=b.next.next;
        }
        System.out.println(a.data);
    }
}