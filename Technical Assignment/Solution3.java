import java.util.Scanner;

public class Solution3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        
        int[] array = new int[n];
        
        System.out.print("\n Enter array elements: ");
        for(int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
            if(array[i] > largest){
                largest = array[i];
            }
        }
        
        System.out.println("Maximum is: "+ largest + "\nMinimum is: "+ smallest);
    }
}