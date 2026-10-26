class Node {
    int data;
    Node next;
    Node previos;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previos=null;
    }
}
public class T2_DLL {
    Node head, tail;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.previos=newNode;
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
        tail.next.previos=tail;
        tail = newNode;

    }

 
  
    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        head = head.next;
        head.previos=null;
    }

    public void deleteAtEnd() {
        if (tail.previos == null) {
            System.out.println("List Is Empty");
            return;
        }
     
         tail=tail.previos;
         tail.next=null;

    }

    public void displayForward(){

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

    public void displayBackward(){

        Node temp = tail;
        if (head==null){
            System.out.println("List Is Empty !");
            return;
        }

        while (temp!=null){

            System.out.print("["+temp.data+"]-->");
            temp=temp.previos;

        }
        System.out.println("[Null]");
    }

    public static void main(String[] args) {
        T2_DLL list=new T2_DLL();
        list.insertAtStart(7);
        list.insertAtStart(4);
        list.insertAtStart(2);

        list.insertAtEnd(5);

        list.displayForward();
        list.displayBackward();
    }

}