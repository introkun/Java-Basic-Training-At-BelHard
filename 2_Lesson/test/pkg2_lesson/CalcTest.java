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
public class CalcTest {
    
    public CalcTest() {
    }
    
    private boolean TestPerformSimpleAction(Double first, Double second, String operation, Double expectedResult) {
        return Calc.PerformSimpleAction(first, second, operation).equals(expectedResult);
    }

    /**
     * Test of PerformSimpleAction method, of class Calc.
     */
    @Test
    public void testPerformSimpleAction() {
        System.out.println("PerformSimpleAction");
        assertTrue(TestPerformSimpleAction(1.0, 6.0, "+", 7.0));
        assertTrue(TestPerformSimpleAction(5.0, 7.0, "-", -2.0));
        assertTrue(TestPerformSimpleAction(9.0, 1.0, "-", 8.0));
        assertTrue(TestPerformSimpleAction(1.0, 6.0, "*", 6.0));
        assertTrue(TestPerformSimpleAction(6.0, 2.0, "/", 3.0));
    }
    
    @Test
    public void testPerformSimpleActionWithWrongOperations() {
        System.out.println("PerformSimpleAction");
        assertTrue(TestPerformSimpleAction(1.0, 6.0, "90", Double.NaN));
        assertTrue(TestPerformSimpleAction(5.0, 7.0, "hello", Double.NaN));
    }
}
