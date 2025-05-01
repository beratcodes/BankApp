
package database;

// Super Sınıf

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String VERITABANI_ISMI = "banka";
    private final String USER = "root";
    private final String PASSWORD  ="";
    
    protected Connection connection = null;
    protected Statement statement = null; // Sorgular statement ile çağırılacak.

    public DbConnection() 
    {
        //jdbc:mysql://localhost:3306/bank_app
        String url ="jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.VERITABANI_ISMI + "?serverTimezone=UTC";
        
        try {
            this.connection = (Connection) DriverManager.getConnection(url, this.USER, this.PASSWORD);
            //System.out.println("Baglanti Basarili.");
            
        } catch (SQLException ex) {
            //System.out.println("Baglanti Basarisiz.");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

    }
    catch(ClassNotFoundException ex)
    {
        Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
}
