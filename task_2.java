// Вывести все простые числа от 1 до 1000

public class task_2 {


    public static void main(String[] args)
    {
        int N = 1000;
        int x, y, flg;

        for (x = 2; x <= N; x++) {
            flg = 1;
 
            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
        
    }
    
}
