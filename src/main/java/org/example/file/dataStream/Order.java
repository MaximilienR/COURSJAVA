package org.example.file.dataStream;

import java.time.LocalDate;

public class Order {

    private LocalDate orderDate;

    private  boolean finished;

    private String item;

    private  int united;

    private float unitCost;

    private float total;

    public Order(LocalDate orderDate, boolean finished, String item, int united, float unitCost, float total) {
        this.orderDate = orderDate;
        this.finished = finished;
        this.item = item;
        this.united = united;
        this.unitCost = unitCost;
        this.total = total;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getUnited() {
        return united;
    }

    public void setUnited(int united) {
        this.united = united;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
