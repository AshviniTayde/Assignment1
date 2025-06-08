//Q1.Reverse an array ( using extra space).

//2 nd method
public class ReverseArray2 {
    public static void main(String[] args) {
       // int[] arr={3,0,-9,6,5,4,3}; or
        int[] arr= new int[]{3,0,-9,6,5,4,3};   // arr: {3,0,-9,6,5,4,3,}
       int[] reversed = new int[7];    // reversed: {0,0,0,0,0,0,0}
    
        for (int i = 0; i < 7; i++) {
            reversed[i]=arr[7-1-i];
            
        }
        for(int x:reversed){
            System.out.println(x);
        }
    }
    
}
