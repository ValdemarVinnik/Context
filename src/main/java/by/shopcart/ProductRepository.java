package by.shopcart;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> list;

    @PostConstruct
    private List<Product> init() {
        return list = new ArrayList<Product>(Arrays.asList(new Product(1, "bread", 10L),
                new Product(2, "milk", 15L),
                new Product(3, "salt", 2L),
                new Product(4, "sugar", 25L),
                new Product(5, "butter", 50L)));
    }

    public void printProductList() {
        list.stream().forEach(e -> System.out.println(e));
    }

    public void printProductById(int id) {
        System.out.println(list.stream().filter(e -> e.getId() ==id).findFirst().get().toString());
    }

    public Product getProductById(int id) {
        Product product = list.stream().filter((e) -> e.getId() == id).findFirst().get();
        return product;
    }
}
