//Q1.Reverse an array (in-place).

//1 method
//Reverse an array (in-place or using extra space).
// so basically i set the two pionter to its indext value 
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={0,1,3,6,89,-1};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;  
        }
        for(int a:arr){
            System.out.println(a);
        }
       
    }
}
