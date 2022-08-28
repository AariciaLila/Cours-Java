/*==============================================================================================*/
/* 								Implémentation du DataConnect								    */
/*==============================================================================================*/

package esgi.javafx.filrouge.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
	// Attributs de connexion
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/filrougeB3";
    private static String login = "root";
    private static String password = "";
    
    private DataConnect() {
	
    }
    // Méthode de connexion
    public static Connection getConnection() {
	try {
	    Connection connection = DriverManager.getConnection(url, login, password);
	    Class.forName(driver);
	    return connection;
	} catch (SQLException | ClassNotFoundException sqle) {
	    sqle.printStackTrace();
	    return null;
	}
    }

}
