/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import shop.controller.adminmenu.AdminMenuController;
import shop.service.administrator.IAdminService;
import shop.service.administrator.impl.AdminService;
import shop.service.customer.ICustomerService;
import shop.service.customer.impl.CustomerService;

/**
 *
 * @author Egor
 */
public class ShopController {

    public static void processLogin() throws IOException {


        String inputLogin;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IAdminService adminService = new AdminService();
        ICustomerService customerService = new CustomerService();

        System.out.println("Please enter your login");
        inputLogin = br.readLine();

        if (adminService.isAdminExist(inputLogin)) {
            System.out.println("Please enter your password");
            String inputPassword = br.readLine();
            if (adminService.checkAdmin(inputLogin, inputPassword)) {
                try {
                    showAdminMenu();
                } catch (IOException ex) {
                    System.out.print(ex);
                }

            } else {
                System.out.println("Incorrect password, please try again");
                processLogin();
            }
        } else if (customerService.isCustomerExist(inputLogin)) {
            showCustomerMenu();
        } else {
            System.out.println("The login you have entered is invalid. Please try again");
            processLogin();
        }

    }

    public static void showAdminMenu() throws IOException {
        System.out.println("Select operation from the folloving list:");
        System.out.println("1. Show users list.");
        System.out.println("2. Delete existing user.");
        System.out.println("3. Create new user.");
        System.out.println("4. Show produts list.");
        System.out.println("5. Delete existing product.");
        System.out.println("6. Create new product.");
        System.out.println("0. Exit.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int select = Integer.parseInt(input);

        AdminMenuController adminMenuController = new AdminMenuController();
        adminMenuController.validateSelect(select);
    }

    public static void showCustomerMenu() throws IOException {
        System.out.println("Select operation from the folloving list:");
        System.out.println("1. Show produts list.");
        System.out.println("2. Buy product.");
        System.out.println("3. View cash.");
        System.out.println("0. Exit.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int select = Integer.parseInt(input);

//        CustomerMenuController customerMenuController = new CustomerMenuController();
//        customerMenuController.validateSelect(select);

    }
}
