// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Array_Queue q = new Array_Queue(10);

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(9);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Circular_Array_Queue q1 = new Circular_Array_Queue(10);
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(5);
        q1.enQueue(7);
        q1.deQueue();
        q1.enQueue(9);
        q1.deQueue();
        q1.enQueue(11);
        q1.enQueue(13);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.deQueue();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Link_List_Queue q3 = new Link_List_Queue();
        q3.enQueue(1);
        q3.enQueue(2);
        q3.enQueue(3);
        q3.enQueue(5);
        q3.enQueue(7);
        q3.deQueue();
        q3.enQueue(9);
        q3.deQueue();
        q3.enQueue(11);
        q3.enQueue(13);

        while(!q3.isEmpty()){
            System.out.println(q3.peek());
            q3.deQueue();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Two_Stack_Queue q4 = new Two_Stack_Queue();
        q4.enQueue(1);
        q4.enQueue(2);
        q4.enQueue(3);
        q4.enQueue(5);
        q4.enQueue(7);
        q4.deQueue();
        q4.enQueue(9);
        q4.deQueue();
        q4.enQueue(11);
        q4.enQueue(13);

        while(!q4.isEmpty()){
            System.out.println(q4.peek());
            q4.deQueue();
        }
    }
}