public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max)
            max = arr[i];
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > smax && arr[i] != max)
            smax = arr[i];
        }
        return smax;
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 35};

        System.out.println(getSecondLargest(arr));
    }
}
