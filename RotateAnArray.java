public class RotateAnArray {
    // Reverse an array...
    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            // swap..
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    // Rotate an array code...
    public static void rotateAnArray(int arr[], int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        rotateAnArray(arr, 4);
    }
}
