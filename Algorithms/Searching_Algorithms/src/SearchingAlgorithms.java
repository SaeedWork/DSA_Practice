public class SearchingAlgorithms {


    //Linear Search
    // Time Complexity = O(n)
    public int linearSearchIterative(int arr[], int key){
        for(int i=0; i < arr.length; i++){
            if (key == arr[i]){
                System.out.println("Data found on index : " + i);
                return i;
            }
        }
        return -1;
    }


    //Binary Search
    // Time Complexity = O(nLog n)
    public int binarySearchIterative(int arr[], int key){

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = Math.round((low + high)/2);

            if (arr[mid] == key){
                System.out.println("Data found on Index : " + mid);
                return mid;
            }else if(arr[mid] > key){
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }

        System.out.println("Data not found");
        return -1;
    }

    //linear Search

}
