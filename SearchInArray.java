public class SearchInArray {

    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-6, 8, 14, -2, 23, 47};
        int key = 14;

        int idx = search(arr, key);
        if (idx == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + idx);
        }
    }
}
