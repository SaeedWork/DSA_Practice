public class SortingAlgorithms {

    //Bubble Sort Method
    //Time Complexity = O(n^2)
    public void bubbleSort(int arr[]){
        //Outer Loop for Passes
        for(int i = 0; i < arr.length-1; i++){
            //Creating Swap Flag
            boolean flag = false;

            //Inner loop for Iterations
            for (int j = 0; j < arr.length-i-1 ; j++){
                //Checking for if Swap Required
                if (arr[j] > arr[j+1]){
                    //Swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //Setting the Flag
                    flag = true;
                }
                //Checking if the flag is not turned so array is already Sorted.
                if (flag = false){
                    System.out.println("The Array is Sorted");
                    return;
                }

            }
        }
    }



    //Selection Sort
    //Time Complexity = O(n^2)
    public void selectionSort(int arr[]){
        //Outer loop for passes
        for(int i = 0; i < arr.length-1 ; i++){
            //creating a min variable for setting minimum
            int min = i;
            //Inner Loop for Iteration
            for(int j = i+1 ; j < arr.length; j++){
                //checking and setting the new minimum
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //Swapping for minimum after inner loop runs and sets min
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    //Insertion Sort
    // Time Complexity = O(n^2)
    public void insertionSort(int arr[]){
        //Start loop from 2nd element , first is already sorted
        for (int i = 1; i < arr.length ; i++){
            // make a temprary storage variable
            int current = arr[i];
            //start checking from 1st element
            int j = i-1;
            //only shift those elements where current is smaller
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //make space and place current in its right position
            arr[j+1] = current;
        }
    }

    //Quick Sort
    //Time Complexity - Worst Case = O(n^2)
    //Time Complexity - Average and Best Case = O(nLog(n))
    public void inlineQuickSort(int array, int l, int h){

    }
    public int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j= low; j < high; j++){
            if(arr[j] < pivot){
                i++;

                //Swap
                int temp = arr[i];
                arr[i] = arr [j];
                arr[j] = temp;
            }
        }
        //Swapping Pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public void quickSort(int arr[], int low, int high){
        if (low < high){
            int pIndex = partition(arr, low, high);

            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }


    //Merge Sort
    //Time Complexity = O(nLog n)
    public void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for(int i = 0 , j = si ; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }


    }
    public void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        conquer(arr, si, mid, ei);
    }


}
