import java.util.Scanner;

// Реализовать простой калькулятор

public class task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Введите оператор: (+, -, *, /) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();



        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}
