// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        SearchingAlgorithms S1 = new SearchingAlgorithms();

        //Iterative Linear Search
        System.out.println("Iterative Linear Search");
        int arr[] = {1,2,9,4,8,5};
        S1.linearSearchIterative(arr, 2);


        //Iterative Binary Search
        //Array should be Sorted
        System.out.println("Iterative Linear Search");
        int arr2[] = {1,2,3,4,5,6,7,8,9};
        S1.binarySearchIterative(arr2, 9);



    }
}

