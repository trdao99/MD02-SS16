import java.text.ParseException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2 ;
        int num1 ;
        while (true) {

            try {
                System.out.println("nhập số thứ 1");
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
            }
        }
        while (true) {
            try {
                System.out.println("nhập số thứ 2");
                num2 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
            }
        }
        System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));


    }
}

