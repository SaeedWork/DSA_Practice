import java.util.Stack;
public class Two_Stack_Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public void enQueue(int data){
        //Move elements from s1 to s2
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        //Add new element to s1
        s1.push(data);

        //Moving elements from s2 back to s1
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Removing from S1
        return s1.pop();
    }

    public int peek(){
        //If Queue is empty
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }

        //Peeking value from S1
        return s1.peek();
    }
}
