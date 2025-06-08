//6.Left rotate a 1D array by k positions.

import java.util.*;
public class LeftRotate1D {
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        
        int[] temp = new int[n];

        int index = 0;
        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;

        leftRotate(arr, k);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
