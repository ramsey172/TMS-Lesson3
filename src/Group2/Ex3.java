package Group2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число");
        int number = scanner.nextInt();
        while(!isValid(number)){
            System.out.println("Введено не положительное число");
            number = scanner.nextInt();
        }
        System.out.println(getSum(number));
    }
    public static int getSum(int number){
        int sum = 0;
        for(int n=1;n<=number;n++){
            sum += n;
        }
        return sum;
    }
    public static boolean isValid(int num){
        return num > 0;
    }

}