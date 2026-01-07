package com.devsuperior.desafio01.service;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        if (order != null) {
            double shipValue = shippingService.shipment(order);
            double discountAmount = order.getBasic() * (order.getDiscount() / 100);
            double subTotal = order.getBasic() - discountAmount;
            return subTotal + shipValue;
        }
        return 0.0;
    }

}
