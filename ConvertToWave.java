public class ConvertToWave {
    public static void wave(int arr[]) {
        for (int i = 0; i < arr.length-1; i+=2) {
            // swap..
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        // Array is sorted...
        int arr[] = {2, 4, 7, 8, 9, 10};

        wave(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
