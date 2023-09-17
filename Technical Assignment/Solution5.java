import java.util.Scanner;

public class Solution5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        
        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;
        
        System.out.print("Numbers after swap: a = " + numberOne + " and ");
        System.out.println("b = " + numberTwo);
    }
}