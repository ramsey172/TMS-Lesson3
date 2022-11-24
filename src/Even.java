import java.util.Scanner;

public class Even {
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
        if(num % 2 > 0){
            return false;
        }
        return true;
    }

}