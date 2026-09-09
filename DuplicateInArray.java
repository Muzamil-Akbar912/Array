public class DuplicateInArray {
    // Duplicate element in array...
    public static void duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate = " + arr[i]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2, 3, 5};
        duplicate(arr);
    }
}
