package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sergey.gradovich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(" vvedite vash vozrost");
        
        try
        {
            Integer age = Integer.parseInt(br.readLine());
            System.out.println("vash vozrost: " + age);
        }
        catch (NumberFormatException ex)
        {
            System.out.println(" nevernie dannie!!! " + ex.toString());
        }


      // TODO code application logic here
    }
}
