package Lesson_01;
import java.util.Scanner;

public class program_03 {
    public static void main(String[] args) {

        Scanner iScanner= new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = iScanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = iScanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operator = iScanner.next().charAt(0);

        double result;
        iScanner.close();

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверный оператор!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}