package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connector {
    static Connection connection;
    Statement statement;

    public connector(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMS", "root", "AyushVish");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}