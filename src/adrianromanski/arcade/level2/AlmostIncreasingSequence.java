package adrianromanski.arcade.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Given a sequence of integers as an array,
//determine whether it is possible to obtain a strictly increasing
//sequence by removing no more than one element from the array.
//Example
//For sequence = [1, 3, 2, 1], the output should be
//almostIncreasingSequence(sequence) = false.
//There is no one element in this array that can be removed in order to get a strictly increasing sequence.
//For sequence = [1, 3, 2], the output should be
//almostIncreasingSequence(sequence) = true.
//You can remove 3 from the array to get the strictly increasing sequence [1, 2].
//Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
public class AlmostIncreasingSequence {

        static boolean almostIncreasingSequence(int[] sequence) {
                List<Integer> list = Arrays.stream(sequence).boxed().collect(Collectors.toList());
                for(int i = 0; i < list.size(); i++) {
                    List<Integer> cloned_list = new ArrayList<>(list);
                    cloned_list.remove(i);
                    if(checkIncreasing(cloned_list)) {
                        return true;
                    }
                }
                return false;
        }

        static boolean checkIncreasing(List<Integer> list){
            for(int i = 0; i < list.size(); i++) {
                if(i < list.size() - 1) {
                    if(list.get(i) >= list.get(i + 1)) {
                        return false;
                    }
                }
            }
            return true;
        }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 2, 1}; // false
        int[] array2 = {1, 3, 2}; // true
        int[] array3 = {1, 2, 1, 2}; // false
        int[] array4 = {3, 6, 5, 8, 10, 20, 15}; // false
        int[] array5 = {1, 1, 2, 3, 4, 4}; // false
        int[] array6 = {10, 1, 2, 3, 4, 5}; // true
        int[] array7 = {3, 5, 67, 98, 3}; // true
        int[] array8 = {1, 2, 3, 4, 3, 6}; // true

        System.out.println(almostIncreasingSequence(array1));
        System.out.println(almostIncreasingSequence(array2));
        System.out.println(almostIncreasingSequence(array3));
        System.out.println(almostIncreasingSequence(array4));
        System.out.println(almostIncreasingSequence(array5));
        System.out.println(almostIncreasingSequence(array6));
        System.out.println(almostIncreasingSequence(array7));
        System.out.println(almostIncreasingSequence(array8));
    }
}
