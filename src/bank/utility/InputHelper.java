package bank.utility;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputHelper {
    Scanner scanner = new Scanner(System.in);

    public int readInteger() {
        while (true) {
            try {
                int i = scanner.nextInt();
                scanner.nextLine();//for clearing input buffer
                return i;
            } catch (InputMismatchException e) {
                System.out.println("⚠️⚠️⚠️Enter a Valid Integer⚠️⚠️⚠️");
                scanner.nextLine();
            }
        }
    }

    public String readString() {
        return scanner.nextLine();
    }

    public double readDouble() {
        while (true) {
            try {
                double d = scanner.nextDouble();
                scanner.nextLine();//for clearing input buffer
                return d;
            } catch (InputMismatchException e) {
                System.out.println("⚠️⚠️⚠️Enter a Valid Input⚠️⚠️⚠️");
                scanner.nextLine();
            }
        }
    }
}
