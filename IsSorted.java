public class IsSorted {
    // Is sorted function...
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 8, 9, 10};

        System.out.println(isSorted(arr));
    }
}
