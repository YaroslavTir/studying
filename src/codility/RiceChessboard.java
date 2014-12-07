package codility;

/**
 * @author YMolodkov
 *        <p/>
 *        Accepts input from standard input and writes result to standard
 *        output.
 *        <p/>
 *        The first two lines of input will be single numbers that define
 *        the number of rows and columns. Each subsequent line will
 *        represent one row of the chessboard, with the number of grains
 *        of rice in each cell separated by spaces.
 *        <p/>
 *        For example the input:
 *        <p/>
 *        <pre>
 *        4 4
 *        2 2 4 2
 *        0 3 0 1
 *        1 2 2 1
 *        4 1 2 2
 *        <pre/>
 *        <p/>
 *        Should print to standard output:
 *        <p/>
 *        15
 */

public class RiceChessboard {
    public static void main(String args[]) {

        int[][] A = {{2, 2, 4, 2}
                , {0, 3, 0, 1}
                , {1, 2, 2, 1}
                , {4, 1, 2, 2}};
        RiceChessboard riceChessboard = new RiceChessboard();
        System.out.println(riceChessboard.solution(A));
    }

    private int collectGrains(int[][] chessboard) {
        int maxGrains = 0;
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if (i > 0 && j > 0) {
                    chessboard[i][j] += Math.max(chessboard[i - 1][j], chessboard[i][j - 1]);
                } else if (i == 0 && j > 0) {
                    chessboard[i][j] += chessboard[i][j - 1];
                } else if (j == 0 && i > 0) {
                    chessboard[i][j] += chessboard[i - 1][j];
                }
                maxGrains = chessboard[i][j];
            }

        }
        return maxGrains;
    }

    public int solution(int[][] A) {
        return collectGrains(A);
    }


}