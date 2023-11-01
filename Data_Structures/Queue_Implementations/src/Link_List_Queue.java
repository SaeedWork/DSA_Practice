public class Link_List_Queue {
    Node head = null;
    Node tail = null;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return this.head == null && this.tail == null;
    }

    public void enQueue(int data){
        Node newNode = new Node(data);

        //If 1st Node
        if(this.tail == null){
            this.tail = this.head = newNode;
            return;
        }

        //Adding newNode from rear
        this.tail.next = newNode;
        this.tail = newNode;

    }

    public int deQueue(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        //Removing Node from front
        int front = this.head.data;

        //Special condition check, if only one element in Queue
        if (this.head == this.tail){
            this.head = this.tail = null;
            return front;
        }

        this.head = this.head.next;
        return front;
    }

    public int peek(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Show first element
        int front = this.head.data;
        return front;
    }



}
