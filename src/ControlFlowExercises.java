import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -10);

        double z = 2;
        do {
            System.out.printf("%.0f\n", z);
            z = Math.pow(z, 2);
        } while (z < 1000000);

        for (int yy = 100; yy >= -10; yy -= 5){
            System.out.println(yy);
        }

        for (double zz = 2; zz < 1000000; zz = Math.pow(zz, 2)){
            System.out.printf("%.0f\n", zz);
        }
    }
}
