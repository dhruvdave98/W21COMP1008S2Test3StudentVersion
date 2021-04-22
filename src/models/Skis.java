/**
 * Name : Dhruv Dave
 * Student Number : 200456157
 */
package models;

import Utilities.DBUtility;

public class Skis extends InventoryItem{
    private String brand, model;
    private int length;

//    public Skis(String brand, String model, int length,double purchasePrice, double sellingPrice, int quantityInStock) {
//    }


    public Skis(String brand, String model, int length , double purchasePrice, double sellingPrice , int quantityInStock) {
        super(purchasePrice, sellingPrice, quantityInStock);
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length>=60 && length<=220)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be in the range of 60 to 220");
    }
}
