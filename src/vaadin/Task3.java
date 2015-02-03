package vaadin;

import java.util.NavigableMap;

/**
 * @author ymolodkov
 * @date 14/01/15.
 * @since 0.1
 */
public class Task3 {

    // An array of positive integers is given. Implement a function that
    // returns the smallest sum of pairs in the array, so that

    // - Neither number in the pair can be the first or last number in the array
    // - The numbers can't be next to each other in the array
    public static void main(String[] args) {
        int[] chain = new int[]{1, 2, 4, 3, 9, 6, 4, 7};
        System.out.println(smallestSum(chain)); // What should this print?
    }

    //O(n*n)
    private static int smallestSum(int[] arr) {
        int smallestSum = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length - 2; i++) {
            for (int j = i + 2; j < arr.length - 1; j++) {
                int pairsSum = arr[i] + arr[j];
                if (pairsSum < smallestSum) smallestSum = pairsSum;
                if (smallestSum == 1) return smallestSum;
            }
        }
        return smallestSum;
    }

    
    
}
