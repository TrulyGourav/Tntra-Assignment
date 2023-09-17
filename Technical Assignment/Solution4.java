import java.util.Scanner;

public class Solution4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        
        int len1 = a.length();
        int len2 = b.length();
        
        a = a+b;
        b = a;
        a = a.substring(len1);
        b = b.substring(0, len1);
        
        System.out.print("Strings after swap: a = " + a + " and ");
        System.out.print("b = " + b);
    }
}