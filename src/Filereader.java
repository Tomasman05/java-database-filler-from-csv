import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    public ArrayList<Building> readFile(String path) throws FileNotFoundException {
        ArrayList<Building> bdList= new ArrayList<>();
        File file = new File(path);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(",");
            Building bd = new Building();
            bd.id=Integer.parseInt(lineArray[0]);
            bd.city=lineArray[1];
            bd.address=lineArray[2];
            bd.usage=lineArray[3];
            bd.size=Double.parseDouble(lineArray[4]);
            bd.price=Double.parseDouble(lineArray[5]);
            bdList.add(bd);
        }
        sc.close();
        return bdList;
    }

}