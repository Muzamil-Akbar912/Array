public class SubArrays {
    public static void subArrays(int arr[]) {
        int tpp = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                tpp++;
                System.out.println();
            }
        }
        // Total subArrays = (n(n+1))/2
        System.out.println("Total subArrays = " + tpp);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        subArrays(arr);
    }
}
