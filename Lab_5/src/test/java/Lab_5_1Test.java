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
public class Lab_5_1Test {
    
    public Lab_5_1Test() {
    }

    @Test
    public void testGreaterthan0() {
        System.out.println("greaterthan");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int n = 0;
        int expResult = 10;
        int result = Lab_5_1.greaterthan(numbers, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreaterthan100() {
        System.out.println("greaterthan");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int n = 100;
        int expResult = 0;
        int result = Lab_5_1.greaterthan(numbers, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreaterthan5() {
        System.out.println("greaterthan");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int n = 5;
        int expResult = 5;
        int result = Lab_5_1.greaterthan(numbers, n);
        assertEquals(expResult, result);
    }
    
}
