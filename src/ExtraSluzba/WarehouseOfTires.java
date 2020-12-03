package ExtraSluzba;

interface RemoveTireFromWarehouse {
    public void FullHouse(); // interface method (does not have a body)
    public void TiresAreIn();
}


public class WarehouseOfTires implements RemoveTireFromWarehouse {
    private int Capacity;

    public WarehouseOfTires(int capacity) {
        Capacity = capacity;
        System.out.println("Warehouse of Tires is avaiable");
    }

    public void FullHouse() {
        // The body of animalSound() is provided here
        System.out.println("Sorry, we cannot store your tires :(");
    }
    public void TiresAreIn() {
        System.out.println("We stored you tires succesfully");
    }
}
