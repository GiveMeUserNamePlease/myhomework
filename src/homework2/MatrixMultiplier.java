package homework2;

import java.util.Arrays;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        int [][]result = new int[first.length][first.length];
        if(first[1].length != second.length){
            System.out.println("It is impossible to multiply");
        }
        else{
            for(int i = 0; i< first.length; i++){
                for(int j = 0; j < second[i].length; j++){
                    for(int k = 0; k < second.length; k++) {
                        result[i][j] += first[i][k] * second[k][j];

                    }
                }
            }
        }
        for (int[] s : result) {
            System.out.println(Arrays.toString(s));
        }
    }
}
