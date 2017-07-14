import java.util.Random;
import java.util.Scanner;

/**
 * Created by marcking2 on 7/13/17.
 */
public class lab5
{
    public static void main (String [] args)
    {
        Scanner scnr = new Scanner(System.in);
        int dieSides = 0;
        int loop1 = 0;
        int loop2 = 0;
        int loop3 = 0;
        int j;
        int n;
        int sum = 0;
        String fin;

        System.out.println("\n\n\nWelcome to the Grand Circus Casino!");


        while (loop2 == 0) {
            loop1 = 0;
            sum = 0;
            while (loop1 == 0) {


                System.out.print("How many sides would you like the dice to have?:");
                while (!scnr.hasNextInt()) {
                    String input = scnr.next();
                    System.out.print("How many sides would you like the dice to have?: ");
                }
                dieSides = scnr.nextInt();
                if (dieSides < 1 || dieSides > 1000000) {
                    loop1 = 0;
                } else {
                    loop1 = 1;
                }

            }
            System.out.printf("\nA %s sided die is rolled two times...", dieSides);
            for (j = 0; j < 2; j++) {
                n = roll(dieSides) + 1;
                sum = sum + n;
                System.out.print(n + "\t");
            }
            System.out.printf("\nThe total: %s\n", sum);
            loop3 = 0;

            while (loop3 == 0) {
                //scnr.nextInt();
                System.out.print("\nWould you like to continue? (Type Yes or No): ");

                fin = scnr.next();


                if (fin.equalsIgnoreCase("no") || fin.equalsIgnoreCase("n")) {
                    loop3 = 1;
                    loop2 = 1;
                } else if (fin.equalsIgnoreCase("yes") || fin.equalsIgnoreCase("y")) {
                    //System.out.println("Again.");
                    loop3 = 1;
                }
            }
        }
        System.out.println("\nGood Bye.");


    }
    public static int roll (int x)
    {
        Random rand = new Random();

        int q = rand.nextInt(x);

        return q;
    }
}
