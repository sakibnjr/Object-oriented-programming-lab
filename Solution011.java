import java.util.Scanner;
import java.lang.Math;

public class Solution011 {
    public static void main(String[] args) {

        double a, b, c, d, r1, r2;
        System.out.println("Enter value of a,b & c : ");

        Scanner store = new Scanner(System.in);
        a = store.nextDouble();
        b = store.nextDouble();
        c = store.nextDouble();

        d = ((b * b) - (4 * a * c));
        r1 = (-b + Math.sqrt(d)) / (2 * a);
        r2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("Root 1 = : " + r1);
        System.out.println("Root 2 = : " + r2);

    }

}
