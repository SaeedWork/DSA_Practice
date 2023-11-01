public class Array_Queue {
    int[] arr ;
    int size;
    int rear = -1;

    Array_Queue(int size){
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty(){
        return this.rear == -1;
    }

    public void enQueue(int Data){
        //If Queue is full
        if(this.rear == size-1){
            System.out.println("The Queue is Full");
            return;
        }

        //add element
        rear++;
        arr[rear] = Data;
    }

    public int deQueue(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Remove the element
        int front = arr[0];
        for (int i=0; i<this.rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public int peek(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Show first element
        int front = arr[0];
        return front;
    }
}
