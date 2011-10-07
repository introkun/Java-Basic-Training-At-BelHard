/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_lesson;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergey.gradovich
 */
public class SuperCalcTest {
    
    public SuperCalcTest() {
    }

    /**
     * Test of Run method, of class SuperCalc.
     */
    @Test
    public void testCalculate() {
        System.out.println("Calculate");
        Double expectedResult = -5.8;
        Double[] numbers = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
        char[] operators = {'+', '-', '*', '-', '/', '='};
        assertEquals(expectedResult, SuperCalc.Calculate(numbers, operators, numbers.length));
        
        System.out.println("Calculate: one division by zero");
        expectedResult = Double.NaN;
        Double[] numbersWithOneZero = {12.0, 0.0};
        char[] operatorsWithOneZero = {'/', '='};
        assertEquals(expectedResult, SuperCalc.Calculate(numbersWithOneZero, operatorsWithOneZero, numbersWithOneZero.length));
        
        System.out.println("Calculate: many divisions by zero");
        expectedResult = Double.NaN;
        Double[] numbersWithZero = {0.0, 1.0, 0.0, 3.0, 4.0, 0.0};
        char[] operatorsForZero = {'+', '/', '+', '-', '/', '='};
        assertEquals(expectedResult, SuperCalc.Calculate(numbersWithZero, operatorsForZero, numbersWithZero.length));
    }
}
