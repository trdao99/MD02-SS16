import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int num1 ;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("nhập số ");
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
            }
        }
        System.out.println("fibonacci number has value is: "+ fibonacci(num1));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 1;
        int fib = 0;
        for (int i = 3; i <= n; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }
        return fib;
    }
}
