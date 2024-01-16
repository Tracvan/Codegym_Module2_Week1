import java.util.Scanner;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isPrime = true;
        for (int i = 2; i<100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }
}