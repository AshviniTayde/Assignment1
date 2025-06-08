
// 3.3.Sum of all elements in a 1D
public class SumOF1D {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // add each element to sum
        }

        System.out.println("Sum of array elements: " + sum);
    }
}


