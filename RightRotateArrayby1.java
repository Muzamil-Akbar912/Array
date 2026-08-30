public class RightRotateArrayby1 {
    public static void rotate(int arr[]) {
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1]; 
        }
        arr[0] = last;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        rotate(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
