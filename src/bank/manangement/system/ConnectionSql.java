package bank.manangement.system;

import java.sql.*;

public class ConnectionSql {
    Connection connection;
    Statement statement;

    public ConnectionSql() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banksystem", "root", "CArtiom100_500123");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
