class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SLL {
    Node head, tail;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
  
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public void  deleteAtStart() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }

        if (head==tail) {
            head=null;
            tail=null;
            
        }

        head = head.next;
    }

    public void deleteAtEnd() {
        Node temp = head;
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        if (head==tail) {
            head=null;
            tail=null;
            return;            
        }
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;
    
    }

   
    public void display(){

        Node temp = head;
        if (head==null){
            System.out.println("List Is Empty !");
            return;
        }

        while (temp!=null){

            System.out.print("["+temp.data+"]-->");
            temp=temp.next;

        }
        System.out.println("[Null]");
    }

    public static void main(String[] args) {

    
    }

}