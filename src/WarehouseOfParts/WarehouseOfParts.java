package WarehouseOfParts;

import Auto.Car;
import Auto.Part;

import java.util.ArrayList;

public class WarehouseOfParts extends Part {
    private int quantity;
    private int time;
    private double warranty;


    public WarehouseOfParts(String name, String category, int partid, int quantity, int time, double warranty) {
        super(name, category, partid);
        this.quantity = quantity;
        this.time = time;
        this.warranty = warranty;
    }

    public void FindProblemPart(){


    }





}
