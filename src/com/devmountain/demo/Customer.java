package com.devmountain.demo;

public class Customer {
    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long ccNumber);
        this.name = name;
    this.creditCard = new CreditCard(ccNumber);

    public Order(ShoppingCart cart){
        Optional<Payment> =creditCard.mkPayment(cart.getTotalCost());
//        return payment.isPresent() ? Optional.of(new Order(this,cart,payment.get())): Optional.empty();
        return payment.map(value-> new Order(this,cart,value));
    }

    @Override
    public String toString(){
        return "Customer{" +
                "name ='" +name + '\''+
                ", creditCard =" + creditCard +
                '}';
    }
}
