//In a program, write a method that accepts two arguments:
//an array and a number n. Assume that the array contains integers.
//The method should return a count (as an integer) of the numbers in the array that are greater than the number n that was passed into the method.
// Be sure to include at least one unit test to check this.
import java.util.*;

public class Lab_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int numbersArray[] = new int[100];

        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbersArray));
        
        
    }
    
    public static int greaterthan(int n, int numbersArray){
        for (int i = 0; i < numbersArray.length; i++){
        
        }
    return ;
    }
    
}
