import Models.UserInterface;


import java.sql.*;

public class Main {
    public static Connection cn;

    public static void main(String[] args) throws SQLException {
        UserInterface UI = new UserInterface();
        UI.setVisible(true);


    }
}
