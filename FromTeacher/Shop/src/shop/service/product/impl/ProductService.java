/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.service.product.impl;

import shop.service.administrator.IAdminService;
import shop.service.administrator.impl.AdminService;
import shop.service.customer.ICustomerService;
import shop.service.customer.impl.CustomerService;
import shop.service.product.IProductService;
import shop.user.customer.Customer;
import shop.user.product.Product;

/**
 *
 * @author Egor
 */
public class ProductService implements IProductService{

    public Product createProduct (String name, int price, String description) {

            Product product = new Product(name, price, description);
            listProducts.add(product);
            System.out.println("Product" + product.getName() +" have created.");
            return product;
       
        
    }

    public boolean removeProduct (int productId, String login, String password) {
        
       boolean success = false;
       IAdminService adminService = new AdminService();

       if (adminService.checkAdmin(login, password)){
            for (Product product : listProducts){
                int i=0;
                if(productId == product.getId()){
                    product = null;
                    listProducts.remove(i);
                    success = true;
                    break;
                }
                i++;
            }
            System.out.println("Product have deleted.");
            return success;
        } else {
            System.out.println("Product have not removed beacause credentials is invalid.");
            return success;
        }
       
       
    }
    public boolean removeProduct(String name) {

       boolean success = false;

            for (Product product : listProducts){
                int i=0;
                if(name.equals(product.getName())){
                    product = null;
                    listProducts.remove(i);
                    success = true;
                    break;
                }
                i++;
            }
            System.out.println("Product have deleted.");
            return success;



    }
    public boolean buyProduct (Customer customer, Product product) {
        
        boolean success = false;
        ICustomerService customerService = new CustomerService();
        
        if (product.getPrice() <= customer.getWallet()) {
             customerService.addProductToBasket(product, customer);
             customer.decreaseWallet(product.getPrice());
             System.out.println(customer.getName() + "have bought" + product.getName());
             success = true;
        } else {
            System.out.println("Customer has not enough money");
        }
        return success;
                
    }

}
