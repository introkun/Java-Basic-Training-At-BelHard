/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.service.product;

import java.util.ArrayList;
import java.util.List;
import shop.user.customer.Customer;
import shop.user.product.Product;

/**
 *
 * @author Egor
 */
public interface IProductService {

    public static List<Product> listProducts = new ArrayList<Product>();

    Product createProduct (String name, int price, String description);

    boolean removeProduct (int productId, String login, String password);

    boolean removeProduct (String name);

    boolean buyProduct (Customer customer, Product product);

}
