//4.Check if a 1D array is sorted (ascending/descending).
public class Check1D_asceORdesc {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2,0, 3, 4, 5, 8 };
        boolean isAsecnding = true;
        boolean isDesending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isAsecnding = false;
            }
            if (arr[i] > arr[i + 1]) {
                isDesending = false;

            }
        }
        if (isAsecnding) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isDesending) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }

    }

}