import java.util.Scanner;
public class Solution1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the input string: ");
		String string = input.nextLine();
		System.out.print("Enter the occurrence character: ");
		char c = input.next().charAt(0);
		
		string = string.toLowerCase();
		int intValue = (int) c;
        if(intValue < 97){
            intValue = 96 + (intValue - 48);
            c = (char) intValue;
        }
		
		int count = 0;
		for(int i=0; i<string.length(); i++){
		    if(string.charAt(i) == c){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
