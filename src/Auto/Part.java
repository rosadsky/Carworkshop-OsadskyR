package Auto;

import Manager.CarWorkshop;

import java.util.ArrayList;

public class Part {
    private String NameOfPart;
    private String Cetegory;
    private int PartID;

    public Part(){

    };
    public Part(String name,String category,int partid){
        this.NameOfPart = name;
        this.Cetegory = category;
        this.PartID = partid;

        System.out.println("Just created part of car...");

    };




    public int getPartID() {
        return PartID;
    }

    public String getNameOfPart() {
        return NameOfPart;
    }

    public String getCetegory() {
        return Cetegory;
    }
}





