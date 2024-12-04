import java.util.HashMap;

public class SubarrayWithSum {
    public static int subarrayWithSum(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k)
                maxLen = i + 1;
            if (!map.containsKey(sum))
                map.put(sum, i);
            if(map.containsKey(sum-k)){
                if(maxLen<(i-map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(subarrayWithSum(arr, k));
    }
}
