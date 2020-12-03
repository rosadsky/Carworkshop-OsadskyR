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



    //default Parts

    private static void DefultParts(){
        ListOfParts.add(new Part("light","Electric",1));
        ListOfParts.add(new Part("part1","Electric",2));
        ListOfParts.add(new Part("part2","Electric",3));
        ListOfParts.add(new Part("part3","Electric",4));
        ListOfParts.add(new Part("part4","Engine",5));
        ListOfParts.add(new Part("part5","Engine",6));
        ListOfParts.add(new Part("part6","Engine",7));
        ListOfParts.add(new Part("part7","Engine",8));
        ListOfParts.add(new Part("part8","Other",9));
        ListOfParts.add(new Part("part9","Other",10));
        ListOfParts.add(new Part("part10","Other",11));
        ListOfParts.add(new Part("part11","Other",12));
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


    public void SolveProblem(String nameOfPart){
        System.out.println("Solving problem...");



    }

}


