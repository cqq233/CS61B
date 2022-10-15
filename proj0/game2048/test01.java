package game2048;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class test01 {
    @SuppressFBWarnings("DLS_DEAD_LOCAL_STORE")
    public static void main(String[] args) {
        int cout = 0;
        int[][] a = new int[][]{

                {03, 11, 22, 33},
                {02, 12, 22, 32},
                {01, 11, 21, 31},
                {00, 10, 20, 30},

        };

        int[][] before = new int[][]{
                {0, 0, 2, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 4, 0},
        };
        for (int col = 0; col < 4; col += 1) {
            for (int row = 3; row >= 0; row -= 1) {
                System.out.print(a[col][row] + " ");

                cout += 1;
                if (cout % 4 == 0) {
                    System.out.println();
                }

            }

        }

    }
}
