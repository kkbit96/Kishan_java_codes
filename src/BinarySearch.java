public class BinarySearch {
    static int binarySearch(int arr[], int n, int x){
        int low = 0, high = n - 1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid]>x) {
                high = mid - 1;
            } else {
                low = mid + 1;    
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, n, x);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
