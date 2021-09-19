package Lab7;
//Lab7 9am
//Daniel Rochefort

import java.util.*;

public class Lab7_ArrayList {
    public static void main(String[] args){
      ArrayList<String> sentence = new ArrayList<>();
      sentence.add("madam");
      sentence.add("I");
      sentence.add("am");
      sentence.add("your");
      sentence.add("adam");
      sentence.add("savage");
      sentence.add("from");
      sentence.add("mythbusters");
      System.out.println("The original sentence is: " + sentence);

      System.out.println("Removing odd length words from the sentence leaves: " + removeOddLength(sentence));

      System.out.println("Swapping pairs of the remainder of the sentence is: " + swapPairs(sentence));

      System.out.println();//spacing println

      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(1);
      list1.add(4);
      list1.add(8);
      list1.add(9);
      list1.add(11);
      list1.add(15);
      list1.add(17);
      list1.add(28);
      list1.add(41);
      list1.add(59);
      System.out.println("ArrayList1: " + list1);

      ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(4);
      list2.add(7);
      list2.add(11);
      list2.add(17);
      list2.add(19);
      list2.add(20);
      list2.add(23);
      list2.add(28);
      list2.add(37);
      list2.add(59);
      list2.add(81);
      System.out.println("ArrayList2: " + list2);

      System.out.println("The intersecting numbers from ArrayList1 and ArrayList2 are: " + intersect(list1,list2));

    }


    public static ArrayList<String> removeOddLength(ArrayList<String> arrayList){
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.length() % 2 == 1) {
                iterator.remove();
            }
        }
        return arrayList;
    }

    public static ArrayList<String> swapPairs(ArrayList<String> arrayList){
        for(int i = 0; i < arrayList.size()-1; i = i+2){
            String temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(i+1));
            arrayList.set(i+1, temp);
        }
        return arrayList;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){
        ArrayList<Integer> intersection = new ArrayList<>();

        for(int i = 0; i < arrayList1.size(); i++){
            for(int j = 0; j < arrayList2.size(); j++){
                if(arrayList1.get(i).equals(arrayList2.get(j))) {
                    intersection.add(arrayList1.get(i));
                }
            }
        }

        return intersection;
    }
}
