import java.util.Map;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        try {
            check(sc.nextInt());
            System.out.println("là số nguyên tố");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check(int a) {
        if (a > 2) {
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i != 0) {
                    throw new RuntimeException("ko hop le");
                }
            }
        } else {
            throw new RuntimeException("ko hop le");
        }
    }
}
