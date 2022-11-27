package Group2;

public class Ex1 {
    public static void main(String[] args) {
        for(int n=1;n<=99;n++){
            if(!isEven(n)){
                System.out.println(n);
            }
        }
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

}