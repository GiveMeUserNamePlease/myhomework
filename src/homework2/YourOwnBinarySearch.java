package homework2;

// NOT WORKING

public class YourOwnBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 17;
        int low=0;
        int high=array.length ;
        int mid = (high - low) / 2;
        while (array[mid] != element){
            if(array[mid] > element){
                mid = low + (mid - low) / 2;
            }
            else if(array[mid] < element){
                low = mid;
                mid = low + (high - low) / 2;
            }
            else{
                System.out.println("Position of element " + mid);
            }
        }
        System.out.println(mid);
    }
}
