package Group2;

public class Ex5 {
    public static void main(String[] args) {
        int counter = 0;
        int num = 0;
        int step = -5;
        while(counter < 10){
            System.out.print(num+" ");
            num+= step;
            counter++;
        }
    }
}