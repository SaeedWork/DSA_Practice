import java.util.ArrayList;

public class ArrayList_Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void push(int Data){
        list.add(Data);
    }

    public int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public int peek(){
        int top = list.get(list.size()-1);
        return top;
    }
}
