class Node{
int data;
Node next;
Node previos;
public Node(int data){
    this.data=data;
    this.next=null;
}

}
public class DLL {
Node head,tail;

public void insertAtStart(int data){
    Node newNode=new Node(data);
    if (head==null && tail==null) {
        head=newNode;
        tail=newNode;
        return;
    }
    newNode.next=head;
    head.previos=newNode;
    head=newNode;

}
public void insertAtEnd(int data){
    Node newNode=new Node(data);
    if (head==null && tail==null) {
        head=newNode;
        tail=newNode;
        return;
    }

    if (head == tail) {
        head = null;
        tail = null;
        return;
    }

    tail.next=newNode;
    newNode.previos=tail;
    tail=newNode;
}



public void deleteAtstart(){
    if (head==null && tail==null) {
     System.out.println("List Is Empty");
        return;
    }
    if (head == tail) {
        head = null;
        tail = null;
        return;
    }

    head=head.next;
    head.previos=null;
}

public void deleteAtEnd(){
    if (head==null && tail==null) {
     System.out.println("List Is Empty");
        return;
    }
    tail=tail.previos;
    tail.next=null;
}


public void deletebyValue(int key){
  if (head==null && tail==null) {
    System.out.println("List is Empty");
    return;
    }
    Node current=head;
    boolean found=false;

    while (current!=null) {

        if (current.next.data==key) {
            current.next=current.next.next;
            current.next.previos=current;
            found=true;
        }
        current=current.next;
    }
    if (found==false) {
        System.out.println(" No Such Value");
    }
}


public void Search(int key){
   if (head==null && tail==null) {
    System.out.println("List is Empty");
    return;
    }
    Node current=head;
    boolean found=false;

    while (current!=null) {

        if (current.data==key) {
            System.out.println(current.data+" is found ");
            found=true;
        }
        current=current.next;
    }
    if (found==false) {
        System.out.println(" No data Found ");
    }

}
    
}