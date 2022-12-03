package by.shopcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")

public class Cart {

    private List<Product> productList;

    private ProductRepository repository;

    @PostConstruct
    private void init() {
        productList = new ArrayList<Product>();
    }

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProductById(int id){
        Product product = repository.getProductById(id);
        productList.add(product);
    }

    public void deleteProductById(int id){
        productList.remove(productList.stream().filter(e -> e.getId() == id).findFirst().get());
    }

    public void printProductList(){
        productList.stream().forEach((e)-> System.out.println(e));
    }
}


