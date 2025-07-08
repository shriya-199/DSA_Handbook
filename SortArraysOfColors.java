import java.util.*;

public class SortArraysOfColors {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1, 1, 0};
        Arrays.sort(arr);
        System.out.println("Sorted using Arrays.sort(): " + Arrays.toString(arr));

        // Method 2: Count 0s, 1s, 2s
        int arr1[] = {1, 0, 2, 1, 0, 2, 1, 0};
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) zero++;
            else if (arr1[i] == 1) one++;
            else if (arr1[i] == 2) two++;
        }

        for (int i = 0; i < zero; i++) arr1[i] = 0;
        for (int i = zero; i < zero + one; i++) arr1[i] = 1;
        for (int i = zero + one; i < arr1.length; i++) arr1[i] = 2;

        System.out.print("Sorted using counting: ");
        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");
        System.out.println();

        // Method 3: Dutch National Flag
        int arr2[] = {0, 1, 2, 0, 1, 2, 0, 1};
        int low = 0, mid = 0, high = arr2.length - 1;

        while (mid <= high) {
            if (arr2[mid] == 0) {
                swap(arr2, low, mid);
                low++;
                mid++;
            } else if (arr2[mid] == 1) {
                mid++;
            } else {
                swap(arr2, mid, high);
                high--;
            }
        }

        System.out.print("Sorted using Dutch National Flag: ");
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
    }
}
