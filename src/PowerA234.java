import java.util.Scanner;

public class PowerA234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Please enter your 5 digit number here : ");
        int a = in.nextInt();
        System.out.println(power2(a));
        System.out.println(power3(a));
        System.out.println(power4(a));

    }
    public static long power2 (int a) {
        return (long) Math.pow(a,2);
    }
    public static long power3 (int a) {
        return (long) Math.pow(a,3);
    }
    public static long power4 (int a) {
        return (long) Math.pow(a,4);
    }
}
/*Опишіть метод powerA234(a), який обчислює другий, третій та четвертий степінь числа A
та виводить ці степені в консоль (усі параметри є дійсними).
За допомогою цієї процедури знайдіть другий, третій та четвертий степені п'яти зазначених чисел.*/