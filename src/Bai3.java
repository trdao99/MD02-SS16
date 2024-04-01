import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Double[] intList = new Double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("nhập phần tử thứ " + i);
            intList[i] = Double.parseDouble(sc.nextLine());
        }
        try {
            check(intList);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check(Double[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 1 != 0) {
                throw new RuntimeException("not int");
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}