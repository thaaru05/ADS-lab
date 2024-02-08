import java.util.Arrays;

public class MaxValueAfterOperations {
    public static void main(String[] args) {
        int n = 5; // Size of the array
        int[][] operations = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}}; // Example list of operations

        int[] arr = new int[n]; // Initialize array with zeros

        // Perform operations
        for (int[] operation : operations) {
            int startIndex = operation[0] - 1; // Convert to 0-indexed
            int endIndex = operation[1] - 1; // Convert to 0-indexed
            int valueToAdd = operation[2];

            arr[startIndex] += valueToAdd; // Add value to starting index
            if (endIndex + 1 < n) {
                arr[endIndex + 1] -= valueToAdd; // Subtract value from index after ending index
            }
        }

        // Compute prefix sum
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        // Find maximum value in the array
        int maxValue = Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum value after operations: " + maxValue);
    }
}
