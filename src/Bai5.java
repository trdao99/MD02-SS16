import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        int[] ints = new int[50];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) ((Math.random() + 1) * 50);
        }
        Arrays.sort(ints);
        int valueToCheck = 50;
        try{
            check(find(ints, valueToCheck));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static int find(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > value) {
                end = mid - 1;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void check(int a) {
        if (a ==  -1) {
            throw new RuntimeException("Value does not exist.");
        }
        else {
            System.out.println(a);
        }
    }
}