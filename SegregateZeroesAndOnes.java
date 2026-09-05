public class SegregateZeroesAndOnes {
    public static void segregate(int arr[]) {
        int numZeroes = 0;
        int numOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numZeroes++;
            } else {
                numOnes++;
            }
        }

        for (int i = 0; i < numZeroes; i++) {
            arr[i] = 0;
        }

        for (int i = numZeroes; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0};
        segregate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
