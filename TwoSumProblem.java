public class TwoSumProblem {
    // time complexity is O(n2)
    public static boolean twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-6, 8, 14, -2, 23, 47};
        int target = 2;
        System.out.println(twoSum(arr, target));
    }
}
