/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_lesson;

/**
 *
 * @author sergey.gradovich
 */
public class Foreach implements IRunnable {

    @Override
    public void Run() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        
        for (int i : array)
        {
            sum += i;
        }
        
        System.out.println(sum);
    }
    
}
