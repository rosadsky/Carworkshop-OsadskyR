package Manager;

public class RepairService{

    private final String name;
    private final int TimeOfRepair;
    private final int CostPerHour;



    public RepairService(String name, int timeOfRepair, int costPerHour) {
        this.name = name;
        TimeOfRepair = timeOfRepair;
        CostPerHour = costPerHour;

        System.out.println("("+this.name+") " + "time: ["+ TimeOfRepair + "] price per hour: [" + costPerHour +"]");
    }

    public String getName() {
        return name;
    }

    public int getTimeOfRepair() {
        return TimeOfRepair;
    }

    public int getCostPerHour() {
        return CostPerHour;
    }
}
