package com.DataStructure.Recursion;
import java.util.ArrayList;
import java.util.List;
public class Subsequence {
        // Helper function to find subsequences
        static void findSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
            // Base case: if index reaches the end of the array, add the current subsequence to the result
            if (index == arr.length) {
                result.add(new ArrayList<>(current));  // Add a copy of the current subsequence
                return;
            }

            // Include the current element in the subsequence
            current.add(arr[index]);
            findSubsequences(arr, index + 1, current, result);

            // Backtrack: Exclude the current element from the subsequence
            current.remove(current.size() - 1);
            findSubsequences(arr, index + 1, current, result);
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3};  // Example array
            List<List<Integer>> result = new ArrayList<>();
            findSubsequences(arr, 0, new ArrayList<>(), result);

            // Print the subsequences
            System.out.println("Subsequences:");
            for (List<Integer> subsequence : result) {
                System.out.println(subsequence);
            }
        }
}


