public class SegregateZeroesAndOnes {
    // Two passes approach.....
    public static void segregate1(int arr[]) {
        int numZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numZeroes++;
            }
        }

        for (int i = 0; i < numZeroes; i++) {
            arr[i] = 0;
        }

        for (int i = numZeroes; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    // 2 pointer approach....
    public static void segregate2(int arr[]) {
        int n = arr.length;
        int i = 0, j = n-1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0};
        // segregate1(arr);

        segregate2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
