package adrianromanski.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    private static int checkForDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (Integer number : numbers) {
            if (!set.add(number)) {
                return number;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] integers1 = {2, 1, 3, 5, 3, 2}; // 3

        int[] integers2 = {2, 4, 3, 5, 1}; // -1 there is no duplicate

        int[] integers3 = {2, 2}; // 2

        int[] integers4 = {1}; // -1

        System.out.println(checkForDuplicate(integers1));
        System.out.println(checkForDuplicate(integers2));
        System.out.println(checkForDuplicate(integers3));
        System.out.println(checkForDuplicate(integers4));


    }
}
