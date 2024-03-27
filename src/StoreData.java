import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class StoreData {
    public void saveData(ArrayList<Building> bdList) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/argus";
        String user = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = """
                insert into buildings
                (id,city,address,busage,size,price)
                values
                (?,?,?,?,?,?)
                """;
        for (Building building : bdList) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,building.id);
            ps.setString(2, building.city);
            ps.setString(3, building.address);
            ps.setString(4, building.usage);
            ps.setDouble(5, building.size);
            ps.setDouble(6, building.price);
            ps.executeQuery();
        }
        conn.close();
    }
}
