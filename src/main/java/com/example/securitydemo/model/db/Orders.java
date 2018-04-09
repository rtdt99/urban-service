package com.example.securitydemo.model.db;

import com.example.securitydemo.model.db.Customer;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    private int orderId;

    @OneToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Customer customerId;

    private double totalCost;
    private Date orderTime;
    private String orderStatus;

    public Orders() {
    }

    public Orders(int orderId, Customer customerId, double totalCost, Date orderTime, String orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.totalCost = totalCost;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
