package Shop.User.Customer;

import Shop.Model.Product.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergey.gradovich
 */
public class Customer {
    
    private String name;
    private String login;
    private int vallet;
    private List<Product> basket = new ArrayList();

    public Customer(String name, String login, int vallet) {
        this.name = name;
        this.login = login;
        this.vallet = vallet;
    }
    
    public String toString1() {
        String result;
        result = "Customer: " + name + "\n";
        result += "\tLogin: " + login+ "\n";
        result += "\tVallet: " + String.valueOf(vallet) + "\n";
        return result;
    }
    
    public void addToBasket(Product product) {
        basket.add(product);
    }
    
    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
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

    public int getVallet() {
        return vallet;
    }

    public void setVallet(int vallet) {
        this.vallet = vallet;
    }
}
