//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://LUNA13\\SQLEXPRESS;"
                        + "database=Team:);"
                        + "portNumber=1433;"
                        + "integratedSecurity=true;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true";
        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.print("Connection established, good job, you did good, im proud of you\n");
        }
        catch (SQLException e) {
            System.out.print("Screw you and your connection, KYS\n");
            e.printStackTrace();
        }
    }
}