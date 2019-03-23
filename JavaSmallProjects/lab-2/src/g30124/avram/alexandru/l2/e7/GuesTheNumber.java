package g30124.avram.alexandru.l2.e7;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class GuesTheNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" --- Gues the number --- ");
        Random rand = new Random();
        int randomInt = rand.nextInt(10);
        int tries = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(" Enter a number: ");
            int userInt = sc.nextInt();
            if (userInt == randomInt) {
                System.out.println("YOU WIN !!! ");
                exit(1);
            } else
                tries++;
            while (userInt != randomInt) {
                if (randomInt > userInt) {
                    System.out.println("Your number is too low.");
                    break;
                } else if (randomInt < userInt) {
                    System.out.println("Your number is too high.");
                    break;
                }
            }
            if (tries == 3) {
                System.out.println("You lost. Try again");
            }

        }
    }
}


