package ExtraSluzba;

interface RemoveTireFromWarehouse {
    public void FullHouse();
    public void TiresAreIn();

}

public class WarehouseOfTires implements RemoveTireFromWarehouse  {
    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    private int Capacity;

    public WarehouseOfTires(int capacity) {
        Capacity = capacity;
        System.out.println("Warehouse of Tires is avaiable");

    }

    public void FullHouse() {
        System.out.println("Sorry, we cannot store your tires :(");
    }
    public void TiresAreIn() {
        System.out.println("We stored you tires succesfully");
    }




}
