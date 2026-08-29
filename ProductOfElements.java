public class ProductOfElements {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 2};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        System.out.println("Product of elements of array = " + product);
    }
}