import java.util.Scanner;

public class Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
