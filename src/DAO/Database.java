package DAO;

import java.sql.*;

public class Database {
    private static  String connectionUrl =
            "jdbc:sqlserver://LUNA13\\SQLEXPRESS;"
                    + "database=Team:);"
                    + "portNumber=1433;"
                    + "integratedSecurity=true;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true";
    private Database(){

    }

    public static Connection getConnection() throws SQLException{
        Connection connection=null;

        connection = DriverManager.getConnection(connectionUrl);
        System.out.print("Connection established, good job, you did good, im proud of you\n");
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public static void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }

    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public static void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
}
