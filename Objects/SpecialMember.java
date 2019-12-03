package Objects;

/**
 *
 * @author CHUWI
 */
public class SpecialMember extends Member {

    private String SMType;

    /**
     *Description: SpecialMember Constructor
     */
    public SpecialMember() {
    }

    /**
     * Description: SpecialMember Constructor
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
     * @param SMType
     */
    public SpecialMember(int memberID, String firstname, String lastname, int age, String mobile, String email, String gender, String address, double cost, String team, String SMType) {
        super(memberID, firstname, lastname, age, mobile, email, gender, address, cost, team);
        this.SMType = SMType;
    }

    /**
     * Description: getter function of member's SMType property
     * @return SMType
     */
    public String getSMType() {
        return SMType;
    }

    /**
     * Description: setter function of member's SMType property
     * @param SMType
     */
    public void setSMType(String SMType) {
        this.SMType = SMType;
    }

    /**Abstract Function: calcCost
     *Description: Calculates the member's membership cost depending on the selected membership package.
     * @param selection
     * @return cost
     */
    @Override
    public double calcCost(String selection) {

        switch (selection) {
            case "Reserved Seating":
                return cost = 150.00;

            case "Premium Membership":
                return cost = 300.00;

            case "Supporter Membership":
                return cost = 75.00;
            default:
                return cost;
        }

    }

}
