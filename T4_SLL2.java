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
public class T4_SLL2 {
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
        }
        tail.next = newNode;
        tail = newNode;
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


    public void reverse() {
    Node previous = null;
    Node current = head;
    tail = head;


    while (current != null) {
        Node nextNode = current.next; 
        current.next = previous;       
        previous = current;               
        current = nextNode;         
    }
    head = previous;         
}

    public static void main(String[] args) {

    
        T4_SLL2 list=new T4_SLL2();
        list.insertAtStart(7);
        list.insertAtStart(9);
        list.insertAtStart(5);
        
        
        list.display();
        list.reverse();
        list.display();
    }

}