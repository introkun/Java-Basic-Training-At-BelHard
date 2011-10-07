/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.service.customer.impl;


import java.util.List;
import shop.service.customer.*;
import shop.user.product.Product;
import shop.user.customer.Customer;


/**
 *
 * @author Egor
 */
public class CustomerService implements ICustomerService{

    public Customer createCustomer(String name, String login, int wallet){
        Customer customer = new Customer(name, login, wallet);
        listCustomers.add(customer);
        return customer;
    }

    public List<Customer> getAllCustomers(){
        return listCustomers;
    }

    public boolean removeCustomer(String login){
        int i = 0;
        
        boolean loginExist = false;
        
        for ( Customer customer : ICustomerService.listCustomers){
            if (customer.getLogin().equals(login)){
                ICustomerService.listCustomers.remove(i);
                loginExist = true;
                break;
                
            }
            i++;
        }
        return loginExist;
    }
        

    public boolean isCustomerExist(String login){

        boolean isExist = false;

        for (Customer customer : ICustomerService.listCustomers){
            if (login.equals(customer.getLogin()) ){
                isExist = true;
                break;
           }
        }

        return isExist;
    }
    public void addProductToBasket(Product product, Customer customer) {

        customer.getBasket().add(product);
        
    }
}
