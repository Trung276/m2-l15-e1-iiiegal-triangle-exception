import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();
        System.out.println("y = ");
        int y = scanner.nextInt();
        System.out.println("z = ");
        int z = scanner.nextInt();
        if (x <= 0 || y <= 0 || z <= 0 || x + y <= z || x + z <= y || y + z <= x) {
            throw new IllegalTriangleException("Nhap sai");
        }
    }
}
