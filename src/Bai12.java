import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

            while (true) {
                try {
                    n1 = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }
            while (true) {
                try {
                    n2 = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }

            int temp=0;
        for (int i = 1; i <= n1; i++) {
            if(n1%i==0 && n2%i==0){
                temp = i;
            }
        }
        System.out.println(temp);


    }
}
