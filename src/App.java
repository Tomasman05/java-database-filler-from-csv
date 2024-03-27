import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Nincs paraméter");
            using();
            System.exit(101);
        } else {
            System.out.println(args[0] + " olvasása...");
            ArrayList<Building> bdList = new Filereader().readFile(args[0]);
            new StoreData().saveData(bdList);
        }
    }

    public static void using() {
        System.out.println("Használat:");
        System.out.println("\tjava App <paraméter>");
    }
}
