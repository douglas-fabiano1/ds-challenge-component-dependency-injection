package com.devsuperior.challenge1.services;

import com.devsuperior.challenge1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic()
                - (order.getBasic() * order.getDiscount() / 100)
                + shippingService.shipment(order);
    }
}
