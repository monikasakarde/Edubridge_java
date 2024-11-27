package nov8;

public class Source {

    public static void getSecondSmallest(int[] arr) {
        // Handle case where the array has less than two elements
        if (arr == null || arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        // Initialize the smallest and second smallest to a very large value
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array to find the smallest and second smallest numbers
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest before smallest
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // If second smallest is still Integer.MAX_VALUE, it means there was no second smallest number
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Second smallest number: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {23, 45, 32, 22, 20, 96};
        
        // Call the method to find the smallest and second smallest
        getSecondSmallest(arr);
    }
}
