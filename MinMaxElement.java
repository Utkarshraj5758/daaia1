public class MinMaxElement {
    // Recursive function to find the minimum element
    public static int min(int[] arr, int index, int minVal) {
        if (index == arr.length) return minVal; // Base case: end of array
        return min(arr, index + 1, Math.min(minVal, arr[index])); // Recursive call
    }

    // Recursive function to find the maximum element
    public static int max(int[] arr, int index, int maxVal) {
        if (index == arr.length) return maxVal; // Base case: end of array
        return max(arr, index + 1, Math.max(maxVal, arr[index])); // Recursive call
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 67, 89, 100, 245};

        // Start from index 0, passing the first element as initial min/max
        int minVal = min(arr, 0, arr[0]);
        int maxVal = max(arr, 0, arr[0]);

        // Print results
        System.out.println("Minimum Value: " + minVal);
        System.out.println("Maximum Value: " + maxVal);
    }
}
