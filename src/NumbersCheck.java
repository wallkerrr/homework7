import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        checkPositivity(number);
        checkPrimality(number);
        checkDivisibility(number);
    }

    public static void checkPositivity(int num) {
        if (num > 0) {
            System.out.println("Число є позитивним.");
        } else if (num < 0) {
            System.out.println("Число є негативним.");
        } else {
            System.out.println("Число є нулем.");
        }
    }

    public static void checkPrimality(int num) {
        if (num <= 1) {
            System.out.println("Число не є простим.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Число не є простим.");
                return;
            }
        }

        System.out.println("Число є простим.");
    }

    public static void checkDivisibility(int num) {
        boolean divisible = num % 2 == 0 || num % 5 == 0 || num % 3 == 0 || num % 6 == 0 || num % 9 == 0;
        if (divisible) {
            System.out.println("Число ділиться на 2, 5, 3, 6 або 9 без залишку.");
        } else {
            System.out.println("Число не ділиться на 2, 5, 3, 6 або 9 без залишку.");
        }
    }
}
//Використовуючи IntelliJ IDEA, створіть клас NumbersCheck.
//        Напишіть метод, який визначатиме:
//        1)      чи є введене число позитивним, чи негативним;
//2)      чи є воно простим (використовуйте техніку перебору значень).
//Просте число – це натуральне число, яке ділиться на 1 й саме на себе.
//Щоби визначити просте число чи ні, варто знайти всі його цілі дільники.
//Якщо дільників більше 2-х, то воно не просте;
//3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.