/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.user.product.notebook;

import shop.user.product.Product;

/**
 *
 * @author Egor
 */
public class Notebook extends Product{
    private double cpuFrequency;
    private int ramSize;
    private int hddCapacity;

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public Notebook (String name, int price, String description, double cpuFrequency, int ramSize, int hddCapacity){
            super(name, price);
            this.setDescription("Notebook - " + description);
            this.cpuFrequency = cpuFrequency;
            this.ramSize = ramSize;
            this.hddCapacity = hddCapacity;
    }
}
