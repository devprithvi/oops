import java.util.Scanner;

public class io_divide {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First No.: ");
        int a = input.nextInt();
        System.out.print("Enter Second No.: ");
        int b = input.nextInt();

        int c = (a / b);
        System.out.println();
        System.out.println("Division of a and b is: " + c);

         */

        //Printing table of any no.

        Scanner input2 = new Scanner(System.in);
        int t = input2.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(t + " x " + (i + 1) + " = " + (t * (i + 1)));

        }


    }

}
