import java.util.HashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}
