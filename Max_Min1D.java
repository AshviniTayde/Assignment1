//2.Find the maximum and minimum element in a 1D
public class Max_Min1D {
    public static void main(String[] args) {
        int a[] = new int[] { 23, 1, 2, 3, 4, 5, 6, -7, 8, 9, 99, 23 };
        int max = a[0];
        int min=a[0];
        for (int i = 0; i < 12; i++) 
        {
            if (max < a[i])
            max = a[i];

            if(a[i]<min)
            min=a[i];
        }
       
        System.out.println("maximun element is" + max);
        System.out.println("maximun element is" + min);


    }

}
