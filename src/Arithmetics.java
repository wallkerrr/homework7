import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перший операнд: ");
        int operand1 = scanner.nextInt();

        System.out.print("Введіть другий операнд: ");
        int operand2 = scanner.nextInt();

        System.out.print("Введіть знак арифметичної операції (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                add(operand1, operand2);
                break;
            case '-':
                sub(operand1, operand2);
                break;
            case '*':
                mul(operand1, operand2);
                break;
            case '/':
                div(operand1, operand2);
                break;
            default:
                System.out.println("Невірний знак арифметичної операції.");
        }
    }

    public static void add(int a, int b) {
        System.out.println("Результат додавання: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Результат віднімання: " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println("Результат множення: " + (a * b));
    }

    public static void div(int a, int b) {
        if (b != 0) {
            System.out.println("Результат ділення: " + ((double) a / b));
        } else {
            System.out.println("Помилка: Ділення на нуль!");
        }
    }
}