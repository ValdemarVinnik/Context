package by.shopcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class CartService {
    private final String CONTEXT_PATH = "by.shopcart";
    private Scanner scanner;
    private Cart cart;

    public CartService() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CONTEXT_PATH);
        cart = context.getBean("cart", Cart.class);
        scanner = new Scanner(System.in);
    }

    @Autowired
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void run() {
        System.out.println("show....add....delete");
        String message;
        while (!(message = scanner.nextLine()).equals("exit")) {

            switch (message) {
                case "show":
                    showCartContent();
                    break;
                case "add":
                    addProduct();
                    break;
                case "delete":
                    deleteProduct();
            }
            System.out.println("show....add....delete");
        }
    }

    private void deleteProduct() {
        int id = scanner.nextInt();
        cart.deleteProductById(id);
    }

    private void addProduct() {
        int id = scanner.nextInt();
        cart.addProductById(id);
    }

    private void showCartContent() {
        cart.printProductList();
    }
}
