/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.service.administrator;

import java.util.ArrayList;
import java.util.List;
import shop.user.administrator.Administrator;

/**
 *
 * @author Egor
 */
public interface IAdminService {

   public static List<Administrator> listAdmins = new ArrayList<Administrator>();
    
   Administrator createAdmin(String login, String password, int age, String name);

   boolean removeAdmin(int id);
   
   boolean checkAdmin(String login, String password);

   boolean isAdminExist(String login);
   
}