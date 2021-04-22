/**
 * Name : Dhruv Dave
 * Student Number : 200456157
 */
package models;

public abstract class InventoryItem {

    private int quantityInStock, quantitySold = 0;
    private double purchasePrice, sellingPrice;

    public InventoryItem(double purchasePrice, double sellingPrice, int quantityInStock)
    {
        setPurchasePrice(purchasePrice);
        setSellingPrice(sellingPrice);
        setQuantityInStock(quantityInStock);
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if(quantityInStock >= 0)
            this.quantityInStock = quantityInStock;
        else
            throw new IllegalArgumentException("quantity in stock should be more than 0");
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        if(quantityInStock >= quantitySold) {
            quantityInStock = quantityInStock - quantitySold;
            quantitySold = quantitySold + quantitySold;
        }
        else
            throw new IllegalArgumentException("out of stock");

    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if(purchasePrice >= 0)
            this.purchasePrice = purchasePrice;
        else
            throw new IllegalArgumentException("purchase price should be greater than 0");
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if(sellingPrice > purchasePrice)
            this.sellingPrice = sellingPrice;
        else
            throw new IllegalArgumentException("Selling price should be greater than purchase price");
    }

    public double getProfit()
    {
        return  (sellingPrice - purchasePrice) * quantitySold;

    }
}
