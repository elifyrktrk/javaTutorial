import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\n";
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(dbUrl, userName, password)) {
            System.out.println("Bağlantı oluştu");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
