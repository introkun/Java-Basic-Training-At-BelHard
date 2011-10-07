/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.controller.adminmenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import shop.controller.ShopController;
import shop.service.customer.ICustomerService;
import shop.service.customer.impl.CustomerService;
import shop.user.customer.Customer;
import shop.service.product.IProductService;
import shop.service.product.impl.ProductService;
import shop.user.product.Product;

/**
 *
 * @author Egor
 */
public class AdminMenuController {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    ICustomerService customerService = new CustomerService();
    IProductService productService = new ProductService();
    public void validateSelect(int select) throws IOException{
        switch (select) {
            case 1: showUserList();
                    break;
            case 2: deleteUser();
                    break;
            case 3: createUser();
                    break;
            case 4: showProductList();
                    break;
            case 5: deleteProduct();
                    break;
            case 6: createProduct();
                    break;
            case 0: ShopController.processLogin();
                    break;
            default: System.out.println("Select is incorrect. Try again;");
                     ShopController.showAdminMenu();
                     break;
        }

    }

    public void showUserList() throws IOException{
        int i = 1;
        for (Customer customer : customerService.getAllCustomers()){
            System.out.println(i+". Name: "+customer.getName()+"; Login: "+customer.getLogin());
            i++;
        }
        System.out.println("To resume press");
        String input = br.readLine();
        ShopController.showAdminMenu();
    }

    public void deleteUser() throws IOException{
        System.out.println("Please enter deleting user login");
        String input = br.readLine();
        
        if (customerService.isCustomerExist(input)){
            customerService.removeCustomer(input);
            System.out.println("User "+input+" successefully deleted.");
            ShopController.showAdminMenu();
        }else {
            System.out.println("User not found, please try again");
            deleteUser();
        }


    }

    public void createUser() throws IOException{
        System.out.println("Please enter login");
        String login = br.readLine();
        System.out.println("Please enter name");
        String name = br.readLine();
        System.out.println("Please enter wallet");
        int wallet = Integer.parseInt(br.readLine());
        customerService.createCustomer(name, login, wallet);
        ShopController.showAdminMenu();
    }

    public void showProductList() throws IOException{
        int i = 1;
        for (Product product : IProductService.listProducts){
            System.out.println(i+". Name: "+product.getName()+"; Price: "+product.getPrice()+"; Description: "+product.getDescription());
            i++;
        }
        System.out.println("To resume press");
        String input = br.readLine();
        ShopController.showAdminMenu();
    

    }

    public void deleteProduct() throws IOException{
        System.out.println("Please, enter name of the product to delete");
        String name = br.readLine();
        if (productService.removeProduct(name)){
            System.out.println("Product "+name+" has successefully deleted.");

        }else{
            System.out.println("Product "+name+" not found.");
        }

        System.out.println("To resume press");
        String input = br.readLine();
        ShopController.showAdminMenu();
    }

    public void createProduct() throws IOException{
        System.out.println("Please enter name");
        String name = br.readLine();
        System.out.println("Please enter Price");
        Integer price = Integer.parseInt(br.readLine());
        System.out.println("Please enter description");
        String description = br.readLine();
        productService.createProduct(name, price, description);
        ShopController.showAdminMenu();
        
    }
}
