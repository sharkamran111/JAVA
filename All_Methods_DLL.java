class Node {
    int data;
    Node next;
    Node previos;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previos = null;
    }
}

public class All_Methods_DLL {
    Node head, tail;

    private Node findNode(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.previos = newNode;
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
        tail.next.previos = tail;
        tail = newNode;
    }


    public void insertAtcount(int data, int count) {
        if (count < 0) {
            System.out.println("Invalid count");
            return;
        }
        if (count == 0) {
            insertAtStart(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < count - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid count");
            return;
        }
        if (temp == tail) {
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.previos = temp;
        temp.next.previos = newNode;
        temp.next = newNode;
    }
    public void insertAfterValue(int data, int key) {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = findNode(key);
        if (temp == null) {
            System.out.println("Value "+key+" Not Found");
            return;
        }
        if (temp == tail) {
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.previos = temp;
        temp.next.previos = newNode;
        temp.next = newNode;
    }

    public void insertBeforeValue(int data, int key) {
        if (head == null) {
            System.out.println("List Is Empty !");
            return;
        }
        Node temp = findNode(key);
        if (temp == null) {
            System.out.println("Value " + key + " Not Found !");
            return;
        }
        if (temp == head) {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.previos = temp.previos;
        newNode.next = temp;
        temp.previos.next = newNode;
        temp.previos = newNode;
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.previos = null;
    }
    public void deleteAtEnd() {
        if (tail == null) {
            System.out.println("List Is Empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.previos;
        tail.next = null;
    }
    public void deleteAfterValue(int key) {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = findNode(key);
        if (temp == null) {
            System.out.println("Value "+key+" Not Found");
            return;
        }
        if (temp.next == null) {
            System.out.println("No Node After " + key);
            return;
        }
        Node del = temp.next;
        temp.next = del.next;
        if (del.next != null) {
            del.next.previos = temp;
        } else {
            tail = temp;
        }
    }
    public void deleteBeforeValue(int key) {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = findNode(key);
        if (temp == null) {
            System.out.println("Value "+key+" Not Found");
            return;
        }
        if (temp.previos == null) {
            System.out.println("No Node Before "+key);
            return;
        }
        Node del = temp.previos;
        temp.previos = del.previos;
        if (del.previos != null) {
            del.previos.next = temp;
        } else {
            head = temp;
        }
    }

    public void searchAndDeleteValue(int key) {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = findNode(key);
        if (temp == null) {
            System.out.println("Value "+key+" Not Found");
            return;
        }
        if (temp == head) {
            deleteAtStart();
            return;
        }
        if (temp == tail) {
            deleteAtEnd();
            return;
        }
        temp.previos.next = temp.next;
        temp.next.previos = temp.previos;
    }


    public int searchNode(int key) {
        if (head == null) {
            System.out.println("List Is Empty");
            return -1;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Data Found At count "+count);
                return count;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Data Not Found");
        return -1;
    }

    public void SearchByHead(int key) {
        Node temp = head;
        if (head == null) {
            System.out.println("List Is Empty !");
            return;
        }
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Data Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data Not Found");
    }

    public void SearchByTail(int key) {
        Node temp = tail;
        if (tail == null) {
            System.out.println("List Is Empty !");
            return;
        }
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Data Found");
                return;
            }
            temp = temp.previos;
        }
        System.out.println("Data Not Found");
    }

    public void displayForward() {
        Node temp = head;
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        while (temp != null) {
            System.out.print("["+ temp.data +"]-->");
            temp = temp.next;
        }
        System.out.println("[Null]");
    }

    public void displayBackward() {
        Node temp = tail;
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        while (temp != null) {
            System.out.print("["+ temp.data +"]-->");
            temp = temp.previos;
        }
        System.out.println("[Null]");
    }

    public static void main(String[] args) {
        All_Methods_DLL list = new All_Methods_DLL();
        list.insertAtStart(7);
        list.insertAtEnd(9);
        list.insertAtcount(8, 1);
        list.insertAfterValue(10, 9);
        list.insertBeforeValue(6, 7);
        list.displayForward();  
        list.displayBackward();  

        list.searchNode(8);
        list.searchNode(99);
        list.SearchByHead(9);
        list.SearchByTail(6);

        list.deleteAfterValue(7);     
        list.deleteBeforeValue(10);
        list.displayForward();      
        list.displayBackward();

        list.searchAndDeleteValue(7);
        list.displayForward();        
        list.displayBackward();

        list.deleteAtStart();
        list.deleteAtEnd();
        list.displayForward();     
    }
}