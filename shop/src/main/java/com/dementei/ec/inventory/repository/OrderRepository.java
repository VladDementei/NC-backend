package com.dementei.ec.inventory.repository;

import com.dementei.ec.inventory.entity.Order;
import com.dementei.ec.inventory.entity.OrderStatus;
import com.dementei.ec.inventory.entity.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByEmail(String email);

    List<Order> findAllByPaymentStatus(PaymentStatus paymentStatus);

    List<Order> findAllByEmailAndOrderStatus(String email, OrderStatus orderStatus);
}
