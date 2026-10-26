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
public class T3_CLL {
    Node head, tail;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            head.previos=tail;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head.previos=newNode;
        head = newNode;
        tail.next = head;
        head.previos=tail;

    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        newNode.previos = tail;
        tail.next = newNode;
        head.previos = newNode;
        tail = newNode;
    }

 
  
   public void deleteAtStart() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.previos = tail;
        tail.next = head;
    }

   public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        if (head == tail) { 
            head = tail = null;
            return;
        }
        tail = tail.previos;
        tail.next = head;
        head.previos = tail;
    }


   public void display() {
        if (head == null) {
            System.out.println("List Is Empty !");
            return;
        }
        Node temp = head;
        do {
            System.out.print("[" + temp.data + "]-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        T3_CLL list=new T3_CLL();
        list.insertAtStart(7);
        list.insertAtStart(4);
        list.insertAtStart(2);

        list.insertAtEnd(5);

        list.display();
    }

}