
public class missing{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Example array, you can replace it with any input array

        int n = arr.length + 1; // Size of original array

        int expectedSum = n * (n + 1) / 2; // Sum of first N natural numbers
        int actualSum = 0; // Sum of elements in the array

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
