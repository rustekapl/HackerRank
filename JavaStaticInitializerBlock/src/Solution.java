import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



         int b = Integer.parseInt(scanner.nextLine());

        int h = Integer.parseInt(scanner.nextLine());


        if (b > 0 & h > 0) {
            System.out.println(b * h);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }


    }
}
