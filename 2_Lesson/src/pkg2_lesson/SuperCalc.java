package pkg2_lesson;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergey.gradovich
 */
public class SuperCalc extends Calc {
    
    public static Double Calculate(Double[] numbers, char[] operators, Integer numbersCount) {
        Double result = numbers[0];
        
        for (int i = 0; i < numbersCount - 1; ++i) {
            char operator = operators[i];
            char nextOperator = operators[i + 1];
            if (nextOperator == '+' || nextOperator == '-' || nextOperator == '=') {
                result = PerformSimpleAction(result, numbers[i + 1], Character.toString(operator));
            } else if (nextOperator == '*' || nextOperator == '/') {
                Double tmpResult = PerformSimpleAction(numbers[i + 1], numbers[i + 2], Character.toString(nextOperator));
                result = PerformSimpleAction(result, tmpResult, Character.toString(operator));
                ++i;
            }
            
            if (result.equals(Double.NaN)) {
                return result;
            }
        }
        return result;
    }

    @Override
    public void Run() {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        final int numbersLimit = 256;
        int numbersCounter = 1;
        Double[] numbers = new Double[numbersLimit];
        char[] operators = new char[numbersLimit];

        do {
            try {
                Double number = Double.parseDouble(Utils.AskUser("Enter number: "));

                String userInput = Utils.AskUser("Operation [+ - / * =] (= for result): ");
                char operation = userInput.charAt(0);

                numbers[numbersCounter] = number;
                operators[numbersCounter] = operation;

                if (operation == '=') {
                    break;
                }

                ++numbersCounter;
            } catch (IOException ex) {
                Logger.getLogger(SuperCalc.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (numbersCounter < numbersLimit);

        Double accumulator = numbers[0];
        accumulator = Calculate(numbers, operators, numbersCounter);

        printWriter.println(String.format("Result is: %1$f", accumulator));
    }
}
