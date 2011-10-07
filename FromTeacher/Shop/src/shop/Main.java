/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.io.IOException;
import shop.service.administrator.IAdminService;
import shop.service.administrator.impl.AdminService;
import shop.service.customer.ICustomerService;
import shop.service.customer.impl.CustomerService;
import shop.controller.ShopController;
import shop.service.product.IProductService;
import shop.service.product.impl.ProductService;
import shop.user.administrator.Administrator;
import shop.user.customer.Customer;
import shop.user.product.notebook.Notebook;

/**
 *
 * @author Egor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        IAdminService adminService = new AdminService();
        IProductService productService = new ProductService();
        ICustomerService customerService = new CustomerService();

        Administrator admin = adminService.createAdmin("admin", "pwd", 38, "Johny");
        Customer customer = customerService.createCustomer("Bill", "user", 300);

        Notebook notebook = new Notebook("sdfg", 6, "dfsg", 6.0, 6, 6);

        productService.buyProduct(customer, notebook);

        System.out.println("Welcome to the shop.");

        ShopController.processLogin();
    }
}
