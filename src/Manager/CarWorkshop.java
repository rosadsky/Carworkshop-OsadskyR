package Manager;





import java.util.ArrayList;
import java.util.List;

import Auto.Car;
import WarehouseOfParts.WarehouseOfParts;
import WarehouseOfParts.Engine;
import WarehouseOfParts.Other;
import WarehouseOfParts.Electronic;
import Auto.Part;

import org.w3c.dom.ls.LSOutput;


public class CarWorkshop {
    private String name;
    private ArrayList<Mechanic> ListOfMechanics;
    private ArrayList<Car> ListOfCars;
    private ArrayList<WarehouseOfParts>WarehouseOfPartsArray;



    public CarWorkshop(String name, int pocetZdvihakov) {
        this.name = name;
        System.out.println("Car workshop name: "+ this.name + " | Number of lifts: " + pocetZdvihakov);
    }

    /*--------- Adding Mechanic-------*/

    public void AddMechanic(Mechanic newMechanic){
        this.ListOfMechanics.add(newMechanic);
        System.out.println("MECHANIC SUCCESFULLY ADDED...");

    }

    /*--------- Adding car-------*/


    public void AddCar(Car newCar){
        this.ListOfCars.add(newCar);
    }

    /*
    Initialize car workshop
    -array for mechanics
    -array for cars
    -default create car,mechanics
     */

    public void InitialazeCarWorkshop(){
        ListOfMechanics = new ArrayList<Mechanic>();
        ListOfCars = new ArrayList<Car>();
        DefultCars();
        DefaultMechanics();
        Car.InitialazeCarPart();
        WarehouseOfPartsArray = new ArrayList<WarehouseOfParts>();
        DefaultListOfWarehouseParts();


    }

    //default cars

    private void DefultCars(){
        ListOfCars.add(new Car("BMW",215000,3, 2001,"black","Electric"));
        ListOfCars.add(new Car("GOLF",312000,1, 1998,"blue","Engine"));
    }

    //default mechanics

    private void DefaultMechanics(){
        ListOfMechanics.add(new Mechanic("Jano Pastor",1991,"Electric"));
        ListOfMechanics.add(new Mechanic("Roman Osadsky",1992,"Engine"));
        ListOfMechanics.add(new Mechanic("Lubos Smolar",1991,"Other"));
    }
    //  String name, String category, int partid, int quantity, int time, double warranty, boolean isReadyToRepair, int stavDielu) {
    private void DefaultListOfWarehouseParts(){
        WarehouseOfPartsArray.add(new Electronic("part1-1","Electric",13,2,12,2,true,true) );
        WarehouseOfPartsArray.add(new Electronic("part2-2","Electric",14,2,5,2,true,true) );
        WarehouseOfPartsArray.add(new Electronic("part3","Electric",15,0,7,2,true,false) );
        WarehouseOfPartsArray.add(new Engine("part4","Engine",16,1,8,2,true,1) );
        WarehouseOfPartsArray.add(new Engine("part5","Engine",17,1,9,1.5,true,1) );
        WarehouseOfPartsArray.add(new Engine("part6","Engine",18,1,9,1,true,1) );
        WarehouseOfPartsArray.add(new Other("part7","Engine",18,1,9,1,true,12) );
        WarehouseOfPartsArray.add(new Other("part8","Engine",18,2,9,1,true,13) );
        WarehouseOfPartsArray.add(new Other("part9","Engine",18,3,9,1,true,14) );
    }


    public void ShowListOfWarehouseParts(){
        System.out.println("DOSTUPNE DIELY");
        for (WarehouseOfParts wareTmp : WarehouseOfPartsArray){
            System.out.println("NAZOV:" + wareTmp.getNameOfPart());
        }
    }


    //Show all mechanics from array

    public void ShowAllMechanics(){
        System.out.println("LIST OF ALL MECHANICS");
        for (Mechanic MechTmp : ListOfMechanics ){
            System.out.println("Name: " + MechTmp.getName() +" ID: [" + MechTmp.getMechanicID() +"] Specialization: " + MechTmp.getSpecialization() + " isWowking: "+ MechTmp.isWorking());
        }
    }

    //Show all cars from array


    public void ShowAllCars(){
        System.out.println("LIST OF ALL CARS");
        for (Car carTmp : ListOfCars){
            //System.out.println("CAR: "+ carTmp.brandName);
            System.out.println("CAR: " + carTmp.brandName + "\nYEAR: " + carTmp.dateOfMade + "\nODOMETER: " + carTmp.odometer + "\nKATEGORY: " + carTmp.kategoryOfCar + "\nCOLOR: " + carTmp.color + "\n--------"  );

        }

    }

    //find car to repair when "workadd" and send it to FindFreeMechanics to mach best mechanic

    public Car FindCarToRepair(String name, int yearOfMade) {
        for (Car carTmp : ListOfCars) {
            if(carTmp.brandName.equals(name)){
                return carTmp;
            }
        }
        return null;
    }

    /*
    Find best mechanic with specialization for car problem.
    -if there is no free mechanic for this problem system pick first free mechanic
     */

    public Mechanic FindFreeMechanic(Car carToRepair){
        for (Mechanic mechTmp : ListOfMechanics){
            if((!mechTmp.isWorking() && mechTmp.getSpecialization().equals(carToRepair.problem))){
                return mechTmp;
            }
        }

        for (Mechanic mechTmp : ListOfMechanics){
            if((!mechTmp.isWorking())){
                return mechTmp;
            }
        }

        return null;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Mechanic> getListOfMechanics() {
        return ListOfMechanics;
    }

    public ArrayList<Car> getListOfCars() {
        return ListOfCars;
    }
}
