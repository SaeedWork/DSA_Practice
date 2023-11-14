// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
            //Searching Algorithms in Array
            System.out.println("Searching Algorithms in Array");
            System.out.println("****************************");
            System.out.println();
            //Linear Search
            //Creating an object of LinearSearch class
            LinearSearch s1 = new LinearSearch();

            //Integer Linear Search
            System.out.println("Integer Linear Search");
            System.out.println("*********************");

            //Making an array of 7 elements
            int[] array = {1, 2, 3, 4, 5, 7, 9};

            //Calling Int_LinearSearch_Array method on array for searching an existing element
            System.out.println(s1.Int_LinearSearch_Array(array,9));
            //Calling Int_LinearSearch_Array method on array for searching a non-existing element
            System.out.println(s1.Int_LinearSearch_Array(array,6));

            System.out.println();

            //Character Linear Search
            System.out.println("Character Linear Search");
            System.out.println("***********************");

            //Making an array of 7 elements
            char[] array2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

            //Calling Char_LinearSearch_Array method on array for searching an existing element
            System.out.println(s1.Char_LinearSearch_Array(array2,'b'));
            //Calling Char_LinearSearch_Array method on array for searching a non-existing element
            System.out.println(s1.Char_LinearSearch_Array(array2,'h'));

            System.out.println();

            //String Linear Search
            System.out.println("String Linear Search");
            System.out.println("********************");

            //Making an array of 7 elements
            String[] array3 = {"apple", "banana", "carrot", "dates", "egg", "fig", "grapes"};

            //Calling Str_LinearSearch_Array method on array for searching an existing element
            System.out.println(s1.Str_LinearSearch_Array(array3,"fig"));
            //Calling Str_LinearSearch_Array method on array for searching a non-existing element
            System.out.println(s1.Str_LinearSearch_Array(array3,"honey"));

            System.out.println();
            System.out.println();
            System.out.println();


            //Creating an object of BinarySearch class
            BinarySearch s2 = new BinarySearch();

            //Integer Binary Search
            System.out.println("Integer Binary Search");
            System.out.println("********************");

            //Making an array of 7 elements
            int[] array4 = {1, 2, 3, 4, 5, 7, 9};

            //Calling Int_BinarySearch_Array method on array for searching an existing element
            System.out.println(s2.Int_BinarySearch_Array(array4,3));
            //Calling Int_BinarySearch_Array method on array for searching a non-existing element
            System.out.println(s2.Int_BinarySearch_Array(array4,6));

            System.out.println();

            //Character Binary Search
            System.out.println("Character Binary Search");
            System.out.println("***********************");

            //Making an array of 7 elements
            char[] array5 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

            //Calling Char_BinarySearch_Array method on array for searching an existing element
            System.out.println(s2.Char_BinarySearch_Array(array5,'b'));
            //Calling Char_BinarySearch_Array method on array for searching a non-existing element
            System.out.println(s2.Char_BinarySearch_Array(array5,'h'));

            System.out.println();

            //String Binary Search
            System.out.println("String Binary Search");
            System.out.println("********************");

            //Making an array of 7 elements
            String[] array6 = {"apple", "banana", "carrot", "dates", "egg", "fig", "grapes"};

            //Calling Str_BinarySearch_Array method on array for searching an existing element
            System.out.println(s2.Str_BinarySearch_Array(array6,"fig"));
            //Calling Str_BinarySearch_Array method on array for searching a non-existing element
            System.out.println(s2.Str_BinarySearch_Array(array6,"honey"));

            System.out.println();
            System.out.println();
            System.out.println();

            //Searching Algorithms in ArrayList
            System.out.println("Searching Algorithms in ArrayList");
            System.out.println("*********************************");
            System.out.println();
            //Linear Search

            //Integer Linear Search
            System.out.println("Integer Linear Search");
            System.out.println("*********************");

            //Making an ArrayList of 7 elements
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1); list.add(2); list.add(3);
            list.add(4); list.add(5); list.add(7);
            list.add(9);

            //Calling Int_LinearSearch_ArrayList method on ArrayList for searching an existing element
            System.out.println(s1.Int_LinearSearch_ArrayList(list,9));
            //Calling Int_LinearSearch_ArrayList method on ArrayList for searching a non-existing element
            System.out.println(s1.Int_LinearSearch_ArrayList(list,6));

            System.out.println();

            //Character Linear Search
            System.out.println("Character Linear Search");
            System.out.println("***********************");

            //Making an ArrayList of 7 elements
            ArrayList<Character> list2 = new ArrayList<Character>();
            list2.add('a'); list2.add('b'); list2.add('c');
            list2.add('d'); list2.add('e'); list2.add('f');
            list2.add('g');

            //Calling Char_LinearSearch_ArrayList method on ArrayList for searching an existing element
            System.out.println(s1.Char_LinearSearch_ArrayList(list2,'b'));
            //Calling Char_LinearSearch_ArrayList method on ArrayList for searching a non-existing element
            System.out.println(s1.Char_LinearSearch_ArrayList(list2,'h'));

            System.out.println();

            //String Linear Search
            System.out.println("String Linear Search");
            System.out.println("********************");

            //Making an ArrayList of 7 elements
            ArrayList<String> list3 = new ArrayList<String>();
            list3.add("apple"); list3.add("banana"); list3.add("carrot");
            list3.add("dates"); list3.add("egg"); list3.add("fig");
            list3.add("grapes");

            //Calling Str_LinearSearch_ArrayList method on ArrayList for searching an existing element
            System.out.println(s1.Str_LinearSearch_ArrayList(list3,"fig"));
            //Calling Str_LinearSearch_ArrayList method on ArrayList for searching a non-existing element
            System.out.println(s1.Str_LinearSearch_ArrayList(list3,"honey"));

            System.out.println();
            System.out.println();
            System.out.println();

            //Binary Search

            //Integer Binary Search
            System.out.println("Integer Binary Search");
            System.out.println("*********************");

            //Making an ArrayList of 7 elements
            ArrayList<Integer> list4 = new ArrayList<Integer>();
            list4.add(1); list4.add(2); list4.add(3);
            list4.add(4); list4.add(5); list4.add(7);
            list4.add(9);

            //Calling Int_BinarySearch_ArrayList method on ArrayList for searching an existing element
            System.out.println(s2.Int_BinarySearch_ArrayList(list4,3));
            //Calling Int_BinarySearch_ArrayList method on ArrayList for searching a non-existing element
            System.out.println(s2.Int_BinarySearch_ArrayList(list4,6));

            System.out.println();

            //Character Binary Search
            System.out.println("Character Binary Search");
            System.out.println("***********************");

            //Making an ArrayList of 7 elements
            ArrayList<Character> list5 = new ArrayList<Character>();
            list5.add('a'); list5.add('b'); list5.add('c');
            list5.add('d'); list5.add('e'); list5.add('f');
            list5.add('g');

            //Calling Char_BinarySearch_ArrayList method on ArrayList for searching an existing element
            System.out.println(s2.Char_BinarySearch_ArrayList(list5,'b'));
            //Calling Char_BinarySearch_ArrayList method on ArrayList for searching a non-existing element
            System.out.println(s2.Char_BinarySearch_ArrayList(list5,'h'));

            System.out.println();

            //String Binary Search
            System.out.println("String Binary Search");
            System.out.println("********************");

            //Making an ArrayList of 7 elements
            ArrayList<String> list6 = new ArrayList<String>();
            list6.add("apple"); list6.add("banana"); list6.add("carrot");
            list6.add("dates"); list6.add("egg"); list6.add("fig");
            list6.add("grapes");

            //Calling Str_BinarySearch_ArrayList method on ArrayList for searching an existing element
            System.out.println(s2.Str_BinarySearch_ArrayList(list6,"fig"));
            //Calling Str_BinarySearch_ArrayList method on ArrayList for searching a non-existing element
            System.out.println(s2.Str_BinarySearch_ArrayList(list6,"honey"));
    }
}

