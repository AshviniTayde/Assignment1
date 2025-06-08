//9.Count the frequency of each element in a 1D array
import java.util.Arrays;
public class FrequencyEl {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 30, 20, 10 };
        boolean[] visited = new boolean[arr.length];
        System.out.println("Element Frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(arr[i] + " => " + count);
        }
    }
}
