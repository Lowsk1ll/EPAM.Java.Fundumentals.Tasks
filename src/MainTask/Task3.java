package MainTask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int amountOfNumbers = in.nextInt();
        for (int i = 0; i < amountOfNumbers; i++) {
            int randomNumber = (int)(Math.random()*9);
            System.out.println(randomNumber);      //вывод числа с переходом на новую строку
            System.out.print(randomNumber+" ");    //вывод числа без перехода на новую строку

        }
    }
}
