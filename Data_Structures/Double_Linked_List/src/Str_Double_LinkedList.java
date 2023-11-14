public class Str_Double_LinkedList {
    Node head;
    Node tail;

    public class Node{
        String data;
        Node next;
        Node prev;
        public Node(String data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void insertFirst(String Data){
        Node newNode = new Node(Data);

        //When list is Empty
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // Inserting Node at the beginning
        this.head.prev= newNode;
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertLast(String Data){
        Node newNode = new Node(Data);

        //When list is Empty
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // Inserting Node at the end
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
    }

    public void insertAt(String Data, int Position){
        Node newNode = new Node(Data);
        //When list is Empty
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // Inserting Node at the end
        Node temp = this.head;
        for(int i = 1; i < Position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }


    public void deleteFirst(){
        //When list is Empty
        if(isEmpty()){
            System.out.println("The List is Empty");
            return;
        }

        // Deleting Node at the beginning
        this.head = this.head.next;
        this.head.prev = null;
    }

    public void deleteLast(){
        //When list is Empty
        if(isEmpty()){
            System.out.println("The List is Empty");
            return;
        }

        // Deleting Node at the end
        this.tail = this.tail.prev;
        this.tail.next = null;
    }

    public void deleteAt(int Position){
        //When list is Empty
        if(isEmpty()){
            System.out.println("The List is Empty");
            return;
        }

        // Deleting Node at the end
        Node temp = this.head;
        for(int i = 1; i < Position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public void printList(){
        //When list is Empty
        if(isEmpty()){
            System.out.println("The List is Empty");
            return;
        }

        Node temp = this.head;
        while (temp != null){
            System.out.print("<-" + temp.data + "->");
            temp = temp.next;
        }
    }
}
