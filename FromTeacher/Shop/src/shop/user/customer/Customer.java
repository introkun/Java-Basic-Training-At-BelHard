/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.user.customer;

import java.util.ArrayList;
import java.util.List;
import shop.user.product.Product;
/**
 *
 * @author Egor
 */
public class Customer implements IUser {
    
    private String name;
    private String login;
    private int wallet;
    private int id;
    private List<Product> basket = new ArrayList();

    private static int numberOfCustomers = 0;

    public Customer(String login, String name, int wallet) {
        this.name = name;
        this.login = login;
        this.wallet = wallet;

        id = ++numberOfCustomers;
    }
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    public void increaseWallet (int dwallet) {
        wallet = wallet + dwallet;
    }

    public void decreaseWallet (int dwallet) {
        wallet = wallet - dwallet;
    }
}
