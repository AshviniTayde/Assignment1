//7.Find the second largest/smallest element in a 1D array
import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 0, 4, -5, 3, 24, 4, 5, 77, 32 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("2nd Largest element of the array is:: " + arr[1]);

    }

}
