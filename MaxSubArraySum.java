public class MaxSubArraySum {
    // Approach 01 (BRUTE-FORCE) time complexity -> O(n3).....
    public static void maxSum1(int arr[]) {
        int MAX_SUM = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                if (sum > MAX_SUM) {
                    MAX_SUM = sum;
                }
            }
        }
        System.out.println("Maximum sub array sum = " + MAX_SUM);
    }

    // Maximum subarray sum (using prefix array) time complexity = O(n2) ....
    public static void maxSum2(int arr[]) {
        int MAX_SUM = Integer.MIN_VALUE;
        int cuurSum = 0;
        
        // prefix array...
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Max-sum calculate...
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                cuurSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; // yeh issliye lagaye tak jab start zero ho

                if (cuurSum > MAX_SUM) {
                    MAX_SUM = cuurSum;
                }
            }
        }
        System.out.println("Maximum sub array sum = " + MAX_SUM);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        // maxSum1(arr);
        maxSum2(arr);
    }
}
