import java.util.ArrayList;

public class BinarySearch {
    //Method for Binary searching an element in an integer array passing parameters as array and element to be searched
    public int Int_BinarySearch_Array(int arr[], int Data){
        //Declaring variables for low and high to set the range of search
        int low = 0;
        int high = arr.length-1;

        //Traversing the array until low is less than or equal to high
        while (low <= high){
            //Declaring variable for mid to divide the array into two parts using the formula
            //and rounding it to the nearest integer
            int mid = Math.round(((low + high)/2));
            //Checking if the element is found
            if (arr[mid] == Data) {
                System.out.print("Element " + Data + " Found on Index : ");
                return mid;
            } else if (arr[mid] > Data) {
                //If element is less than mid, then it can only be present in left sub-array or before mid or lower half
                high = mid - 1;
            } else {
                //Else the element can only be present in right sub-array or after mid or upper half
                low = mid + 1;
            }
        }
            //If element is not found
            System.out.print("Element Not Found : ");
            return -1;
        }

        //Method for Binary searching an element in a character array passing parameters as array and element to be searched
        public int Char_BinarySearch_Array(char arr[], char Data){
            //Declaring variables for low and high to set the range of search
            int low = 0;
            int high = arr.length-1;

            //Traversing the array until low is less than or equal to high
            while (low <= high){
                //Declaring variable for mid to divide the array into two parts using the formula
                //and rounding it to the nearest integer
                int mid = Math.round(((low + high)/2));
                //Checking if the element is found
                if (arr[mid] == Data) {
                    System.out.print("Element " + Data + " Found on Index : ");
                    return mid;
                } else if (arr[mid] > Data) {
                    //If element is less than mid, then it can only be present in left sub-array or before mid or lower half
                    high = mid - 1;
                } else {
                    //Else the element can only be present in right sub-array or after mid or upper half
                    low = mid + 1;
                }
            }
            //If element is not found
            System.out.print("Element Not Found : ");
            return -1;
        }

        //Method for Binary searching an element in a string array passing parameters as array and element to be searched
        public int Str_BinarySearch_Array(String arr[], String Data){
            //Declaring variables for low and high to set the range of search
            int low = 0;
            int high = arr.length-1;

            //Traversing the array until low is less than or equal to high
            while (low <= high){
                //Declaring variable for mid to divide the array into two parts using the formula
                //and rounding it to the nearest integer
                int mid = Math.round(((low + high)/2));
                //Checking if the element is found
                if (arr[mid] == Data) {
                    System.out.print("Element " + Data + " Found on Index : ");
                    return mid;
                } else if (arr[mid].compareTo(Data) > 0) {
                    //If element is less than mid, then it can only be present in left sub-array or before mid or lower half
                    high = mid - 1;
                } else {
                    //Else the element can only be present in right sub-array or after mid or upper half
                    low = mid + 1;
                }
            }
            //If element is not found
            System.out.print("Element Not Found : ");
            return -1;
        }


        //Method for Binary searching an element in an ArrayList of Integer type
        //passing parameters as Arraylist Object and element to be searched

    public int Int_BinarySearch_ArrayList(ArrayList<Integer> list, int Data){
        //Declaring variables for low and high to set the range of search
        int low = 0;
        int high = list.size()-1;

        //Traversing the array until low is less than or equal to high
        while (low <= high){
            //Declaring variable for mid to divide the array into two parts using the formula
            //and rounding it to the nearest integer
            int mid = Math.round(((low + high)/2));
            //Checking if the element is found
            if (list.get(mid) == Data) {
                System.out.print("Element " + Data + " Found on Index : ");
                return mid;
            } else if (list.get(mid) > Data) {
                //If element is less than mid, then it can only be present in left sub-array or before mid or lower half
                high = mid - 1;
            } else {
                //Else the element can only be present in right sub-array or after mid or upper half
                low = mid + 1;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Binary searching an element in an ArrayList of Character type
    //passing parameters as Arraylist Object and element to be searched

    public int Char_BinarySearch_ArrayList(ArrayList<Character> list, char Data){
        //Declaring variables for low and high to set the range of search
        int low = 0;
        int high = list.size()-1;

        //Traversing the array until low is less than or equal to high
        while (low <= high){
            //Declaring variable for mid to divide the array into two parts using the formula
            //and rounding it to the nearest integer
            int mid = Math.round(((low + high)/2));
            //Checking if the element is found
            if (list.get(mid) == Data) {
                System.out.print("Element " + Data + " Found on Index : ");
                return mid;
            } else if (list.get(mid) > Data) {
                //If element is less than mid, then it can only be present in left sub-array or before mid or lower half
                high = mid - 1;
            } else {
                //Else the element can only be present in right sub-array or after mid or upper half
                low = mid + 1;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

    //Method for Binary searching an element in an ArrayList of String type
    //passing parameters as Arraylist Object and element to be searched
    public int Str_BinarySearch_ArrayList(ArrayList<String> list, String Data){
        //Declaring variables for low and high to set the range of search
        int low = 0;
        int high = list.size()-1;

        //Traversing the array until low is less than or equal to high
        while (low <= high){
            //Declaring variable for mid to divide the array into two parts using the formula
            //and rounding it to the nearest integer
            int mid = Math.round(((low + high)/2));
            //Checking if the element is found
            if (list.get(mid).compareTo(Data) == 0) {
                System.out.print("Element " + Data + " Found on Index : ");
                return mid;
            } else if (list.get(mid).compareTo(Data) > 0) {
                //If element is less than mid, then it can only be present in left sub-array or before mid or lower half
                high = mid - 1;
            } else {
                //Else the element can only be present in right sub-array or after mid or upper half
                low = mid + 1;
            }
        }
        //If element is not found
        System.out.print("Element Not Found : ");
        return -1;
    }

}
