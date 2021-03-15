import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    MySQLAdsDao (Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Ad>all() {
        ArrayList<Ad> ads = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                Ad ad = new Ad(rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
            return ads;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ads;
    };

    public Long insert(Ad ad) {
        long id = 0;
//        String query = "INSERT INTO ads (id, user_id, title, description) VALUES(ad.getId(), ad.getUserId(), ad.getTitle(), ad.getDescription())";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                System.out.println(rs.getLong(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();;
        }
        return id;
    };

}
