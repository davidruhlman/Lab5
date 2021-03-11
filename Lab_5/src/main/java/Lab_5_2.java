
import java.util.*;

/** Write a program with an array that is initialized with test data. Use any primitive numeric data type of your choice.
The program should also have the following methods:
getTotal. This method should accept a one-dimensional array as its argument and return the total of the values in the array.
getAverage. This method should accept a one-dimensional array as its argument and return the average of the values in the array
getHighest. This method should accept a one-dimensional array as its argument and return the highest value in the array
getLowest. This method should accept a one-dimensional array as its argument and return the lowest value in the array
Write at least one unit test per method demonstrating that it works correctly.
*/
public class Lab_5_2 {
    public static void main(String[] args) {
        int array[] = new int[]{10, 37, 17, 92, 76};
        int total = getTotal(array);   
        double average = getAverage(array);
        int highest = getHighest(array);
        int lowest = getLowest(array);
        System.out.println("Sum of array: " + total);
        System.out.println("Average of array: " + average);
        System.out.println("Highest value : " + highest);
        System.out.println("Lowest value : " + lowest);
    }
    
    public static int getTotal(int array[]){
        int sum = 0;
        for(int i=0; i < array.length; i++)
        {
        sum += array[i];
        }
        return sum;
    }
    
    public static double getAverage(int array[]){
        int sum = 0;
        double average = 0;
        for(int i = 0; i<array.length; i++)
        {
        sum = sum+array[i];
        average = sum / array.length;
        }
        return average;
    }
    
    public static int getHighest(int array[]){
        int max=array[0];
        for(int i = 0; i<array.length; i++)
        {
        if(array[i] > max)
        max = array[i];
        }
        return max;
    }
    
    public static int getLowest(int array[]){
        int min = array[0];
        for(int i = 0; i<array.length; i++)
        {
        if (array[i] < min)
        min = array[i];
        }
        return min;
    }
}
 