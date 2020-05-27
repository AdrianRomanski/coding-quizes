package adrianromanski.arcade.level1;

public class CheckPalindrome {

    static boolean checkPalindrome(String inputString) {
        // Some defensive coding
        if(inputString.isEmpty()) {
            return false; // Good place for exception rather than false
        }
        inputString = inputString.toLowerCase();
        char[] charArray = inputString.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = charArray.length - 1; i >= 0; i--) {
            builder.append(charArray[i]);
        }
        String reversed = builder.toString();
        return reversed.equals(inputString);
    }

    public static void main(String[] args) {

        // They should all returns true
        System.out.println(checkPalindrome("AnNa"));
        System.out.println(checkPalindrome("CIVic"));
        System.out.println(checkPalindrome("KayaK"));
        System.out.println(checkPalindrome("MaDam"));
        System.out.println(checkPalindrome("MOM"));
        System.out.println(checkPalindrome("noon"));
        System.out.println(checkPalindrome("raCecar"));

        // Some random strings that are not palindromes
        System.out.println(checkPalindrome("Blue"));
        System.out.println(checkPalindrome("Violet"));
        System.out.println(checkPalindrome("Red"));
        System.out.println(checkPalindrome("Black"));
        System.out.println(checkPalindrome("White"));

        // Empty string
        System.out.println("Empty String");
        System.out.println(checkPalindrome(""));

    }
}
