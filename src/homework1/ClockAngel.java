package homework1;

/**
 * Created by Konstantin on 14.03.2017.
 */
public class ClockAngel {

    public static void main(String[] args) {
        float hours = 2;
        float mins = 30;
        float result = 0;
        if (hours > 12 || hours < 0 || mins > 59 || mins < 0)
        {
            System.out.println("Enter correct values");
        }
        else
        {
            float angleHourHand = (hours + mins / 60) * 30 ;
            float  angleMinHand = 6 * mins;
            result = Math.abs(angleHourHand - angleMinHand);
            if (result > 180)
            {
                result = 360 - Math.max(angleHourHand, angleMinHand) + Math.min(angleHourHand, angleMinHand);
            }

            System.out.println("Angle between hours and minute narrows is " + result);
        }
    }
}
