package Objects;

/**File: GeneralMember.java
 *Description: General Member class, child class of 'Member'
 * @author Thomas Or 100613590
 */
public class GeneralMember extends Member {

    private String GMType;

    /**
     * Description: GeneralMember Constructor
     */
    public GeneralMember() {
    }

    /**
     *Description: GeneralMember Constructor
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
     * @param GMType
     */
    public GeneralMember(int memberID, String firstname, String lastname, int age, String mobile, String email, String gender, String address, double cost, String team, String GMType) {
        super(memberID, firstname, lastname, age, mobile, email, gender, address, cost, team);
        this.GMType = GMType;
    }

    /**
     * Description: getter function of member's GMType property
     * @return GMType
     */
    public String getGMType() {
        return GMType;
    }

    /**
     * Description: setter function of member's GMType property
     * @param GMType
     */
    public void setGMType(String GMType) {
        this.GMType = GMType;
    }

    /**Abstract Function: calcCost
     *Description: Calculates the member's membership cost depending on the selected membership package.
     * @param selection
     * @return cost
     */
    @Override
    public double calcCost(String selection) {

        switch (selection) {
            case "Home Games Package":
                return cost = 100.00;

            case "Home & Away Package":
                return cost = 200.00;

            case "AusKick":
                return cost = 50.00;
            default:
                return cost;
        }

    }

}
