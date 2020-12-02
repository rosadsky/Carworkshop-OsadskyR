package Manager;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Executable;

public class CommandLine {
    public ManagerServisu ManagerServisu;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public CommandLine(ManagerServisu managerServisu) {

        this.ManagerServisu = managerServisu;
    }

    public void Run(){
        while (true){
            try {
                System.out.println("Please insert command");
                String command = reader.readLine();
                ExecuteCommand(command);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void ExecuteCommand(String command){

        if(command.equals("mechanicadd")){
            String mechanicname = "";
            String mechanicID = "";
            String specialization = "";

            System.out.println("Please Insert name of Mechanic");
            try {
                mechanicname = reader.readLine();
                System.out.println("Insert ID");
                mechanicID = reader.readLine();
                System.out.println("Please Insert specialization");
                specialization = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            ManagerServisu.CreateMechanicToWorkshop(mechanicname,Integer.parseInt(mechanicID),specialization);

        }


        if(command.equals("listmechanic")){
            ManagerServisu.getCarWorkshop().ShowAllMechanics();
        }


        if(command.equals("caradd")){
            String brandName = " ";
            String odometer = " ";
            String kategoryOfCar = " ";
            String dateOfYear = " ";
            String color = " ";
            String problem = " ";

            System.out.println("Brand Name of car ");
            try {
                brandName = reader.readLine();
                System.out.println("Number of kilometers");
                odometer = reader.readLine();
                System.out.println("Kategory of car 1-3");
                kategoryOfCar = reader.readLine();
                System.out.println("Interst Year of made");
                dateOfYear = reader.readLine();
                System.out.println("Color");
                color = reader.readLine();
                System.out.println("Your problem electric - engine - other");
                problem = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            ManagerServisu.CreateCarToWorkshop(brandName,Integer.parseInt(odometer),Integer.parseInt(kategoryOfCar),Integer.parseInt(dateOfYear),color,problem);
        }

        if(command.equals("listcar")){
            ManagerServisu.getCarWorkshop().ShowAllCars();
        }

        if(command.equals("workadd")){
            String carName = " ";
            String carYear = " ";

            System.out.println("Car you want to repair");
            try {
                carName = reader.readLine();
                System.out.println("Year of made: ");
                carYear = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }


            ManagerServisu.AddWorkToMechanic(carName,Integer.parseInt(carYear));
        }


    }

}
