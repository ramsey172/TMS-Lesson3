package Group3;

public class Ex3 {
    public static void main(String[] args) {
        String separator;
        int multiplication;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                multiplication = j*i;
                separator = multiplication < 10 ? "  " : " ";
                System.out.print(multiplication+separator);
            }
            System.out.print("\n");
        }
    }

}