import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 7");

        int number = scanner.nextInt();
        while(!isValid(number)){
            System.out.println("Неверное число. Нужно в диапазоне от 1 до 7.");
            number = scanner.nextInt();
        }
        System.out.println(getRainbowColor(number));

    }

    public static String getRainbowColor(int num){
        String color = "";
        switch (num){
            case 1:
                color = "Красный";
            case 2:
                color = "Оранжевый";
                break;
            case 3:
                color = "Желтый";
                break;
            case 4:
                color = "Зеленый";
                break;
            case 5:
                color = "Голубой";
                break;
            case 6:
                color = "Синий";
                break;
            case 7:
                color = "Фиолетовый";
                break;
        }
        return color;
    }

    public static boolean isValid(int monthNumber){
        if(monthNumber > 0 && monthNumber < 8){
            return true;
        }
        return false;
    }

}