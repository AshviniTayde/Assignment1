//2.Find the maximum and minimum element in a 2D
public class Max_Min2D {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{5,16,7},{0,-4,8}};
        int max=arr[0][0];
        int min=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>max)
                max=arr[i][j];
                if(arr[i][j]<min)
                min=arr[i][j];

            }
        }
        System.out.println("maximun element is" + max);
        System.out.println("maximun element is" + min);
    }
}
