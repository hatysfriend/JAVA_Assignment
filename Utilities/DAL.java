package Utilities;

import Objects.GeneralMember;
import Objects.Member;
import Objects.SpecialMember;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**File: DAL.java
 * Description: Data Access Layer, contains SQL functions that connect to the database. 
 * @author Thomas Or 100613590
 */
public class DAL {

    
    
    
    /**
     * Description: Create member database tables, creates Table 'tblteams' and creates Table 'tblmembers' 
     */
    public static void createTables() {
        //ADD MEMBER TO DATABASE
        Connection con = null;
        Statement stmt = null;

        try {
            con = ConnectionDetails.getConnection();
            stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS tblteams(team VARCHAR(50) not NULL PRIMARY KEY);";
            //Execute the sql query
            stmt.executeUpdate(sql);

            sql = "INSERT IGNORE INTO tblteams(team)"
                    + "VALUES"
                    + "('North Melbourne Kangaroos'),"
                    + "('Melbourne Demons'),"
                    + "('Richmond Tigers'),"
                    + "('Hawthorn Hawks'),"
                    + "('St Kilda Saints'),"
                    + "('Fremantle Dockers'),"
                    + "('West Coast Eagles'),"
                    + "('Adelaide Crows'),"
                    + "('Port Adelaide Power'),"
                    + "('Brisbane Lions'),"
                    + "('GWS Giants'),"
                    + "('Sydeny Swans'),"
                    + "('Western Bulldogs'),"
                    + "('Geelong Cats'),"
                    + "('Collingwood Magpies'),"
                    + "('Calton Blues'),"
                    + "('Essendon Bombers')";

            //Execute the sql query
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE IF NOT EXISTS tblmembers("
                    + "memberID int not NULL PRIMARY KEY AUTO_INCREMENT, "
                    + "firstname VARCHAR(50), "
                    + "lastname VARCHAR(50), "
                    + "age int, "
                    + "phone VARCHAR(50), "
                    + "email VARCHAR(50), "
                    + "gender VARCHAR(6), "
                    + "address VARCHAR(50), "
                    + "team VARCHAR(50), "
                    + "GMType VARCHAR(50), "
                    + "SMType VARCHAR(50), "
                    + "cost DOUBLE,"
                    + "FOREIGN KEY (team) references tblteams (team)"
                    + ")";

            //Execute the sql query
            stmt.executeUpdate(sql);

            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Description: Restores the database from a binary File. It first, drops and recreates the db tables, 
     * then reads the file and retrieves an ArrayList of Members, then INSERTS each member in the list into tblmembers.
     */
    public static void restoreFromFile() {
        Connection con = null;
        Statement stmt = null;

        try {
            con = ConnectionDetails.getConnection();
            stmt = con.createStatement();
            
            //DROP db Tables
            String sql = "DROP TABLE tblmembers;";
            stmt.executeUpdate(sql);
            sql = "DROP TABLE tblteams;";
            stmt.executeUpdate(sql);
            
            //Create db Tables
            createTables();
            
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ArrayList<Member> listFromFile = new ArrayList<>();
        //READ FILE
        try {
            listFromFile = ReadWrite.readData();
            JOptionPane.showMessageDialog(null, "Existing Member Records have been retrieved");
        } catch (FileNotFoundException fnfex) {
            System.err.println("FILE NOT FOUND");
        } catch (ClassNotFoundException cnfEx) {
            System.err.println("Problem with the class");
        } catch (NotSerializableException nsE) {
            System.err.println("class not serialised");
        } catch (IOException ioEx) {
            System.err.println("Issue(s) with reading object from file");
        }

        //For each member from the list, insert into tblmembers
        for (Member m : listFromFile) {
            //For the child object properties, retrieve the property from the 'Member object' by casting the object to
            //it's respective class type and 'get' the required property. The other non-related property will be set to null.
            String GMType = null;
            String SMType = null;
            if (m instanceof GeneralMember) {
                GeneralMember GM = (GeneralMember) m;
                GMType = GM.getGMType();
            }
            if (m instanceof SpecialMember) {
                SpecialMember SM = (SpecialMember) m;
                SMType = SM.getSMType();
            }
            insertMember(m.getFirstname(),
                    m.getLastname(),
                    Integer.toString(m.getAge()),
                    m.getMobile(), m.getEmail(), m.getGender(),
                    m.getAddress(), m.getTeam(), GMType, SMType, Double.toString(m.getCost()));
        }
    }

    /**
     * Description: Inserts a member record into the database
     * @param first
     * @param last
     * @param age
     * @param phone
     * @param email
     * @param gender
     * @param address
     * @param team
     * @param GMType
     * @param SMType
     * @param cost
     */
    public static void insertMember(String first, String last, String age, String phone, String email, String gender, String address, String team,
            String GMType, String SMType, String cost) {

        //ADD MEMBER TO DATABASE
        Connection con = null;
        Statement stmt = null;

        try {
            con = ConnectionDetails.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO tblmembers (firstname, lastname, age, phone, email, gender, address, team, GMType, SMType, cost)"
                    + "values('" + first + "','" + last + "','" + age + "','" + phone + "','" + email + "','" + gender + "','"
                    + address + "','" + team + "','" + GMType + "','" + SMType + "','" + cost + "')";

            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Description: Updates a member record depending on selected MemberID
     * @param first
     * @param last
     * @param age
     * @param mobile
     * @param email
     * @param address
     * @param id
     */
    public static void updateMember(String first, String last, String age, String mobile, String email, String address, String id) {
        Connection con = null;
        Statement stmt = null;
        String sql = "UPDATE tblmembers SET "
                + "firstname='" + first + "',"
                + "lastname='" + last + "',"
                + "age='" + age + "',"
                + "phone='" + mobile + "',"
                + "email='" + email + "',"
                + "address='" + address + "' "
                + "WHERE memberID = '" + id + "'";
        System.out.print(sql);
        try {
            con = ConnectionDetails.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Member Details have been updated");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Description: Deletes a Member record depending on memberID
     * @param member 
     */
    public static void deleteMember(Member member) {
        Connection con = null;
        Statement stmt = null;
        try {
            con = ConnectionDetails.getConnection();
            stmt = con.createStatement();
            String sql = "DELETE FROM tblmembers WHERE memberID=" + member.getMemberID();
            System.out.println(sql);

            stmt.executeUpdate(sql);

            stmt.close();
            con.close();
        } catch (SQLException SQLe) {
            SQLe.printStackTrace();
        }
    }
    

}
