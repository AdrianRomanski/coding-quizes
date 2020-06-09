package adrianromanski.arcade.level3;
//Given an array of strings, return another array containing all of its longest strings.
public class AllLongestStrings {

    static String[] allLongestStrings(String[] inputArray) {
        int max = 1;
        int count = 0;
        // LINEAR O(n)
        for (String s : inputArray) {
            if (s.length() == max) {
                count += 1;
            } else if (s.length() > max) {
                max = s.length();
                count = 1;
            }
        }
        String[] output = new String[count];
        count = 0;
        // LINEAR O(n)
        for(String s : inputArray) {
            if(s.length() == max) {
                output[count] = s;
                count++;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        String[] array = {"aba", "aa", "ad", "vcd", "aba"}; //  ["aba","vcd","aba"]

        String[] sorted = allLongestStrings(array);

        for(String s: sorted) {
            System.out.print(s + " ");
        }
    }
}
