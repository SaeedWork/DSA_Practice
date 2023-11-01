public class Circular_Array_Queue {
    int[] arr ;
    int size;
    int rear = -1;
    int front = -1;

    Circular_Array_Queue(int size){
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty(){
        return this.rear == -1 && this.front == -1;
    }

    public boolean isFull(){
        return (this.rear+1)%this.size == this.front;
    }

    public void enQueue(int Data){
        //If Queue is full
        if(isFull()){
            System.out.println("The Queue is Full");
            return;
        }

        //If 1st Element
        if(this.front==-1){
            this.front = 0;
        }

        //add element
        this.rear = (this.rear+1)%this.size; //special condition to increase rear
        arr[this.rear] = Data;
    }

    public int deQueue(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Remove the element
        int result = arr[this.front];

        //Special condition check, if only one element in Queue
        if (this.rear == this.front){
            this.rear = this.front = -1;
        }else {
            this.front = (this.front+1)%this.size; //special condition to increase front
        }
        return result;
    }

    public int peek(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Show first element
        int result = arr[this.front];
        return result;
    }
}
