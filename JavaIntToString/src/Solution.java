import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if(number>-100&&number<=100) {
            String s = number.toString();
            System.out.println("Good job");
           
        }
        else System.out.println("Wrong answer");

    }
}