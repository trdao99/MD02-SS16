import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
                try {
                    System.out.println("nhập phần tử thứ " + i);
                    list[i] = Integer.parseInt(sc.nextLine());
                }catch (NumberFormatException e){
                    list[i]=0;
                }

        }
        System.out.println(Arrays.toString(list));
    }
}
