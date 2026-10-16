import java.util.Arrays;

public class ContainsDuplicate {
    // Approach 01
    public static boolean containsDuplicate(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 4};
        System.out.println(containsDuplicate(arr));
    }
}
