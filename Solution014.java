import java.util.Scanner;

public class Solution014 {
    public static void main(String[] args) {
        char x;

        Scanner store = new Scanner(System.in);
        System.out.println("Enter a character : ");
        x = store.next().charAt(0);

        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
            System.out.println("It's an Alphabet");
        else
            System.out.println("Not an Alphabet");

    }
}
