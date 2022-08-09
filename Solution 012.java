import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        int x;

        System.out.println("Enter a Year : ");
        x = store.nextInt();
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
            System.out.println("This is a Leap Year!");
        else System.out.println("Not a Leap Year");

    }
}
