public class AllOccurance {
    // All occurance
    public static void printAllOccur(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printAllOccur(arr, 2);
    }
}