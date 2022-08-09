import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int q = Integer.parseInt(input);
        String[] datas = new String[q];

        for (int i = 0; i < q; i++) {
            datas[i] = scanner.nextLine();
        }

        for (int i = 0; i < q; i++) {

            String[] numbers = datas[i].split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int n = Integer.parseInt(numbers[2]);

            for (int j = 0; j < n; j++) {

                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println(" ");

        }
    }
}
