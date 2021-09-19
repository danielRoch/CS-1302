package Lab1;
import java.util.*;

public class Lab1_ArrayIsSorted {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("The number of elements you would like in the array: ");
        int numElements = in.nextInt();
        int arr[] = new int[numElements];

        for(int i=0; i<numElements; i++) {
            System.out.print("Enter the numbers you would like in the array by pressing enter after each number:");
            int arrElements = in.nextInt();
            arr[i] = arrElements;
        }
        System.out.println("Is the array sorted: " + isSorted(arr));

        in.close();
    }

    public static boolean isSorted(int[] a){
        for(int i=0; i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
}
