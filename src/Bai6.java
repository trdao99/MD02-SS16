import java.util.Scanner;

public class Bai6 {
    private static int num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        while (true) {
            try {
                System.out.println("Nhập số thứ 1:");
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
            }
        }

        while (true) {
            try {
                check(sc);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
    }

    public static void check(Scanner sc) {
        System.out.println("Nhập số thứ 2:");
        num2 = Integer.parseInt(sc.nextLine());
        if (num2 == 0) {
            throw new RuntimeException("Số thứ 2 phải khác 0.");
        }
    }
}