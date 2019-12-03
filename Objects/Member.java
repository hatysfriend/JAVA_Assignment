package Objects;

import java.io.Serializable;

/**File: Member.java
 *Description: Member Class, contains the properties of a Member object, is an Abstract Class
 * @author Thomas Or 100613590
 */
abstract public class Member implements Serializable {

    protected int memberID;
    protected String firstname;
    protected String lastname;
    protected int age;
    protected String mobile;
    protected String email;
    protected String gender;
    protected String address;
    protected double cost;
    protected String team;

    /**
     * Description: Member Constructor
     */
    public Member() {
    }

    /**
     * Description: Member Constructor
     * @param memberID
     * @param firstname
     * @param lastname
     * @param age
     * @param mobile
     * @param email
     * @param gender
     * @param address
     * @param cost
     * @param team
     */
    public Member(int memberID, String firstname, String lastname, int age, String mobile, String email, String gender, String address, double cost, String team) {
        this.memberID = memberID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.cost = cost;
        this.team = team;
    }

    /**Abstract Function: calcCost
     * Description: Calculates the member's membership cost depending on the selected membership package.
     * @param selection
     * @return
     */
    abstract public double calcCost(String selection);

    /**
     * Description: Getter function of MemberID
     * @return memberID
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * Description: Setter function of MemberID
     * @param memberID
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    /**
     * Description: Getter function of Firstname
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Description: Setter function of Firstname
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Description: Getter function of lastname
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Description: Setter function of lastname
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Description: Getter function of age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Description: Setter function of age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Description: Getter function of mobile
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Description: Setter function of mobile
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Description: Getter function of email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Description: Setter function of email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Description: Getter function of gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Description: Setter function of gender
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Description: Getter function of address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Description: Setter function of address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Description: Getter function of cost
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Description: Setter function of cost
     * @param cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Description: Getter function of team
     * @return team
     */
    public String getTeam() {
        return team;
    }

    /**
     * Description: Setter function of team
     * @param team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Member{" + "memberID=" + memberID + ", firstname=" + firstname + ", cost=" + cost + ", team=" + team + '}';
    }

}
