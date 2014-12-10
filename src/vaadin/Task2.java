package vaadin;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class Task2 {


    public static void main(String[] args) {
        System.out.println(solution(1234, 56)); //152634
        System.out.println(solution(56, 1234)); //516234
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

    private static int numberLength(int number) {
        return String.valueOf(number).length();
    }

    private static int solution(int A, int B) {
        int result = 0;
        int lengthA = numberLength(A);
        int lengthB = numberLength(B);
        int min = Math.min(lengthA, lengthB);
        int max = Math.max(lengthA, lengthB);
        int number1 = A;
        int number2 = B;
        int number3 = 0;
        if (lengthA > lengthB) {
            number1 = (int) (A / Math.pow(10, min));
            number3 = (int) (A % Math.pow(10, min));
        }
        if (lengthB > lengthA) {
            number2 = (int) (B / Math.pow(10, min));
            number3 = (int) (B % Math.pow(10, min));
        }

        for (int i = 0; i < min; i++) {
            result += number1 % 10 * Math.pow(10, i * 2 + 1);
            result += number2 % 10 * Math.pow(10, i * 2);
            number1 = number1 / 10;
            number2 = number2 / 10;
        }
        result = (int) (result * Math.pow(10, max - min)) + number3;
        return result;
    }

}
