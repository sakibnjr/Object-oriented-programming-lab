import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        int x, y;

        System.out.println("Enter First Number : ");
        x = store.nextInt();
        System.out.println("Enter Second Number : ");
        y = store.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping...");
        System.out.println("First Number : " + x);
        System.out.println("Second Number : " + y);

    }
}

