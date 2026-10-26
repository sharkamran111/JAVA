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

public class All_Methods_SLL {
    Node head, tail;

    public int insertAtStart(int data, int count) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return count + 1;
        }
        newNode.next = head;
        head = newNode;
        count++;
        return count;
    }
    public int insertAtEnd(int data, int count) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return count + 1;
        }
        tail.next = newNode;
        tail = newNode;
        count++;
        return count;
    }

  
    public int insertAtPosition(int data, int position, int count) {
        if (position < 0 || position > count) {
            System.out.println("Invalid Position");
            return count;
        }
        if (position == 0) {
            return insertAtStart(data, count);
        }
        if (position == count) {
            return insertAtEnd(data, count);
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        count++;
        return count;
    }

    public int insertAfterValue(int data, int key, int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return count;
        }
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value " + key + " Not Found");
            return count;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == tail) {
            tail = newNode;
        }
        count++;
        return count;
    }

    public int insertBeforeValue(int data, int key, int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return count;
        }
        if (head.data == key) {
            return insertAtStart(data, count);
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value " + key + " Not Found");
            return count;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        count++;
        return count;
    }

    public int deleteAtStart(int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return 0;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        count--;
        return count;
    }

    public int deleteAtEnd(int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return 0;
        }
        if (head == tail) {
            head = null;
            tail = null;
            count--;
            return count;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        count--;
        return count;
    }

    public int deleteAfterValue(int key, int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return 0;
        }
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value " + key + " Not Found");
            return count;
        }
        if (temp.next == null) {
            System.out.println("No Node After " + key);
            return count;
        }
        Node del = temp.next;
        temp.next = del.next;
        if (del == tail) {
            tail = temp;
        }
        count--;
        return count;
    }

    public int deleteBeforeValue(int key, int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return 0;
        }
        if (head.data == key) {
            System.out.println("No Node Before " + key);
            return count;
        }
        if (head.next == null) {
            System.out.println("Value " + key + " Not Found");
            return count;
        }
        if (head.next.data == key) {
            return deleteAtStart(count);
        }
        Node temp = head;
        while (temp.next.next != null && temp.next.next.data != key) {
            temp = temp.next;
        }
        if (temp.next.next == null) {
            System.out.println("Value " + key + " Not Found");
            return count;
        }
        temp.next = temp.next.next;
        count--;
        return count;
    }

    public int searchAndDeleteValue(int key, int count) {
        if (head == null) {
            System.out.println("List Is Empty");
            return 0;
        }
        if (head.data == key) {
            return deleteAtStart(count);
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value " + key + " Not Found");
            return count;
        }
        Node del = temp.next;
        temp.next = del.next;
        if (del == tail) {
            tail = temp;
        }
        count--;
        return count;
    }

    public int searchNode(int key) {
        if (head == null) {
            System.out.println("List Is Empty");
            return -1;
        }
        Node temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Data Found At Position "+position);
                return position;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Data Not Found");
        return -1;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        while (temp != null) {
            System.out.print("["+temp.data+"]-->");
            temp = temp.next;
        }
        System.out.println("[Null]");
    }

    public static void main(String[] args) {
        int count = 0;
        All_Methods_SLL list = new All_Methods_SLL();

        count = list.insertAtStart(7, count);
        count = list.insertAtEnd(9, count);
        count = list.insertAtPosition(8, 1, count);
        count = list.insertAfterValue(10, 9, count);
        count = list.insertBeforeValue(6, 7, count);
        list.display();                      

        list.searchNode(8);
        list.searchNode(99);



        count = list.deleteAfterValue(7, count);  
        count = list.deleteBeforeValue(10, count);
        list.display();                      

        count = list.searchAndDeleteValue(7, count);
        list.display();                     



        count = list.deleteAtStart(count);
        count = list.deleteAtEnd(count);
        list.display();      

        System.out.println("Count = " + count);
    }
}