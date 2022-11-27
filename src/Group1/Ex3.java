package Group1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");

        int number = scanner.nextInt();

        if(isEven(number)){
            System.out.println("Четное");
        }else{
            System.out.println("Нечетное");
        }
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

}