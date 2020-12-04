package WarehouseOfParts;

import Auto.Car;
import Auto.Part;

import java.util.ArrayList;

public class WarehouseOfParts extends Part {
    private int quantity;
    private int time;
    private double warranty;
    private boolean isReadyToRepair;


    public WarehouseOfParts(String name, String category, int partid, int quantity, int time, double warranty, boolean isReadyToRepair) {
        super(name, category, partid);
        this.quantity = quantity;
        this.time = time;
        this.warranty = warranty;
        this.isReadyToRepair = isReadyToRepair;
    }

    public void FindProblemPart(){


    }

    public int getTime() {
        return time;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
