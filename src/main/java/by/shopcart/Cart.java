package by.shopcart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")

public class Cart {

    private List<Product> productList;
    private ProductRepository repository;

    private void init() {
        productList = new ArrayList<Product>();
    }

    public void addProductById(int id){

    }

    public void deleteProductById(int id){

    }

    public void printProductList(){
        productList.stream().forEach((e)-> System.out.println(e));
    }
}


