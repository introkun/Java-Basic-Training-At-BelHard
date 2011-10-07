/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_lesson;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergey.gradovich
 */
public class Calc implements IRunnable {

    private static Double Add(Double first, Double second) {
        return first + second;
    }

    private static boolean CheckOperation(String operation) {
        char[] possibleOperations = {'+', '-', '*', '/'};

        boolean found = false;
        for (char ch : possibleOperations) {
            if (ch == operation.charAt(0)) {
                found = true;
            }
        }
        if (!found) {
            System.out.println("[Error] Wrong operation.");
        }
        return found;
    }

    private static Double Substract(Double first, Double second) {
        return first - second;
    }

    private static Double Division(Double first, Double second) {
        if (second == 0) {
            System.out.println("[Error] Division by zero.");
            return Double.NaN;
        }
        return first / second;
    }

    private static Double Multiplication(Double first, Double second) {
        return first * second;
    }

    public static Double PerformSimpleAction(Double first, Double second, String operation) {
        Double result = 0.0;

        if (!CheckOperation(operation)) {
            return Double.NaN;
        }

        try {
            switch (operation.charAt(0)) {
                case '+':
                    result = Add(first, second);
                    break;
                case '-':
                    result = Substract(first, second);
                    break;
                case '*':
                    result = Multiplication(first, second);
                    break;
                case '/':
                    result = Division(first, second);
                    break;
            }
        } catch (ArithmeticException e) {
            return Double.NaN;
        }

        return result;
    }

    @Override
    public void Run() {
        try {
            String operation = Utils.AskUser("Please enter needed operation [+ - / *]: ");
            if (!CheckOperation(operation)) {
                return;
            }

            String[] parameters = Utils.AskUser("Array: ").split(" ");

            Double result = Double.parseDouble(parameters[0]);

            for (int i = 1; i < parameters.length; ++i) {
                Double number = Double.parseDouble(parameters[i]);

                result = PerformSimpleAction(result, number, operation);
            }

            System.out.println("Result: " + result);
        } catch (IOException ex) {
            Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
