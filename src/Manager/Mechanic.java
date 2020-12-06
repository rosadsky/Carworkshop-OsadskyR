package Manager;

import java.util.ArrayList;

public class Mechanic {
    private final String name;
    private final int MechanicID;
    private final String Specialization;
    private boolean isWorking = false;


    public Mechanic(String name, int mechanicID, String specialization) {
        this.name = name;
        this.MechanicID = mechanicID;
        this.Specialization = specialization;

        System.out.println("Mechanic: "+ this.name + " ID: " + this.MechanicID + " Specialization: " + this.Specialization);

    }


    public String getName() {
        return name;
    }

    public int getMechanicID() {
        return MechanicID;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
