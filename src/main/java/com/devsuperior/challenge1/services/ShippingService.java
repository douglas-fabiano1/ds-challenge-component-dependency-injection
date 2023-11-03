package com.devsuperior.challenge1.services;

import com.devsuperior.challenge1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double basicValue = order.getBasic();
        if (basicValue >= 200.0){
            return 0;
        }else {
           return basicValue < 100.0 ? 20.0 : 12.0;
        }
    }
}
