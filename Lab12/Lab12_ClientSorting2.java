package Lab12;
//Lab12 9am
//Daniel Rochefort

import java.util.*;

public class Lab12_ClientSorting2 {
    public static void main(String[] args){
        String[] selectionSortArray = {"inside","brave","purple","form","seen","oil","octopus"};
        String[] insertSortArray = {"physical","sent","among","basket","seven","brief","pie"};
        int[] dualSelectionSortArray = {85,6,3,47,1,5,2,4,59,64,156,35,54,9,82};

        System.out.println("Selection Sort Array before the sort: " + Arrays.toString(selectionSortArray));
        System.out.println("Selection Sort Array after the sort: " + Arrays.toString(SelectionSorter(selectionSortArray)));

        System.out.println("\nInsert Sort Array before the sort: " + Arrays.toString(insertSortArray));
        System.out.println("Insert Sort Array after the sort: " + Arrays.toString(InsertSorter(insertSortArray)));

        System.out.println("\nDual Selection Sort Array before the sort: " + Arrays.toString(dualSelectionSortArray));
        System.out.println("Dual Selection Sort Array after the sort: " + Arrays.toString(dualSelectionSorter(dualSelectionSortArray)));

    }

    public static String[] SelectionSorter(String[] array){
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j].compareTo(array[min]) < 0){
                    min = j;
                }
            }
            String temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }


    public static String[] InsertSorter(String[] array){
        for(int i = 1; i < array.length; ++i){
            String key = array[i];
            int j = i-1;

            while(j >= 0 && array[j].compareTo(key) > 0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }

    public static int[] dualSelectionSorter(int[] array){
        int length = array.length;
        for(int i = 0, j = length-1; i < j; i++, j--){
            int min = array[i], max = array[i];
            int min_index = i, max_index = i;
            for(int k = i+1; k <= j; k++){
                if(array[k] > max){
                    max = array[k];
                    max_index = k;
                } else if(array[k] < min){
                    min = array[k];
                    min_index = k;
                }
            }

            //Swaps Min
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;

            //Swaps Max
            if(array[min_index] == max){
                temp = array[min_index];
                array[min_index] = array[j];
            } else {
                temp = array[max_index];
                array[max_index] = array[j];
            }
            array[j] = temp;
        }
            return array;
    }
}
