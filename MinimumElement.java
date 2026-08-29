public class MinimumElement {

    public static void minimum(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum element in array is " + min);

    }
     public static void main(String[] args) {
        int arr[] = {-6, 8, 14, -6, -2, 23, 47};

        minimum(arr);
    }
}
