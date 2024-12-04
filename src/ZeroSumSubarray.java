import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {
    public static boolean zeroSumSubarray(int[] arr) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (set.contains(sum) || sum == 0) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4, -3, 2, 1};
        if (zeroSumSubarray(arr)) {
            System.out.println("Subarray exists with sum 0");
        } else {
            System.out.println("Subarray does not exist with sum 0");
        }
    }
}
