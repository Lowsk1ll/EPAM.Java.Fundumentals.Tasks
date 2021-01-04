package MainTask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        String values = in.nextLine();
        String[] numbers = values.split(" ");
        double sum = 0;
        double proizvedenie = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += Double.parseDouble(numbers[i]);
            proizvedenie *= Double.parseDouble(numbers[i]);
        }
        System.out.println("Сумма = "+ sum);
        System.out.println("Произведение = "+proizvedenie);
    }
}