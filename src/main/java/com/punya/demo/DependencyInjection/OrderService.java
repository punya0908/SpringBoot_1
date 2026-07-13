package com.punya.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    field injection
//    @Autowired
    PaymentService paymentService;



//    constructor injection
    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    setter injection
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.payment();
        System.out.println("Order placed");
    }
}
//field injection
//construction injection
//setter injection