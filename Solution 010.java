import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner store = new Scanner(System.in);
        System.out.println("Enter three number :");

        a = store.nextInt();
        b = store.nextInt();
        c = store.nextInt();

        if (a > b && a > c)
            System.out.println("Largest Number is : " + a);
        else if (b > a && b > c)
            System.out.println("Largest Number is : " + b);
        else
            System.out.println("Largest Number is : " + c);

    }
}
