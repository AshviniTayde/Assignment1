   //3.Sum of all elements in a 2D
   public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {
             {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {           // for row loop
            for (int j = 0; j < arr[i].length; j++) {    // for column loop
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}


