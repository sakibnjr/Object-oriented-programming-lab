import java.util.Scanner;

public class Solution013 {
    public static void main(String[] args) {
        double num;

        Scanner store = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = store.nextDouble();

        if (num >= 1)
            System.out.println("Number is positive");
        else if (num == 0)
            System.out.println("Zero is neither positive nor negative!");
        else
            System.out.println("Number is Negative");
    }
}
