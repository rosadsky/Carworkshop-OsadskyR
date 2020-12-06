package WarehouseOfParts;

public class Electronic extends WarehouseOfParts {
    private final boolean isNew;

    public Electronic(String name, String category, int partid, int quantity, int time, double warranty, boolean isReadyToRepair, boolean isNew) {
        super(name, category, partid, quantity, time, warranty, isReadyToRepair);
        this.isNew = isNew;

        System.out.println("Electronic part added to WhList...");
    }
}
