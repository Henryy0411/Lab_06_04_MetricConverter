import java.sql.SQLOutput;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        int meter;
        double inch;
        double feet;
        double mile;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the measurement (in meters): ");
        meter = in.nextInt();

        if(meter > 0) {
            inch = meter * 39.37;
            feet = meter * 3.28084;
            mile = meter * 0.000621371;

            System.out.printf("%d meters = %.2f miles\n",meter,mile);
            System.out.printf("%d meters = %.2f feet\n",meter,feet);
            System.out.printf("%d meters = %.2f inches\n",meter,inch);
        }else{
            trash = in.nextLine();
            System.out.println("You entered wrong number!");
        }
    }
}
