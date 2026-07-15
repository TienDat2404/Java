public class Bai1 {
    public static void main(String[] args) {
        for (int n = 2; n <= 9; n++) {
            System.out.println("Bang cuu chuong " + n);
            for (int i = 1; i <= 9; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println();
        }
    }
}
