package proj1;

import java.util.ArrayList;
import java.util.Collections;

// Enum for Crust Type
enum CrustType {
    Plain, Butter, Garlic, GarlicButter, Cheese
}

// Enum for Size Type
enum SizeType {
    Small, Medium, Large, XLarge, XXLarge, Party
}

// Pizza class implementing Comparable
public class Pizza implements Comparable<Pizza> {
    private CrustType crust;
    private ArrayList<String> toppings;
    private SizeType size;

    // Default Constructor
    public Pizza() {
        this.crust = CrustType.Plain;
        this.toppings = new ArrayList<>();
        this.size = SizeType.Small;
    }

    // Parameterized Constructor
    public Pizza(CrustType crust, ArrayList<String> toppings, SizeType size) {
        this.crust = crust;
        this.toppings = new ArrayList<>(toppings);
        this.size = size;
    }

    // Getter and Setter Methods
    public CrustType getCrust() { return crust; }
    public void setCrust(CrustType crust) { this.crust = crust; }
    public ArrayList<String> getToppings() { return toppings; }
    public void setToppings(ArrayList<String> toppings) { this.toppings = new ArrayList<>(toppings); }
    public SizeType getSize() { return size; }
    public void setSize(SizeType size) { this.size = size; }
    
    // Add a topping
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This pizza has a ").append(crust).append(" crust and the following toppings:\n");
        if (toppings.isEmpty()) {
            sb.append("none");
        } else {
            for (String topping : toppings) {
                sb.append(topping).append("\n");
            }
        }
        return sb.toString();
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pizza pizza = (Pizza) obj;
        return crust == pizza.crust && toppings.size() == pizza.toppings.size();
    }

    // compareTo method
    @Override
    public int compareTo(Pizza otherPizza) {
        if (this.toppings.size() < otherPizza.toppings.size()) {
            return -1;
        } else if (this.toppings.size() > otherPizza.toppings.size()) {
            return 1;
        } else {
            return Integer.compare(crust.ordinal(), otherPizza.crust.ordinal());
        }
    }
}


    
