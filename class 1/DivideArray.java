import java.util.*;

public class DivideArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        
        List<List<Integer>> result = divideArray(nums, k);
        
        if (result.isEmpty()) {
            System.out.println("It is impossible to satisfy the conditions.");
        } else {
            System.out.println("Arrays after division:");
            for (List<Integer> array : result) {
                System.out.println(array);
            }
        }
    }
    
    public static List<List<Integer>> divideArray(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentArray = new ArrayList<>();
        
        for (int num : nums) {
            if (currentArray.isEmpty() || Math.abs(num - currentArray.get(currentArray.size() - 1)) <= k) {
                currentArray.add(num);
            } else {
                if (currentArray.size() < 3) {
                    return new ArrayList<>(); // Impossible to satisfy conditions
                }
                result.add(new ArrayList<>(currentArray));
                currentArray.clear();
                currentArray.add(num);
            }
        }
        
        if (currentArray.size() < 3) {
            return new ArrayList<>(); // Impossible to satisfy conditions
        }
        
        result.add(currentArray);
        return result;
    }
}
