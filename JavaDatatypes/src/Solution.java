import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        String[] datas = new String[t];
        for (int i = 0; i < t; i++) {
            datas[i] = scanner.nextLine();
            showPremitive(datas[i]);

        }
    }

    public static void showPremitive(Object input){
        try{
            if (input instanceof Short)
                System.out.println("Primitive : short");
            else if(input instanceof Integer)
                System.out.println("Primitive : int");
            else if(input instanceof Long)
                System.out.println("Primitive : long");
            else if(input instanceof Float)
                System.out.println("Primitive : float");
            else if(input instanceof Double)
                System.out.println("Primitive : double");
            else if(input instanceof Boolean)
                System.out.println("Primitive : bool");
            else if(input instanceof Character)
                System.out.println("Primitive : char");
            else if(input instanceof Byte)
                System.out.println("Primitive : byte");
            else
                System.out.println("Reference : string");
        }
        catch (InputMismatchException e){
            System.out.println("Exception occur = "+e);
        }
    }


}
