package vaadin;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class Task1 {

    //    public static void main(String[] args) {
//        int[] ints = splitByNumber(1);
//        System.out.println(ints);
//
//    }

    public static void main(String[] args) {
        System.out.println(solution(Integer.MAX_VALUE, Integer.MAX_VALUE)); //152634
    }

    /**
     * Mixes digits from the input integers to form the output.
     * Picks one digit
     * at a time from the input numbers, starting from the first digit in the
     * first number, continuing with the first digit in the second number, then
     * the second digit in the first number etc.
     * <p/>
     * Example input: 1234, 56 -> output: 152634
     * <p/>
     * Example input: 56, 1234 -> output: 516234
     *
     * @param A the first input number
     * @param B the second input number
     * @return a mix of A and B
     */
    private static int solution(int A, int B) {
        int[] a = splitByNumber(A);
        int[] b = splitByNumber(B);
        int[] c = new int[21];
        for (int i = 0; i < c.length; i++) {
            c[i] = -1;
        }
        for (int i = 0; i < a.length; i++) {
            c[i * 2] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i * 2 + 1] = b[i];
        }
        String result = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 0) {
                result += c[i];
            }
        }
        return Integer.valueOf(result);
    }

    private static int[] splitByNumber(int n) {
        int number = n;
        int length = String.valueOf(n).length();//should rewrite it
        int[] result = new int[length];
        int i = 0;
        while (number > 0) {
            result[length - i-1] = number % 10;
            number = number /10;
            i++;
        }
        return result;
    }


}
