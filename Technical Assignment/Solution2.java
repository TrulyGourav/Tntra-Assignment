import java.util.Scanner;

public class Solution2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	    System.out.print("Enter the input string: ");
		String string = input.nextLine();
		
		int i=0;
		int j = string.length()-1;
		boolean isPalindrome = true;
		while(i<j){
		    if(string.charAt(i) != string.charAt(j)){
		        isPalindrome = false;
		        break;
		    }
		    i++;
		    j--;
		}
		if(isPalindrome){
		    System.out.println("true");
		}else{
		    System.out.println("false");
		}
    }
}