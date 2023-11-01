public class Link_List_Stack {
    Node head ;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void push(int Data){
        //Creating new Node
        Node newNode = new Node(Data);

        //Checking if Empty
        if (isEmpty()){
            this.head = newNode;
            return;
        }

        //Adding Value at top
        newNode.next = this.head;
        this.head = newNode;
    }

    public int pop(){
        //Checking if Empty
        if (isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }

        //Removing Value from top
        int top = this.head.data;
        this.head = this.head.next;
        return top;
    }

    public int peek(){
        //Checking if Empty
        if (isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }

        //Returning Value from top
        int top = this.head.data;
        return top;
    }
}
