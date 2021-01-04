package OptionalTask1;

import java.util.Scanner;

public class Task1and2 {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();
        String [] values = numbers.split(" ");
        Double [] values1 = new Double[values.length];
        for(int i=0;i<values.length;i++){
            values1[i]=Double.parseDouble(values[i]);
        }
        double max=values1[0];
        double min=values1[0];
        for(int i = 0;i<(values.length-1);i++){
            if(values1[i]>max){
                max=values1[i];
            }
            if(values1[i]<min){
                min=values1[i];
            }
        }
        System.out.println("Максимальное значение "+max);
        System.out.println("Минимальное значение "+min);

        for(int i=values1.length-1;i>0;i--){
            for(int j =0;j<i;j++ ){
                if(values1[j]>values1[j+1]){
                    Double temp = values1[j];
                    values1[j]=values1[j+1];
                    values1[j+1]=temp;
                }
            }
        }
        System.out.println("В порядке возрастания");
        for (Double i:values1) {
            System.out.print(i+" ");
            }
    }
}
