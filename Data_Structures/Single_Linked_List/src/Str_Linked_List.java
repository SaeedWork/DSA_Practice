public class Str_Linked_List {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    //Insertion Operations
    public void insertFirst(String Data) {
        //Creating new Node
        Node newNode = new Node(Data + " -> ");

        //Empty List Insertion
        if (this.head == null) {
            this.head = newNode;
            newNode.next = null;
            return;
        }

        //Insert Node
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertLast(String Data) {
        //Creating new Node
        Node newNode = new Node(Data + " -> ");

        //Empty List Insertion
        if (this.head == null) {
            this.head = newNode;
            newNode.next = null;
            return;
        }

        //Traverse to the last Node by creating temp Node
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        //Insert Node
        temp.next = newNode;
    }

    public void insertAt(String Data, int Position) {
        //Creating new Node
        Node newNode = new Node(Data + " -> ");

        //Empty List Insertion
        if (this.head == null) {
            this.head = newNode;
            newNode.next = null;
            return;
        }

        //Traverse to the Pre-Node of the position by temp Node
        Node temp = this.head;
        for (int i = 1; i < Position - 1; i++) {
            temp = temp.next;
        }

        //Insert Node
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //Printing the List
    public void printList() {
        //Error Checking if list empty
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        //Traverse by Temp Node
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public void deleteFirst() {
        //Error Checking if list empty
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        //Updating the head
        this.head = this.head.next;
    }

    public void deleteLast(){
        //Error Checking if list empty
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        //Traverse to the Second last Node
        Node temp = this.head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        //Delete Node
        temp.next = null;
    }

    public void deleteAt(int Position){
        //Error Checking if list empty
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        //Traverse to the Pre-Node from the Position
        Node temp = this.head;
        for (int i = 1; i < Position-1;i++){
            temp = temp.next;
        }

        //Delete Node
        temp.next = (temp.next).next;
    }

    public void updateAt(String Data, int Position){
        //Error Checking if list empty
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        //Traverse to the Node on the Position
        Node temp = this.head;
        for (int i = 1; i < Position ;i++){
            temp = temp.next;
        }

        //Updating Value
        temp.data = Data + " -> ";
    }

    public String searchVal(String Value){
        //Error Checking if list empty
        if (this.head == null) {
            return "List is Empty";
        }

        //Traverse to the Pre-Node from the Position
        Node temp = this.head;
        int pos = 1;
        while (temp != null){
            if (temp.data.equals(Value + " -> ")){
                return "The String '" + Value + "' is found on Position : " + pos;
            }else {
                temp = temp.next;
                pos++;
            }
        }

        //Return for Value Not found
        return "The String '" + Value + "' is not in the List";

    }
}
