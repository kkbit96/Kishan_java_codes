import java.util.HashMap;

public class PrintSubArraywithSum {
    public static void printSubarraysWithSum(int[] arr, int targetSum) {
        int n = arr.length;
        int cumulativeSum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();

        // Initialize the map with 0 sum having one count
        sumMap.put(0, 1);

        for (int i = 0; i < n; i++) {
            cumulativeSum += arr[i];

            // Check if (cumulativeSum - targetSum) exists in the map
            if (sumMap.containsKey(cumulativeSum - targetSum)) {
                int count = sumMap.get(cumulativeSum - targetSum);
                for (int j = 0; j < count; j++) {
                    System.out.println("Subarray with given sum found ending at index " + i);
                }
            }

            // Update the map with the current cumulative sum
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 9;
        printSubarraysWithSum(arr, targetSum);
    }
}
