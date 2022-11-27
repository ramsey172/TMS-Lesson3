package Group3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        float sum;
        int percent = 7, monthsCount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        sum = scanner.nextFloat();
        System.out.println("Введите кол-во месяцев:");
        monthsCount = scanner.nextInt();
        for(int n=0;n<monthsCount;n++){
            sum += sum*percent/100;
        }
        System.out.println("Сумма по истечении "+monthsCount+" мес. - "+sum);
    }
}