package Manager;

import java.util.ArrayList;
import Auto.Car;
import Auto.Part;
import ExtraSluzba.ExtraService;

public class ManagerServisu {

    private CarWorkshop CarWorkshop;
    private ArrayList<RepairService> ListOfServices;
    private ArrayList<ExtraService> ListOfExtraServices;
    private CommandLine InterpreterService;
    private Part RepairCostAdder;
    private Car Car;

    private void InitializeSystem(){
        final int MAXLIFTS = 6;
        this.CarWorkshop = new CarWorkshop("AUTOSERVIS OSADSKY", MAXLIFTS);
        ListOfServices = new ArrayList<RepairService>();
        ListOfExtraServices = new ArrayList<ExtraService>();
        this.InterpreterService = new CommandLine(this);
        this.CarWorkshop.InitialazeCarWorkshop();
        CreateArrayOfServices();
        CreateArrayOfExtraServices();

    }


    public static void main(String[] args) {
        ManagerServisu sys = new ManagerServisu();
        sys.InitializeSystem();
        sys.InterpreterService.Run();
    }

    /*
    Create new object of mechanic, then send it to Array of mechanics
     */
    public void CreateMechanicToWorkshop(String name, int mechanicID, String specialization){
        System.out.println("Creating Mechanic To Workshop...");
        Mechanic newMechanic = new Mechanic(name,mechanicID,specialization);
        this.CarWorkshop.AddMechanic(newMechanic);
    }

    /*
    Create new object of car, then send it to Array of cars
     */

    public void CreateCarToWorkshop(String brandName, int odometer, int kategoryOfCar, int dateOfMade, String color, String problem ) {
        Car newCar = new Car(brandName, odometer, kategoryOfCar, dateOfMade, color, problem);
        this.CarWorkshop.AddCar(newCar);
    }

    /*
    Adding work to mechanic, where comparing which car is best for him
     */

    public void AddWorkToMechanic(String name, int yearOfMade){
        Mechanic FreeMechanic;
        Car CarToRepair;

        CarToRepair = this.CarWorkshop.FindCarToRepair(name,yearOfMade);
        FreeMechanic = this.CarWorkshop.FindFreeMechanic(CarToRepair);

        System.out.println(FreeMechanic.getName() + " is working on " + CarToRepair.brandName + " Minimum price: |" + HowMuchRepairCost(CarToRepair.problem)+ "|");

        FreeMechanic.setWorking(true);
        RepairCostAdder = Auto.Car.FindProblemPart(12,CarToRepair.problem);
        Car.SolveProblem(RepairCostAdder.getNameOfPart());

    }

    private double HowMuchRepairCost(String name) {
        System.out.println("List Of Services");
        for (RepairService repTmp : ListOfServices) {
            if(repTmp.getName().equals(name)){
                return repTmp.getTimeOfRepair() * repTmp.getCostPerHour();
            }
        }
        return 50;
    }

    /*
    @Overload
     */

    public double HowMuchRepairCost(String name, int PartTimeAdd ) {
        System.out.println("List Of Services");
        for (RepairService repTmp : ListOfServices) {
            if(repTmp.getName().equals(name)){
                return repTmp.getTimeOfRepair() * repTmp.getCostPerHour() + PartTimeAdd;
            }
        }
        return 50;
    }

    private void CreateArrayOfServices(){
        ListOfServices.add(new RepairService("Electric",8,20));
        ListOfServices.add(new RepairService("Engine",9,21));
        ListOfServices.add(new RepairService("Other",10,17));
    }

    private void CreateArrayOfExtraServices(){
       ListOfExtraServices.add(new ExtraService(220,"CarRent"));
       ListOfExtraServices.add(new ExtraService(150,"Tires"));

    }

    public ArrayList<RepairService> getListOfServices() {
        return ListOfServices;
    }

    public void setListOfServices(ArrayList<RepairService> listOfServices) {
        ListOfServices = listOfServices;
    }

    public Manager.CarWorkshop getCarWorkshop() {
        return CarWorkshop;
    }
}
