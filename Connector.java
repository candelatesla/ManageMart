import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.Statement;

import javax.swing.JOptionPane;

public class Connector {

    public static void main(String[] args) throws Exception {

        try {

            String url = "jdbc:mysql://localhost:3306/";

            String databaseName = "shopmanagement";

            String userName = "root";

            String password = "Vadapav@8";

            Connection connection = DriverManager.getConnection(url, userName, password);

            Statement statement = connection.createStatement();

            statement.close();

            JOptionPane.showMessageDialog(null, " WORKS!! ",
                    "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}