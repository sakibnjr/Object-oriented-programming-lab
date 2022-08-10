import java.util.Scanner;

public class Solution009 {
    public static void main(String[] args) {

        char xr;
        System.out.println("Enter a character : ");
        Scanner store = new Scanner(System.in);
        xr = store.next().charAt(0);

        if (xr == 'a' || xr == 'e' || xr == 'i' || xr == 'o' || xr == 'u')
            System.out.println("It's a vowel alphabet");
        else if (xr == 'A' || xr == 'E' || xr == 'I' || xr == 'O' || xr == 'U')
            System.out.println("It's a vowel alphabet");
        else
            System.out.println("It's a consonant alphabet");
    }
}
