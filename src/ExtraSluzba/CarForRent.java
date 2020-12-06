package ExtraSluzba;

import Auto.Car;

public class CarForRent extends Car {

    public boolean isReadyToRent() {
        return isReadyToRent;
    }

    private boolean isReadyToRent;

    public boolean isClean() {
        return isClean;
    }

    private boolean isClean;

    public void setReadyToRent(boolean readyToRent) {
        isReadyToRent = readyToRent;
    }

    public CarForRent(String brandName, int odometer, int kategoryOfCar, int dateOfMade, String color, String problem, boolean isReadyToRent,boolean isClean) {
        super(brandName, odometer, kategoryOfCar, dateOfMade, color, problem);
        this.isReadyToRent = isReadyToRent;
    }

    /*--------- POLYMORFIZMUS ---------*/

    public boolean CarGetReadyForLeave(boolean isReadyToRent, boolean isClean, int kategoryOfCar, int CategoryCarInWorkshop){
        if (!isClean){
            System.out.println("We need to clean car...");
            isClean = true;
        }
        if (kategoryOfCar >= CategoryCarInWorkshop && isClean){
            setReadyToRent(true);
        }
        return isReadyToRent;
    }





}
