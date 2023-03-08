package Lesson_01;
public class program_02 {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Вывод простых чисел с 1 до 1000:");

        for (i = 1; i <= 1000; i++) {
            isPrime = true;
            
            // Проверяем, является ли число простым
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // Если число простое, выводим его на экран
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}