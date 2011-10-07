/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import Shop.Controller.Product.ShopController;
import Shop.Model.Product.Product;
import Shop.User.Customer.Customer;

/**
 *
 * @author sergey.gradovich
 */
public class Main {

    public static void main(String[] args) {
        Product milk = new Product("Milk", 6000, "Simple milk");
        Product bread = new Product("Bread", 2000, "Simple bread");
        Product meat = new Product("Meat", 50000, "Simple meat");
        Product pc = new Product("PC", 12000000, "Simple PC");
        
        ShopController controller = new ShopController();
        
        Customer vasya = new Customer("Vasiliy Pupkin", "vasya.pupkin", 1000000);
        Customer alise = new Customer("Alise", "alise", 400000);
        Customer steve = new Customer("Steve Jobs", "alise", 7000000);
        
        System.out.println("== Customers in the Shop ==");
        System.out.println(vasya.toString());
        System.out.println(alise.toString());
        System.out.println(steve.toString());
        
        
        
        controller.BuyProduct(milk, vasya);
        controller.BuyProduct(meat, vasya);
        
        controller.BuyProduct(bread, alise);
        controller.BuyProduct(milk, alise);
        
        controller.BuyProduct(pc, steve);
    }
}
