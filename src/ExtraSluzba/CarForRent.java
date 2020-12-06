package ExtraSluzba;

import Auto.Car;
import Manager.ManagerServisu;
public class CarForRent extends Car {

    public boolean isReadyToRent() {
        return isReadyToRent;
    }

    private boolean isReadyToRent;

    public void setReadyToRent(boolean readyToRent) {
        isReadyToRent = readyToRent;
    }

    public CarForRent(String brandName, int odometer, int kategoryOfCar, int dateOfMade, String color, String problem, boolean isReadyToRent) {
        super(brandName, odometer, kategoryOfCar, dateOfMade, color, problem);
        this.isReadyToRent = isReadyToRent;
    }

    public void CarGetReadyForLeave(String brandName, int odometer,boolean isReadyToRent,int kategoryOfCar){


    }





}
