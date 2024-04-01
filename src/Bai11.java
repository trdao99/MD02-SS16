import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        while (true) {
            while (true) {
                try {
                    day = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }
            while (true) {
                try {
                    month = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }
            while (true) {
                try {
                    year = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }
            try {
                check(day, month, year);
                System.out.printf("%d/%d/%d", day, month, year);
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void check(int a, int b, int c) {
        if (b > 12 || b <= 0) {
            throw new RuntimeException("ko hop le");
        }
        if (a > 31 || a <= 0) {
            throw new RuntimeException("ko hop le");
        }
        if (c <= 0) {
            throw new RuntimeException("ko hop le");
        }
    }
}
