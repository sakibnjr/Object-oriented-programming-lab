import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        int x, y;
        int temp;

        System.out.println("Enter First Number : ");
        x = store.nextInt();
        System.out.println("Enter Second Number : ");
        y = store.nextInt();

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping...");
        System.out.println("First Number : " + x);
        System.out.println("Second Number : " + y);

    }
}
