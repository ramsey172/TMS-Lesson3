package Group3;

public class Ex1 {
    public static void main(String[] args) {
        int a = 0, b = 1, sum;
        for (int n = 0; n < 11; n++) {
            System.out.print(a + " ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}