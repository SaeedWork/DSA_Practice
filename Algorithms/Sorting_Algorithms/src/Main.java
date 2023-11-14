import javax.sound.midi.Soundbank;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Bubble Sort Using ArrayList of Integers
        System.out.println();
        System.out.println("**** Using Bubble Sort ****");
        System.out.println();

        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(0);
        list.add(4);
        //Loop to Print Unsorted List
        System.out.print("Unsorted List: ");
        for (int l:list) {
            System.out.print(l + " | ");
        }

        System.out.println();
        //Creating an object of Bubble_Sort class
        BubbleSort s1 = new BubbleSort();
        s1.Int_BubbleSort_ArrayList(list);
        //Loop to Print Sorted List
        System.out.print("Sorted List: ");
        for (int l: list) {
            System.out.print(l + " | ");
        }
        System.out.println();
        // Calling the method again to check if the list is already sorted
        s1.Int_BubbleSort_ArrayList(list);


        System.out.println();
        System.out.println();


        //Bubble Sort Using ArrayList of Characters
        ArrayList<Character> Clist = new ArrayList<Character>();
        Clist.add('a');
        Clist.add('c');
        Clist.add('b');
        Clist.add('e');
        Clist.add('d');
        //Loop to Print Unsorted List
        System.out.print("Unsorted List: ");
        for (char l:Clist) {
            System.out.print(l + " | ");
        }

        System.out.println();
        //Calling the method to sort the list
        s1.Char_BubbleSort_Arraylist(Clist);
        //Loop to Print Sorted List
        System.out.print("Sorted List: ");
        for (char l:Clist) {
            System.out.print(l + " | ");
        }

        System.out.println();
        // Calling the method again to check if the list is already sorted
        s1.Char_BubbleSort_Arraylist(Clist);


        System.out.println();
        System.out.println();


        //Bubble Sort Using ArrayList of Strings
        ArrayList<String> Slist = new ArrayList<String>();
        Slist.add("Orange");
        Slist.add("Apple");
        Slist.add("Banana");
        Slist.add("Pineapple");
        Slist.add("Grapes");
        //Loop to Print Unsorted List
        System.out.print("Unsorted List: ");
        for (String l:Slist) {
            System.out.print(l + " | ");
        }

        System.out.println();
        //Calling the method to sort the list
        s1.Str_BubbleSort_ArrayList(Slist);
        //Loop to Print Sorted List
        System.out.print("Sorted List: ");
        for (String l:Slist) {
            System.out.print(l + " | ");
        }

        System.out.println();
        // Calling the method again to check if the list is already sorted
        s1.Str_BubbleSort_ArrayList(Slist);


        System.out.println();
        System.out.println();
        System.out.println();

        //Selection Sort Using ArrayList of Integers
        System.out.println("**** Using Selection Sort ****");
        System.out.println();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(5);
        list1.add(1);
        list1.add(2);
        list1.add(4);
        //Loop to Print Unsorted List
        System.out.print("Unsorted List: ");
        for (int l:list1) {
            System.out.print(l + " | ");
        }

        System.out.println();
        //Creating an object of SelectionSort class
        SelectionSort s2 = new SelectionSort();
        s2.Int_SelectionSort_Arraylist(list1);
        //Loop to Print Sorted List
        System.out.print("Sorted List: ");
        for (int l:list1) {
            System.out.print(l + " | ");
        }

        System.out.println();
        // Calling the method again to check if the list is already sorted
        s2.Int_SelectionSort_Arraylist(list1);

        System.out.println();
        System.out.println();

        //Selection Sort Using ArrayList of Characters
        ArrayList<Character> Clist1 = new ArrayList<Character>();
        Clist1.add('a');
        Clist1.add('c');
        Clist1.add('b');
        Clist1.add('e');
        Clist1.add('d');
        //Loop to Print Unsorted List
        System.out.print("Unsorted List: ");
        for (char l:Clist1) {
            System.out.print(l + " | ");
        }

        System.out.println();
        //Calling the method to sort the list
        s2.Char_SelectionSort_Arraylist(Clist1);
        //Loop to Print Sorted List
        System.out.print("Sorted List: ");
        for (char l:Clist1) {
            System.out.print(l + " | ");
        }

        System.out.println();
        // Calling the method again to check if the list is already sorted
        s2.Char_SelectionSort_Arraylist(Clist1);


        System.out.println();
        System.out.println();

        //Selection Sort Using ArrayList of Strings
        ArrayList<String> Slist1 = new ArrayList<String>();

        Slist1.add("Apple");
        Slist1.add("Orange");
        Slist1.add("Banana");
        Slist1.add("Pineapple");
        Slist1.add("Grapes");
        //Loop to Print Unsorted List
        System.out.print("Unsorted List: ");
        for (String l:Slist1) {
            System.out.print(l + " | ");
        }

        System.out.println();
        //Calling the method to sort the list
        s2.Str_SelectionSort_Arraylist(Slist1);
        //Loop to Print Sorted List
        System.out.print("Sorted List: ");
        for (String l:Slist1) {
            System.out.print(l + " | ");
        }

        System.out.println();
        // Calling the method again to check if the list is already sorted
        s2.Str_SelectionSort_Arraylist(Slist1);

}
}
