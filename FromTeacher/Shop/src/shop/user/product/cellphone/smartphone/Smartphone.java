/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.user.product.cellphone.smartphone;

import shop.user.product.cellphone.Cellphone;

/**
 *
 * @author Egor
 */
public class Smartphone extends Cellphone{

    private String os;
    private double camPixels;

    public double getCamPixels() {
        return camPixels;
    }

    public void setCamPixels(double camPixels) {
        this.camPixels = camPixels;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    

    public Smartphone(String name, int price, String description, double weight, String standart, double batteryCapacity, String os, double camPixels){
        super(name, price, description, weight, standart, batteryCapacity);
        this.os = os;
        this.camPixels = camPixels;
    }

    
}
