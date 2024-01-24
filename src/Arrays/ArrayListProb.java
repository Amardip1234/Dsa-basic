package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProb {
    static void reverselist(ArrayList<Integer>list){
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            Integer temp = Integer.valueOf(list.get(left));
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ArrayList  <Integer> arr = new ArrayList<>() ;

        for (int i =0; i<=5; i++){
            arr.add(i);
        }

        System.out.println(arr);
        arr.remove(2);

        System.out.println(arr);










//        ArrayList<Integer>list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println("Original list" + list);
////        reverselist(list);
////
//        Collections.reverse(list);
//        System.out.println("Reversed List" + list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("Sorted in Asc" + list);

    }
}
