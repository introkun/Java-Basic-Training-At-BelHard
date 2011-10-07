/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.user.product.cellphone;

import shop.user.product.Product;

/**
 *
 * @author Egor
 */
public class Cellphone extends Product{
    private double weight;
    private String standart;
    private double batteryCapacity;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getStandart() {
        return standart;
    }

    public void setStandart(String standart) {
        this.standart = standart;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Cellphone(String name, int price, String description, double weight, String standart, double batteryCapacity){
        super(name, price);
        this.setDescription("Cellphone - "+description);
        this.weight = weight;
        this.standart = standart;
        this.batteryCapacity = batteryCapacity;
    }

}
