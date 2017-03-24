package homework2;

import java.util.Arrays;

public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {7, 5, 4, 1}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i != j){
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
                else{
                    break;
                }
            }
        }
        for (int[] s : array) {
            System.out.println(Arrays.toString(s));
        }
    }
}