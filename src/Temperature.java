import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");

        int number = scanner.nextInt();
        System.out.println(getWeather(number));


    }

    public static String getWeather(int num){
        if(num > -5){
            return "Тепло";
        }
        if(num <= -20){
            return "Холодно";
        }
        return "Нормально";
    }

}