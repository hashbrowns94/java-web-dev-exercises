package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public void addItem(MenuItem anItem){
        items.add(anItem);
    }
    public void removeItem(MenuItem anItem){
        items.remove(anItem);
    }

    public Date getLastUpdatedDate(){
        return this.lastUpdated;
    }

    @Override
    public String toString() {
        String entireMenu = "";
        for (MenuItem aMenuItem : items){
            entireMenu += aMenuItem.toString();
        }
        return entireMenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(items, menu.items) && Objects.equals(lastUpdated, menu.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, lastUpdated);
    }
}
