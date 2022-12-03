package by.shopcart;

import org.springframework.stereotype.Component;


public class Product {
    private int id;
    private String title;
    private long price;

    public Product(int id, String title, long price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product : " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price;
    }
}
