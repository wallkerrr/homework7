import java.util.Scanner;

public class Conversion {
   public static int conv (int sum, int kurs) {
        int res = sum * kurs;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of the money you want to exchange : " );
        int number = scanner.nextInt();
        System.out.println("Enter the exchange rate here : ");
        int number1 = scanner.nextInt();
        int res = conv(number, number1);
        System.out.println("You will get : " + res);
        }
    }
//Використовуючи IntelliJ IDEA, створіть клас Conversion.
// Напишіть програму, яка конвертуватиме валюти.
// Користувач вводить:
//        1)      суму грошей у певній валюті;
//2)      курс конвертації в іншу валюту.
//Організуйте виведення результату операції конвертування валюти на екран.