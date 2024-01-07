import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {

    public static void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        SortingAlgorithms S1 = new SortingAlgorithms();

        //Bubble Sort
        System.out.println("Bubble Sort");
        int array[] = {5,8,3,9,1,7};
        printArray(array);
        S1.bubbleSort(array);
        printArray(array);

        //Selection Sort
        System.out.println("Selection Sort");
        int array2[] = {7,8,3,1,2,4};
        printArray(array2);
        S1.selectionSort(array2);
        printArray(array2);

        //Insertion Sort
        System.out.println("Insertion Sort");
        int array3[] = {8,9,4,5,0,1};
        printArray(array3);
        S1.insertionSort(array3);
        printArray(array3);


        System.out.println("Quick Sort");
        int array4[] = {8,9,4,5,0,1};
        printArray(array4);
        S1.quickSort(array4,0,array4.length-1);
        printArray(array4);


        System.out.println("Merged Sort");
        int array5[] = {7,8,9,4,2,3,1};
        printArray(array5);
        S1.mergeSort(array5, 0, array5.length-1);
        printArray(array5);
    }
}
