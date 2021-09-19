package Lab10;
//Lab10 9am
//Daniel Rochefort

public class Lab10_ClientSearching {

    public static void main(String[] args){
        System.out.println("Sequential Search #1 Index: " + sequentialSearch(new int[] {3,5,2,9,8,5,1},8));
        System.out.println("Sequential Search #2 Index: " + sequentialSearch(new int[] {3,5,2,9,7,5,1},8));

        System.out.println("\nBinary Search #1 Index: " + binarySearch(new int[] {1,3,4,6,9,12,22,46},22));
        System.out.println("Binary Search #2 Index: " + binarySearch(new int[] {1,3,4,6,9,12,22,46},23));

        int[] recursiveBinarySearchArray = {1,5,7,10,11,26,44,69};
        System.out.println("\nRecursive Binary Search #1 Index: " + recursiveBinarySearch(7,0,recursiveBinarySearchArray.length-1,recursiveBinarySearchArray));
        System.out.println("Recursive Binary Search #2 Index: " + recursiveBinarySearch(9,0,recursiveBinarySearchArray.length-1,recursiveBinarySearchArray));
    }

    public static int sequentialSearch(int[] array, int num){
        for(int i = 0; i < array.length; i++){
            if(num == array[i]){
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] array, int key){
        int first = 0;
        int last = array.length-1;
        int mid;

        while(first <= last){
            mid = (first + last)/2;
            if(array[mid] < key){
                first = mid+1;
            } else if(array[mid] == key){
                return mid;
            } else {
                last = mid-1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int key, int first, int last, int[] array){
        if(last >= first){
            int mid = (first + (last - first)/2);
            if(array[mid] == key){
                return mid;
            } else if(array[mid] > key){
                return recursiveBinarySearch(key, first, mid-1, array);
            } else {
                return recursiveBinarySearch(key, mid+1, last, array);
            }
        }
        return -1;
   }
}
