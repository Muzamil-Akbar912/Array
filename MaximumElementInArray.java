public class MaximumElementInArray {
     public static void maximum(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The minimum element in array is " + max);

    }
     public static void main(String[] args) {
        int arr[] = {-6, 8, 14, -6, -2, 23, 47};

        maximum(arr);
        
    }
}
