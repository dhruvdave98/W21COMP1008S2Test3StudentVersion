/**
 * Name : Dhruv Dave
 * Student Number : 200456157
 */
package models;

import java.util.ArrayList;

public class SportStore {
    private String address;
    private ArrayList<InventoryItem> inventory;

    public SportStore(String address, ArrayList<InventoryItem> inventory) {
        setAddress(address);
        this.inventory = inventory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = (address.trim());
        if(address.length() > 5)
            this.address = address;
        else
            throw new IllegalArgumentException("Address should be more than 5 characters");
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void sellItem(InventoryItem item, int quantitySold)
    {
        item.setQuantitySold(quantitySold);
    }

    public double calculateProfit()
    {
        double profit =0;
        for(int i=0; i<=inventory.size(); i++) {

            profit += profit;
        }

        return profit;
    }
}
