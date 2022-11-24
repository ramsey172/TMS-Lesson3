import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");

        int monthNumber = scanner.nextInt();

        while(!isValid(monthNumber)){
            System.out.println("Неверное число. Попробуйте еще раз.");
            monthNumber = scanner.nextInt();
        }

        //showTimeOfYearByMonth_SwitchCase(monthNumber);
        showTimeOfYearByMonth_IfElse(monthNumber);



    }

    public static void showTimeOfYearByMonth_SwitchCase(int monthNumber){
        String timeOfYear = "";
        switch (monthNumber){
            case 2:
                timeOfYear = "Зима";
                break;
            case 3:
                timeOfYear = "Весна";
                break;
            case 4:
                timeOfYear = "Весна";
                break;
            case 5:
                timeOfYear = "Весна";
                break;
            case 6:
                timeOfYear = "Лето";
                break;
            case 7:
                timeOfYear = "Лето";
                break;
            case 8:
                timeOfYear = "Лето";
                break;
            case 9:
                timeOfYear = "Осень";
                break;
            case 10:
                timeOfYear = "Осень";
                break;
            case 11:
                timeOfYear = "Осень";
                break;
            default:
                timeOfYear = "Зима";
        }
        System.out.println("Пора года: "+timeOfYear);

    }

    public static void showTimeOfYearByMonth_IfElse(int monthNumber){
        String timeOfYear;
        if(monthNumber >= 3 && monthNumber <= 5){
            timeOfYear = "Весна";
        }else if(monthNumber >= 6 && monthNumber <= 8){
            timeOfYear = "Лето";
        }else if(monthNumber >= 9 && monthNumber <=10){
            timeOfYear = "Осень";
        }else{
            timeOfYear = "Зима";
        }
        System.out.println("Пора года: "+timeOfYear);
    }

    public static boolean isValid(int monthNumber){
        if(monthNumber > 0 && monthNumber < 13){
            return true;
        }
        return false;
    }
}