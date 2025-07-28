import java.util.HashSet;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        int idx =0;
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                arr[idx++]= arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
