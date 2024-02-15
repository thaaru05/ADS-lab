/*
Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing
number from the first N integers.
Note: There are no duplicates in the list.
Examples:
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: Here the size of the array is 7, so the range will be [1, 8]. The missing number
between 1 to 8 is 5*/
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
