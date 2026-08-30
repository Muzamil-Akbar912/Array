public class LeftRotateArrayBy1 {
    public static void rotate(int arr[]) {
        int j = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = j;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        rotate(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
