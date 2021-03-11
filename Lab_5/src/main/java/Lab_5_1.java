//In a program, write a method that accepts two arguments:
//an array and a number n. Assume that the array contains integers.
//The method should return a count (as an integer) of the numbers in the array that are greater than the number n that was passed into the method.
// Be sure to include at least one unit test to check this.

public class Lab_5_1 {
    public static void main(String[] args) {
        int n = 22;
        int numbers[] = new int[] {12, 10, 9, 53, 76, 92, 17, 3, 21, 64};
        int numberGreater = greaterthan(numbers, n);
        System.out.println("There are " + numberGreater + " numbers greater than " + n + ".");
    }
    
    public static int greaterthan(int numbers[], int n){

        int counter = 0;
        for(int i=0; i < numbers.length; i++)
        {
            if (numbers[i] > n)
                    counter ++;
        }
    return counter;
    }
    
}
