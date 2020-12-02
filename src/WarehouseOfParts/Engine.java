package WarehouseOfParts;

public class Engine extends WarehouseOfParts  {
    private int stavDielu;

    public Engine(String name, String category, int partid, int quantity, int time, double warranty, boolean isReadyToRepair, int stavDielu) {
        super(name, category, partid, quantity, time, warranty, isReadyToRepair);
        this.stavDielu = stavDielu;
    }
}
