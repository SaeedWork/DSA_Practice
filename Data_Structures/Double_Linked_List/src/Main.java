// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Int_Double_Link_List list = new Int_Double_Link_List();
            list.insertFirst(1);
            list.insertFirst(2);

            list.insertLast(3);
            list.insertLast(4);

            list.insertAt(5, 2);
            list.insertAt(6, 4);

            list.printList();


            System.out.println();


            list.deleteFirst();
            list.deleteLast();
            list.printList();

            System.out.println();

            list.deleteAt(2);
            list.printList();

            System.out.println();
            System.out.println();
            System.out.println();

            Str_Double_LinkedList list2 = new Str_Double_LinkedList();
            list2.insertFirst("Hello");
            list2.insertFirst("World");

            list2.insertLast("How");
            list2.insertLast("are");
            list2.insertLast("you");

            list2.insertAt("doing", 3);
            list2.printList();

            System.out.println();

            list2.deleteFirst();
            list2.deleteLast();
            list2.printList();

            System.out.println();

            list2.deleteAt(2);
            list2.printList();

            System.out.println();
        }
}