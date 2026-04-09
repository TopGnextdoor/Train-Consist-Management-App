import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after adding:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Passenger Bogies after removal:");
        System.out.println(passengerBogies);

        System.out.println("Does Sleeper exist? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final Passenger Bogie List:");
        System.out.println(passengerBogies);
    }
}
