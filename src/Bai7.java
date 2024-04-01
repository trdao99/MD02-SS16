import java.util.Scanner;

public class Bai7 {
    static int[] num = new int[2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(sc);

        if(num[0]-num[1]>0){
            System.out.println(num[0]);
        }else {
            System.out.println(num[1]);
        }
    }

    public static int[] check(Scanner sc) {
        for (int i = 0; i < 2; i++) {
            while (true) {
                try {
                    System.out.println("Nhập số thứ "+(i+1));
                    num[i] = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }
        }
        return num;
    }

}
