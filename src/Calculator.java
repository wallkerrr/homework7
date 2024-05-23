public class Calculator {
    public static void main(String[] args) {
     double c =  calculate(5, 10, 15);
        System.out.println("Cереднє арифметичне значень аргументів a, b, c = " + c);
    }
    public static int calculate( int a, int b, int c){
         res = ( a + b + c ) / 3;
        return (int) res;
    }
}
//Використовуючи IntelliJ IDEA, створіть клас Calculator.
//Створіть метод з ім'ям calculate, який приймає як параметри три цілих аргументи та
//виводить на екран середнє арифметичне значень аргументів.