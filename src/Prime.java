import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int sum = 0;
        System.out.print("Enter value: ");
        a = scanner.nextInt();

        for (int i = 1; i < val; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
