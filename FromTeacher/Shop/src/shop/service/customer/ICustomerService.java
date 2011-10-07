/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.service.customer;

import java.util.ArrayList;
import java.util.List;
import shop.user.product.Product;
import shop.user.customer.Customer;

/**
 *
 * @author Guerillero
 */
public interface ICustomerService {

     public static List<Customer> listCustomers = new ArrayList<Customer>();

     boolean removeCustomer(String login);

     List<Customer> getAllCustomers();

     Customer createCustomer(String name, String login, int wallet);

     boolean isCustomerExist(String login);

     void addProductToBasket(Product product, Customer customer);

     

}
