package homework2;

import java.util.Arrays;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {3, 4, 5, 6},
            {7, 5, 4, 1}
        };
        for (int[] s : array) {
            System.out.println(Arrays.toString(s));
        }
    }
}
