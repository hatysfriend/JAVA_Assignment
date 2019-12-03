package Utilities;

import Objects.GeneralMember;
import Objects.Member;
import Objects.SpecialMember;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * File: MemberTableModel.java Description: Generate a 'MemberTableModel' used
 * to display 'Member' data in a jTable
 *
 * @author Thomas Or 100613590
 */
public class MemberTableModel extends AbstractTableModel {

    private ArrayList<Member> list = new ArrayList<>();

    private String[] columnNames = {"MemberID", "FirstName", "LastName", "Age", "Contact Number", "Email",
        "Gender", "Address", "Team", "General Membership", "Special Membership", "Cost"};

    /**
     * Description: MemberTableModel Constructor, calls getDataFromDatabase()
     * function.
     */
    public MemberTableModel() {
        getDataFromDatabase(null, null, 1);
    }

    /* "AbstractTableModel" abstract class - Must implement atleast 3 methods
    public int getRowCount()
    public int getColumnCount()
    public Object getValueAt(int row, int col)
     */
    public int getRowCount() {
        return list.size(); //number of records/rows retrieved
    }

    public int getColumnCount() {
        return columnNames.length; //how many columns to display
    }

    //Sets the values of each row and column of the TableModel
    public Object getValueAt(int rowIndex, int columnIndex) {
        Member member = list.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return member.getMemberID();
            case 1:
                return member.getFirstname();
            case 2:
                return member.getLastname();
            case 3:
                return member.getAge();
            case 4:
                return member.getMobile();
            case 5:
                return member.getEmail();
            case 6:
                return member.getGender();
            case 7:
                return member.getAddress();
            case 8:
                return member.getTeam();

            case 9:
                if (member instanceof GeneralMember) {
                    GeneralMember child = (GeneralMember) member;
                    return child.getGMType();
                } else {
                    return null;
                }

            case 10:
                if (member instanceof SpecialMember) {
                    SpecialMember child = (SpecialMember) member;
                    return child.getSMType();
                } else {
                    return null;
                }

            case 11:
                return member.getCost();
        }
        return null;
    }

    //non-abstract method that we will override
    @Override
    public String getColumnName(int col) {

        return columnNames[col];
    }

    //this method will extract one object from the ArrayList at a time
    public Member getRow(int row) {
        Member member = list.get(row);
        return member;
    }

    /**
     * Description: Gets data from the database depending on the selected query
     *
     * @param data1 can input Search Data (string)
     * @param data2 can input Search Data (string)
     * @param selection user can select what data to get from database by
     * choosing and int (1 or 2 or 3): 1 - All Members, 2 - Members based on
     * Firstname & Lastname, 3 - Members based on Team
     * @return ArrayList<Member> list (returns list of Member objects)
     */
    public ArrayList<Member> getDataFromDatabase(String data1, String data2, int selection) {

        Connection con = null;
        Statement stmt = null;
        ResultSet r = null;

        GeneralMember GMmemberObject = null;
        SpecialMember SMmemberObject = null;

        String sql = "";

        switch (selection) {
            case 1://Select all Members
                sql = "SELECT * FROM tblmembers";
                break;

            case 2://Select Members WHERE member's firstname = data1 or lastname = data2
                sql = "SELECT * FROM tblmembers WHERE firstname LIKE '%" + data1 + "%' OR lastname LIKE '%" + data2 + "%' ORDER BY lastname";
                break;

            case 3://Select members WHERE member's Team = data1
                sql = "SELECT * FROM tblmembers WHERE team LIKE '%" + data1 + "%'";
                break;

            default:
                sql = "SELECT * FROM tblmembers";
                break;
        }

        try {
            con = ConnectionDetails.getConnection();
            stmt = con.createStatement();

            //execute sql query
            System.out.println(sql);
            r = stmt.executeQuery(sql);

            //clear out the arrayList
            list.clear();

            //loop through the records and add them to the ArrayList
            while (r.next()) {
                if (r.getString("GMType").equals("Home Games Package") || r.getString("GMType").equals("Home & Away Package") || r.getString("GMType").equals("AusKick")) {
                    GMmemberObject = new GeneralMember(r.getInt("memberID"), r.getString("firstname"), r.getString("lastname"),
                            r.getInt("age"), r.getString("phone"), r.getString("email"), r.getString("gender"),
                            r.getString("address"), r.getDouble("cost"), r.getString("team"), r.getString("GMType"));
                    list.add(GMmemberObject);
                } else {
                    SMmemberObject = new SpecialMember(r.getInt("memberID"), r.getString("firstname"), r.getString("lastname"),
                            r.getInt("age"), r.getString("phone"), r.getString("email"), r.getString("gender"),
                            r.getString("address"), r.getDouble("cost"), r.getString("team"), r.getString("SMType"));
                    list.add(SMmemberObject);
                }

            }

            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

}
