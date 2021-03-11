/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Ruhlman
 */
public class Lab_5_2Test {
    
    public Lab_5_2Test() {
    }

      @org.junit.jupiter.api.Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] array = {1,2,3,4,5};
        int expResult = 15;
        int result = Lab_5_2.getTotal(array);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] array = {1,2,3,4,5};
        double expResult = 3;
        double result = Lab_5_2.getAverage(array);
        assertEquals(expResult, result, 0.0);
    }

    @org.junit.jupiter.api.Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] array = {1,2,3,4,5};
        int expResult = 5;
        int result = Lab_5_2.getHighest(array);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] array = {1,2,3,4,5};
        int expResult = 1;
        int result = Lab_5_2.getLowest(array);
        assertEquals(expResult, result);
    }
    
}

