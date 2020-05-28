package adrianromanski.arcade.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Ratiorg got statues of different sizes as a present from CodeMaster
//for his birthday, each statue having an non-negative integer size.
//Since he likes to make things perfect, he wants to arrange them from smallest to largest so
//that each statue will be bigger than the previous one exactly by 1.
//He may need some additional statues to be able to accomplish that.
//Help him figure out the minimum number of additional statues needed.
public class MakeArrayConsecutive {

    static int makeArrayConsecutive(int[] statues) {
        List<Integer> list =  Arrays.stream(statues)
                .boxed()
                .sorted(Integer::compareTo)
                .distinct()
                .collect(Collectors.toList());
        return (list.get(list.size() - 1) - list.get(0) - list.size() + 1);
    }


    public static void main(String[] args) {

        int[] array = {6, 2, 2, 3, 3, 8}; // answer 3 bc - 2, 3, [4], [5], 6, [7], 8

        System.out.println(makeArrayConsecutive(array));
    }
}
