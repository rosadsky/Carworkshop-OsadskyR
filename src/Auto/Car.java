package Auto;

import java.util.ArrayList;
import WarehouseOfParts.WarehouseOfParts;

public class Car {
    public String brandName;
    public int odometer;
    public int kategoryOfCar;
    public int dateOfMade;
    public String color;
    public String problem;
    private static ArrayList<Part> ListOfParts;
    private WarehouseOfParts WarehouseOfParts;


    public Car(String brandName, int odometer, int kategoryOfCar, int dateOfMade, String color, String problem) {
        this.brandName = brandName;
        this.odometer = odometer;
        this.kategoryOfCar = kategoryOfCar;
        this.dateOfMade = dateOfMade;
        this.color = color;
        this.problem = problem;

        System.out.println("Car: " + this.brandName +" came to the garage... Problem: " + this.problem);

    }

    //Initialize Car parts

    public static void InitialazeCarPart(){
        ListOfParts = new ArrayList<Part>();
        DefultParts();
    }




    /*
    *   WarehouseOfPartsArray.add(new Electronic("baterry","Electric",13,2,12,2,true,true));
        WarehouseOfPartsArray.add(new Electronic("light","Electric",14,2,5,2,true,true));
        WarehouseOfPartsArray.add(new Electronic("radio","Electric",15,0,7,2,true,false));
        WarehouseOfPartsArray.add(new Electronic("stereo","Electric",15,0,7,2,true,false));
        WarehouseOfPartsArray.add(new Engine("starter","Engine",16,1,8,2,true,1));
        WarehouseOfPartsArray.add(new Engine("turbo","Engine",17,1,9,1.5,true,1));
        WarehouseOfPartsArray.add(new Engine("piston","Engine",18,1,9,1,true,1));
        WarehouseOfPartsArray.add(new Engine("pump","Engine",18,1,9,1,true,1));
        WarehouseOfPartsArray.add(new Other("glass","Other",19,1,9,1,true,12));
        WarehouseOfPartsArray.add(new Other("wipers","Other",20,2,9,1,true,13));
        WarehouseOfPartsArray.add(new Other("seat","Other",21,3,9,1,true,14));
        WarehouseOfPartsArray.add(new Other("steeringwheel","Other",21,3,9,1,true,14));
    *
    *
    * */
    //default Parts
    public static void DefultParts(){
        ListOfParts.add(new Part("baterry","Electric",1));
        ListOfParts.add(new Part("light","Electric",2));
        ListOfParts.add(new Part("radio","Electric",3));
        ListOfParts.add(new Part("stereo","Electric",4));
        ListOfParts.add(new Part("starter","Engine",5));
        ListOfParts.add(new Part("turbo","Engine",6));
        ListOfParts.add(new Part("piston","Engine",7));
        ListOfParts.add(new Part("pump","Engine",8));
        ListOfParts.add(new Part("glass","Other",9));
        ListOfParts.add(new Part("wipers","Other",10));
        ListOfParts.add(new Part("seat","Other",11));
        ListOfParts.add(new Part("steeringwheel","Other",12));
    }


    /* ---- Find problem by Category --------
    *
    * Work just by Math.Random
    *
    *  */


    public static Part FindProblemPart(int maximum, String problem){
        int randomNum;
        int counter = 0;
        String Problem = problem;
        System.out.println("Finding problem part...");

        for (Part partTmp : ListOfParts) {
            counter++;
            if(partTmp.getCetegory().equals(Problem) ){
                randomNum = counter + (int)(Math.random() * (counter+4));
                for (Part partTmp2 : ListOfParts) {
                    if (partTmp2.getPartID() == randomNum) {
                        System.out.println("Mechanic found a problem in " + partTmp2.getNameOfPart());
                        return partTmp2;
                    }
                }
            }
        }
        return null;
    };

    /*--------- POLYMORFIZMUS ---------*/

    public boolean CarGetReadyForLeave(boolean working, String problem, int partTimeAdd){
        if (!working && problem.equals("None")&& partTimeAdd>0 ){
            return true;
        }
        return false;
    }




}


