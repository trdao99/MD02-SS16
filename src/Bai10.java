import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad;
        while (true) {
            try {
                System.out.println("nhập số ");
                rad = Integer.parseInt(sc.nextLine());
                System.out.println("dien tich hinh tron: "+rad*rad*3.14);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
            }
        }
    }
}
