package WarehouseOfParts;

public class Other extends WarehouseOfParts {
    private double price;


    public Other(String name, String category, int partid, int quantity, int time, double warranty, boolean isReadyToRepair, double price) {
        super(name, category, partid, quantity, time, warranty, isReadyToRepair);
        this.price = price;

        System.out.println("Other part added to WhList...");
    }
}
