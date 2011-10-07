/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.service.administrator.impl;

import shop.service.administrator.*;
import shop.user.administrator.Administrator;

/**
 *
 * @author Egor
 */
public class AdminService implements IAdminService {

    public Administrator createAdmin(String login, String password, int age, String name) {
        Administrator admin = new Administrator(login, password, name, age);
        listAdmins.add(admin);
        return admin;
    }

    public boolean removeAdmin(int id) {

        boolean success = false;

        for (Administrator admin : listAdmins) {
            int i = 0;
            if (id == admin.getId()) {
                admin = null;
                listAdmins.remove(i);
                success = true;
                break;
            }
            i++;
        }

        return success;
    }

    public boolean checkAdmin(String login, String password) {

        boolean isExist = false;

        for (Administrator admin : listAdmins) {
            if (login.equals(admin.getLogin()) && password.equals(admin.getPassword())) {
                isExist = true;
                break;
            }
        }

        return isExist;
    }

    public boolean isAdminExist(String login) {

        boolean isExist = false;

        for (Administrator admin : listAdmins) {
            if (login.equals(admin.getLogin())) {
                isExist = true;
                break;
            }
        }

        return isExist;
    }
}
