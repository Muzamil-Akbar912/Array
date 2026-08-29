public class MulOddIdxBy2AndEvenBy10 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // even index
                arr[i] = 10 * arr[i];
            }
            // odd index
            else {
                arr[i] = 2 * arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
