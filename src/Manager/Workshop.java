package Manager;

import Auto.Car;

abstract class Workshop {
    private Car newCar;
    private Mechanic newMechanic;

    abstract void AddMechanic(Mechanic newMechanic);
    abstract void AddCar(Car newCar);

}
