import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        int x;

        Scanner store = new Scanner(System.in);
        System.out.println("Enter any number : ");
        x = store.nextInt();

        if(x%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");

    }
}
