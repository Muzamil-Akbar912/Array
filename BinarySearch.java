public class BinarySearch {
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start+end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int key = 34;

        int idx = search(arr, key);
        if (idx != -1) {
            System.out.println("Found at index " + idx);
        } else {
            System.out.println("Not found");
        }
    }
}
