package Lesson_01;
import java.util.Scanner;
public class program_01 {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf ("Введите положительное целое число n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        // Calculate the nth triangular number
        int triangularNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        System.out.println("N-ое треугольного число равно " + triangularNumber);

        // Calculate n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! это " + factorial);
    }
}