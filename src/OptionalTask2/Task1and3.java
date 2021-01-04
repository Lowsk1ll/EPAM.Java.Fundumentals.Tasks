package OptionalTask2;

import java.util.Scanner;

public class Task1and3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размернссть матрицы");
        int n = in.nextInt();
        System.out.println("Начальное значение интервала значений элемента матрицы");
        int a = in.nextInt();
        System.out.println("Конечное значение интервала значений элемента матрицы");
        int b = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * (b - a)) + a;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите столбец относительно которого будут упорядочены строки по возростанию");
        int k = in.nextInt();
        for (int g = n - 1; g > 0; g--) {

            for (int i = 0; i < g; i++) {
                if (matrix[i][k - 1] > matrix[i + 1][k - 1]) {
                    for (int j = 0; j < n; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;

                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            int count =0;
            int j=0;
            int sum=0;
            while (count<2 && j<n){
                if(matrix[i][j]>0){
                    sum+=matrix[i][j];
                    count++;

                }
                j++;
            }
            if(count<2){
                System.out.println("В строке "+(i+1)+" меньше двух положительных элементов");
                continue;
            }
            System.out.println("В строке "+(i+1)+" cумма первых двух положительных элементов = "+sum);
        }
    }
}
