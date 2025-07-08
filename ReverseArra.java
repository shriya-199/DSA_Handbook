class ReverseArra {

    // Function to reverse the array from index i to j
    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 3};
        int n = arr.length;
        int k = 0;
        int j = n - 1;

        // Correctly calling the reverse function once
        reverse(arr, k, j);  // This will reverse the full array

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
