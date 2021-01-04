package MainTask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int j=(int)(Math.random()*9);
            System.out.println(j);  //вывод числа с переходом на новую строку
            System.out.print(j+" ");    //вывод числа без перехода на новую строку

        }
    }
}
