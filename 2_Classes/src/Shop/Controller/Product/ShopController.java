/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Controller.Product;

import Shop.Model.Product.Product;
import Shop.User.Customer.Customer;

/**
 *
 * @author sergey.gradovich
 */
public class ShopController {
    
    public boolean BuyProduct(Product product, Customer customer) {
        if (customer.getVallet() >= product.getPrice()) {
            System.out.println(String.format("Product '%1$s' successfully added to '%2$s' basket.", product.getName(),
                    customer.getName()));
            int moneyLeft = customer.getVallet() - product.getPrice();
            customer.setVallet(moneyLeft);
            customer.addToBasket(product);
            return true;
        }
        else {
            System.out.println(String.format("[Error] Dear '%1$s', You haven't enough money to buy '%2$s'. Sorry.",
                    customer.getName(), product.getName()));
            return false;
        }
    }
}
