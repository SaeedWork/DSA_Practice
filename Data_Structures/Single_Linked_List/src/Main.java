// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Integer Data Implementation
        Int_Linked_List list1 = new Int_Linked_List();
        list1.insertFirst(5);
        list1.insertFirst(4);
        list1.insertLast(7);
        list1.insertAt(6,3);
        list1.printList();

        System.out.println();

        System.out.println(list1.searchVal(2));
        System.out.println(list1.searchVal(7));
        System.out.println(list1.searchVal(5));

        list1.updateAt(0,2);
        list1.printList();

        System.out.println();

        list1.deleteFirst();
        list1.printList();

        System.out.println();

        list1.deleteLast();
        list1.printList();

        System.out.println();

        list1.deleteAt(2);
        list1.printList();

        System.out.println();
        System.out.println();
        System.out.println();


        //String Data Implementation
        Str_Linked_List list2 = new Str_Linked_List();
        list2.insertFirst("World");
        list2.insertFirst("Hello");
        list2.insertLast("!");
        list2.insertAt("Java",3);
        list2.printList();

        System.out.println();

        System.out.println(list2.searchVal("Kill"));
        System.out.println(list2.searchVal("World"));
        System.out.println(list2.searchVal("Java"));

        list2.updateAt("C++",3);
        list2.printList();

        System.out.println();

        list2.deleteFirst();
        list2.printList();

        System.out.println();

        list2.deleteLast();
        list2.printList();

        System.out.println();

        list2.deleteAt(2);
        list2.printList();

        System.out.println();
        }
    }
