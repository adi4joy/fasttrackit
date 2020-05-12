package ro.fasttrackit.curs23;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://sql7.freesqldatabase.com/sql7339378", "sql7339378", "wlckZItrfT")) {
            final Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from PERSON where name='Maria'");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" : ");
                System.out.println(resultSet.getString("name"));
            }
        }
    }
}
