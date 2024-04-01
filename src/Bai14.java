import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        int[] intList = new int[5];
        Scanner sc = new Scanner(System.in);
        try{
            checkLIst(intList,sc);
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
    }
    public static void checkLIst(int[] arr, Scanner sc) throws RuntimeException{
        int sumTb = 0;
        if(arr.length ==0){
            throw new RuntimeException("mảng rỗng");
        }
        for (int i = 0; i < arr.length; i++) {
            while (true){
                try {
                    System.out.println("nhập phần tử thứ " + i);
                    arr[i] = Integer.parseInt(sc.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.err.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sumTb += arr[i];
        }
        System.out.println(sumTb/ arr.length);
    }
}
