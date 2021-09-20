package org.launchcode.java.studios.restaurant;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;
    private boolean isNew;

    public boolean isNewMenuItem(){
        return this.isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", dateAdded=" + dateAdded +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem otherMenuItem = (MenuItem) o;
        return Double.compare(otherMenuItem.price, price) == 0 && isNew == otherMenuItem.isNew && Objects.equals(name, otherMenuItem.name) && Objects.equals(description, otherMenuItem.description) && Objects.equals(category, otherMenuItem.category) && Objects.equals(dateAdded, otherMenuItem.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, category, dateAdded, isNew);
    }
}
