public class Array_Stack {

    int[] arr ;
    int top = -1;

    public Array_Stack(int n){
        arr = new int[n];
    }

    //Stack Underflow
    public boolean isEmpty(){
        return this.top == -1;
    }
    //Stack Overflow
    public boolean isFull(){
        return this.top == arr.length - 1;
    }

    public void push(int Data){
        //Check for Overflow
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }

        //Adding Element
        this.top++;
        arr[this.top] = Data;
    }

    public int pop(){
        //Check for Underflow
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        //Removing Element
        int result = arr[this.top];
        this.top--;
        return result;
    }

    public int peek(){
        //Check for Underflow
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        //Looking at top Element
        int result = arr[this.top];
        return result;
    }
}
