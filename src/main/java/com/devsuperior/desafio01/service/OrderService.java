package com.devsuperior.desafio01.service;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        if (order != null) {
            double discountAmount = order.getBasic() * (order.getDiscount() / 100);
            return order.getBasic() - discountAmount;
        }
        return 0.0;
    }

    public String getCodeNumber(Order order) {
        if (order != null) {
            return "Pedido código " + order.getCode();
        }
        return null;
    }

    public String getFinalOrder(Order order) {
        if (order != null) {
            double shipValue = shippingService.shipment(order);
            double totalValue = total(order) + shipValue;
            return "Valor total: R$ " + String.format("%.2f", totalValue);
        }
        return null;
    }

}
