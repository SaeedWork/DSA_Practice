import java.util.ArrayList;

public class LinearSearch {

    //Method for Linear searching an element in an integer array passing parameters as array and element to be searched
    public int Int_LinearSearch_Array(int arr[], int Data){
        //Traversing the array
        for (int i=0 ; i < arr.length ; i++){
            //Checking if the element is found
            if(arr[i] == Data){
                System.out.print("Element " + Data +" Found on Index : ");
                return i;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Linear searching an element in a character array passing parameters as array and element to be searched
    public int Char_LinearSearch_Array(char arr[], char Data){
        //Traversing the array
        for (int i=0 ; i < arr.length ; i++){
            //Checking if the element is found
            if(arr[i] == Data){
                System.out.print("Element " + Data +" Found on Index : ");
                return i;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Linear searching an element in a string array passing parameters as array and element to be searched
    public int Str_LinearSearch_Array(String arr[], String Data){
        //Traversing the array
        for (int i=0 ; i < arr.length ; i++){
            //Checking if the element is found
            if(arr[i] == Data){
                System.out.print("Element " + Data +" Found on Index : ");
                return i;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Linear searching an element in an Arraylist of Integer type
    //Passing parameters as Arraylist Object and element to be searched
    public int Int_LinearSearch_ArrayList(ArrayList<Integer> list, int Data){
        //Traversing the array
        for (int i=0 ; i < list.size() ; i++){
            //Checking if the element is found
            if(list.get(i) == Data){
                System.out.print("Element " + Data +" Found on Index : ");
                return i;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Linear searching an element in an Arraylist of Character type
    //Passing parameters as Arraylist Object and element to be searched
    public int Char_LinearSearch_ArrayList(ArrayList<Character> list, char Data){
        //Traversing the array
        for (int i=0 ; i < list.size() ; i++){
            //Checking if the element is found
            if(list.get(i) == Data){
                System.out.print("Element " + Data +" Found on Index : ");
                return i;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Linear searching an element in an Arraylist of String type
    //Passing parameters as Arraylist Object and element to be searched
    public int Str_LinearSearch_ArrayList(ArrayList<String> list, String Data){
        //Traversing the array
        for (int i=0 ; i < list.size() ; i++){
            //Checking if the element is found
            if(list.get(i).compareTo(Data) == 0){
                System.out.print("Element " + Data +" Found on Index : ");
                return i;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }
}
