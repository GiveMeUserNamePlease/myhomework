package homework1;

/**
 * Created by Konstantin on 14.03.2017.
 */
public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        first=first+second-(second=first);
        /*int temp = first;
        first = second;
        second = temp;*/

        /*Your implementation*/

        System.out.println("First = " + first + " , second = " + second);
    }
}
