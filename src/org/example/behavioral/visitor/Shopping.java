package org.example.behavioral.visitor;

public class Shopping {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addToCart(new Pizza(1));
        shoppingCart.addToCart(new Meat(3.5, 3));
        shoppingCart.addToCart(new Rice(0.55, 2));

        System.out.println("Total price of purchases: " + shoppingCart.calculateTotal() + "$.");
    }
}
