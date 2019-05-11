package pruebajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pruebajdbc {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/prueba";
        String user = "postgres";
        String password = "12345678";

        int id = 3;
        String name = "Yani";
        String food="miel";
        String Cofirmed="1";
        String signup_date="1";
        String sql = "INSERT INTO prueba.potluck("
                + " id,"
                + " name,"
                + " food,"
                + " confirmed,"
                + " signup_date"
                + ") "
                + " VALUES("
                + " ?,"
                + " ?, "
                + " ?,"
                + " ?,"
                + " now()"
                + " )";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, food);
            pst.setString(4, Cofirmed);            
            pst.executeUpdate();
            
            int resultado = pst.executeUpdate();
 

        } catch  (SQLException ex) {
            System.out.println(ex);

            //Logger lgr = Logger.getLogger(JavaPostgreSqlPrepared.class.getName());
           // lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}