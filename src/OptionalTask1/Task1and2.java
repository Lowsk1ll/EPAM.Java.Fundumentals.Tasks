package OptionalTask1;

import java.util.Scanner;

public class Task1and2 {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();
        String [] valuesString = numbers.split(" ");
        Double [] valuesDouble = new Double[valuesString.length];
        for(int i=0;i<valuesString.length;i++){
            valuesDouble[i]=Double.parseDouble(valuesString[i]);
        }
        double max=valuesDouble[0];
        double min=valuesDouble[0];
        for(int i = 0;i<(valuesString.length-1);i++){
            if(valuesDouble[i]>max){
                max=valuesDouble[i];
            }
            if(valuesDouble[i]<min){
                min=valuesDouble[i];
            }
        }
        System.out.println("Максимальное значение "+max);
        System.out.println("Минимальное значение "+min);

        for(int i=valuesDouble.length-1;i>0;i--){
            for(int j =0;j<i;j++ ){
                if(valuesDouble[j]>valuesDouble[j+1]){
                    Double temp = valuesDouble[j];
                    valuesDouble[j]=valuesDouble[j+1];
                    valuesDouble[j+1]=temp;
                }
            }
        }
        System.out.println("В порядке возрастания");
        for (Double i:valuesDouble) {
            System.out.print(i+" ");
            }
    }
}
