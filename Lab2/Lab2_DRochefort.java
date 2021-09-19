package Lab2;
import java.util.*;
public class Lab2_DRochefort {
    public static void main(String[] args){
        int[] arr = new int[10];

        Scanner in = new Scanner(System.in);
        for(int i=0; i < arr.length; i++){
            System.out.println("Enter a number: ");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Here is the array in reverse: " + printReverse(arr));
        System.out.println("The highest valued element: " + getLargest(arr));
        System.out.println("The array with two times each element: " + computeTwice(arr));

        in.close();
    }
    public static String printReverse(int[] array){
        int temp;
        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i] = temp;
        }
        return Arrays.toString(array);
    }

    public static int getLargest(int[] array){
        int largest = 0;
        for(int i = 0; i < array.length-1; ++i) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static String computeTwice(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i]*2;
        }
        return Arrays.toString(array);
    }

}
