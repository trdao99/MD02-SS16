public class Bai15 {
    public static void main(String[] args) {
        try {
            checkTriangle(1, 2, 3);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("Các cạnh tam giác phải lớn hơn 0");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new RuntimeException("Tổng hai cạnh không lớn hơn cạnh còn lại");
        }
        System.out.printf("Ba cạnh %s, %s, %s là ba cạnh của một tam giác\n", a, b, c);
    }
}