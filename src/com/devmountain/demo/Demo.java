package com.devmountain.demo;

public class Demo {
    public static void main (String[] args){
        ShoppingCart cart = new ShoppingCart();
        Product toothbrush = new Product ( "Electric Toothbrush", 3550 );
        Product babyAlarm = new Product ("Baby Alarm", 4999);


        Product tootbrush = Catalogue.getProduct("Electric Toothbrush");

        cart.addProduct(toothbrush);
        car.addProduct(babyAlarm);
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
