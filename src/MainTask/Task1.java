package MainTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Привет " + name);
    }
}
