package homework2;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, 10, -1, 8};
        for( int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i;
            for (j = i; j > 0 && array[j - 1] > temp; j--){
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    // СПЕРВА СДЕЛАЛ ТАК, ПОКА НЕ ВСПОМНИЛ ПРО СЛОЖНЫЕ УСЛОВИЯ)
    /*public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, 10, -1, 8};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp2 = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp2;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }*/
}
