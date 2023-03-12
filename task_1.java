        // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        String val = iScanner.nextLine();
        int value = Integer.parseInt(val);
        System.out.println((value * (value + 1) / 2) + "");

    }
    
}