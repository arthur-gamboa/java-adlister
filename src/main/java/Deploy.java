import java.sql.*;
//import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;

public class Deploy {

    public static void main(String[] args) {

        Config config = new Config();
        try {
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");

            while (rs.next()) {
                System.out.println(rs.getString("title"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
