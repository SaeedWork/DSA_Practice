// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Link_List_Stack s1 = new Link_List_Stack();

            s1.push(10);
            s1.push(20);
            s1.push(30);
            s1.push(40);
            s1.push(50);

            while (!s1.isEmpty()){
                System.out.println(s1.peek());
                s1.pop();
            }

        System.out.println();
        System.out.println();
        System.out.println();

        ArrayList_Stack s2 = new ArrayList_Stack();

            s2.push(10);
            s2.push(20);
            s2.push(30);
            s2.push(40);
            s2.push(50);

            while (!s2.isEmpty()){
                System.out.println(s2.peek());
                s2.pop();
            }

        System.out.println();
        System.out.println();
        System.out.println();

        Array_Stack s3 = new Array_Stack(5);

            s3.push(10);
            s3.push(20);
            s3.push(30);
            s3.push(40);
            s3.push(50);

            while (!s3.isEmpty()){
                System.out.println(s3.peek());
                s3.pop();
            }
        }
}