import java.util.Scanner;

public class PowerA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number here : ");
        int a = in.nextInt();
       int res = powerA3 (a);
        System.out.println("Tretja stypin danogo chisla = " + res);
    }
    public static int powerA3 (int a) {
        int res = (int) Math.pow( a, 3);
        return res;
    }
}
//Опишіть метод powerA3(a), який обчислює третю степінь числа та повертає це значення.
//За допомогою цієї процедури знайдіть третій степінь п'яти зазначених чисел.
