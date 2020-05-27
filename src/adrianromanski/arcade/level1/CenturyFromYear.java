package adrianromanski.arcade.level1;

public class CenturyFromYear {

    static int centuryFromYear(int year) {
        if (year >= 100) {
            int century = year / 100;
            if(year % 100 > 0) {
                century+=1;
            }
            return century;
        } else if (year > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(centuryFromYear(1905)); // 20
        System.out.println(centuryFromYear(1700)); // 17
        System.out.println(centuryFromYear(1701)); // 18
        System.out.println(centuryFromYear(700)); // 7
        System.out.println(centuryFromYear(701)); // 8
        System.out.println(centuryFromYear(70)); // 1
        System.out.println(centuryFromYear(0)); // 0
        System.out.println(centuryFromYear(-5)); // 0 - I could throw exception but that's not a part of exercise

    }
}
