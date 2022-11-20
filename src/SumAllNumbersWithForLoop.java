import java.util.Scanner;

public class SumAllNumbersWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть A");
        int A = scanner.nextInt();
        System.out.println("Введіть B");
        int B = scanner.nextInt();
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
