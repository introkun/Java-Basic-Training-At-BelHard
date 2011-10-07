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
public class CastingAndArrays implements IRunnable {

    @Override
    public void Run() {
        int i = 1025;
        byte b = 126;

        int newIntFromByte = b;
        byte newByteFromInt = (byte) i;

        if (newIntFromByte == 1024 && newByteFromInt == 126) {
            System.out.println("Conversion done without error.");
        } else {
            System.out.println("Conversion is not successfull.");
            System.out.println("newIntFromByte:" + newIntFromByte + ". Should be " + i + ".");
            System.out.println("newByteFromInt:" + newByteFromInt + ". Should be " + b + ".");
        }

        String value = "";

        try {
            value = Utils.AskUser("Please enter data: ");

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("\nResulting array is:");
        for (String str : value.split(" ")) {
            System.out.println(str);
        }
    }
}
