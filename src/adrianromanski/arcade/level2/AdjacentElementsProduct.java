package adrianromanski.arcade.level2;

//Given an array of integers, find the pair of adjacent elements
//that has the largest product and return that product.
public class AdjacentElementsProduct {

    static int adjacentElementsProduct(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length; i = i+1) {
            if(i == inputArray.length - 1) {
                return max;
            }
            int product = inputArray[i] * inputArray[i + 1];
            if(product > max) {
                max = product;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] intArray1 = {3, 6, -2, -5, 7, 3};
        int[] intArray2 = {-1, -2};
        int[] intArray3 = {5, 1, 2, 3, 1, 4};
        int[] intArray4 = {1, 2, 3, 0};
        int[] intArray5 = {9, 5, 10, 2, 24, -1, -48};

        System.out.println(adjacentElementsProduct(intArray1));
        System.out.println(adjacentElementsProduct(intArray2));
        System.out.println(adjacentElementsProduct(intArray3));
        System.out.println(adjacentElementsProduct(intArray4));
        System.out.println(adjacentElementsProduct(intArray5));
    }

}
