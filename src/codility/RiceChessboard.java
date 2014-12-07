package codility;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class RiceChessboard {
    public static void main(String args[]) {
        int[][] A = {{2, 2, 3}
                , {0, 3, 1}
                , {1, 2, 2}
                , {4, 1, 2}};
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