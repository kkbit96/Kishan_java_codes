import java.util.HashMap;
public class CountDistinct {
    public static int countDistinct(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
                count++;
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 7;
        System.out.println(countDistinct(arr, k));
    }
}
