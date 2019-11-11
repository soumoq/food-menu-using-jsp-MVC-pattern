
package com;
import java.util.*;

public class Food {
    private int id;
    private String item;
    private String price;
    
    public Food(int id,String item,String price)
    {
        this.id=id;
        this.item=item;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public String getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}

