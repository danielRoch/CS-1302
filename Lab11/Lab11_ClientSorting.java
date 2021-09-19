package Lab11;
//Lab11 9am
//Daniel Rochefort

import java.util.*;

public class Lab11_ClientSorting {
    public static void main(String[] args){
        int[] selectionSortArray = {4,8,5,67,9,15,100,3,2,1,49,91,83,6};
        int[] bubbleSortArray = {8,5,4,7,6,14,3,1,9,63,54,84,39,11};
        int[] insertSortArray = {85,6,3,47,1,5,2,4,59,64,156,35,54,9,82};

        System.out.println("Selection Sort Array before the sort: " + Arrays.toString(selectionSortArray));
        System.out.println("Selection Sort Array after the sort: " + Arrays.toString(SelectionSorter(selectionSortArray)));

        System.out.println("\nBubble Sort Array before the sort: " + Arrays.toString(bubbleSortArray));
        System.out.println("Bubble Sort Array after the sort: " + Arrays.toString(BubbleSorter(bubbleSortArray)));

        System.out.println("\nInsert Sort Array before the sort: " + Arrays.toString(insertSortArray));
        System.out.println("Insert Sort Array after the sort: " + Arrays.toString(InsertSorter(insertSortArray)));

    }

    public static int[] SelectionSorter(int[] array){
        //Starting from the start of the array & picking the max then afterwards swapping the numbers so the array is in ascending order

//        for(int i = 0; i < array.length-1; i++){
//            int max = i;
//            for(int j = i+1; j < array.length; j++){
//                if(array[j] > array[max]){
//                    max = j;
//                }
//            }
//            int temp = array[max];
//            array[max] = array[i];
//            array[i] = temp;
//        }
//        int k = array.length-1;
//        for(int i = 0; i < (array.length)/2; i++){
//            int temp = array[i];
//            array[i] = array[k];
//            array[k] = temp;
//            k--;
//        }

        //Starting from the end of the array & picking the max

        for(int i = 0; i < array.length-1; i++){
            int max = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            int temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }


        return array;
    }

    public static int[] BubbleSorter(int[] array){
        for(int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] InsertSorter(int[] array){
        for(int i = 1; i < array.length; ++i){
            int key = array[i];
            int j = i-1;

            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }
}
