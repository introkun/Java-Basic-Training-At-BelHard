/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.user.product;

/**
 *
 * @author Egor
 */
public class Product {

    public final static String NO_DESCRIPTION = "No description";
    public final static String NO_NAME = "No name";
    public final static int NO_PRICE = 0;

    private static int numberOfProducts = 0;

    private String name;
    private String description;
    private int price;
    private int id;

    public Product(String name, int price, String description){
        this.name = name;
        this.price = price;
        this.description = description;

        id = ++numberOfProducts;
    }

    public Product(String name, int price){
        this.name = name;
        this.price = price;
        this.description = NO_DESCRIPTION;

        id = ++numberOfProducts;
    }

    public Product(){
        this.name = NO_NAME;
        this.price = NO_PRICE;
        this.description = NO_DESCRIPTION;
        
        id = ++numberOfProducts;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
   
}
