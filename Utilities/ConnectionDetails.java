package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**File: ConnectionDetails.java
 * Description: Provides the Connection Details to connect to the 'members' database
 * @author Thomas Or 100613590
 */
public class ConnectionDetails {

    private static final String userName = "root"; 
    private static final String passWord = "mavis";
    private static final String driver = "com.mysql.jdbc.Driver";

    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String db = "members";

    public static String getUserName() {
        return userName;
    }

    public static String getPassWord() {
        return passWord;
    }

    public static String getDriver() {
        return driver;
    }

    public static String getUrl() {
        return url + db + "?autoReconnect=true";
    }

    /**
     *Description: Generates a Connection object 'con' to connect to the database
     * @return con 
     */
    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName(ConnectionDetails.getDriver());
            con = DriverManager.getConnection(url + db + "?autoReconnect=true", userName, passWord);
        } catch (SQLException SQLe) {
            SQLe.printStackTrace();
        } catch (ClassNotFoundException Ce) {
            Ce.printStackTrace();
        }
        return con;
    }

}
