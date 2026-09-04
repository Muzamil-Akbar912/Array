public class MissingNumberInArray {
    public static int missing(int arr[]) {
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return (int)(sum - arraySum);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7};
        System.out.println("The missing number in an array is " + missing(arr));
    }
}
