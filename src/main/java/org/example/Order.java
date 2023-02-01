package org.example;

public class Order {
   private String id;

   private OrderStatus status;

    public Order(String id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", status=" + status +
                '}';
    }
}
