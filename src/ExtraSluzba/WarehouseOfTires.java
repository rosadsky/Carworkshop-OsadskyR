package ExtraSluzba;

interface RemoveTireFromWarehouse {
    public void FullHouse();
    public void TiresAreIn();
    public void CheckCapacity();
}



public class WarehouseOfTires implements RemoveTireFromWarehouse {
    private int Capacity;

    public WarehouseOfTires(int capacity) {
        Capacity = capacity;
        System.out.println("Warehouse of Tires is avaiable");

    }

    public void CheckCapacity(){


    }

    public void FullHouse() {
        if(Capacity < 50);
        System.out.println("Sorry, we cannot store your tires :(");
    }
    public void TiresAreIn() {
        System.out.println("We stored you tires succesfully");
    }
}
