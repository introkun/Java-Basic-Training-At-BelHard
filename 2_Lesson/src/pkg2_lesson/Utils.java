/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sergey.gradovich
 */
public class Utils {

    public static String AskUser(String message) throws IOException {
        System.out.print(message);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}
