package veer.com;

public class MoveZeroLeft {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index = arr.length - 1; // position for non-zero (from right)
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        // Fill remaining places with zeros at the beginning
        while (index >= 0) {
            arr[index--] = 0;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
