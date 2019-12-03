package Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/** File: Validation.java
 * Description: Validates user input, when users are adding a new member and updating a member
 * @author Thomas Or 100613590
 */
public class Validation {

    //Regex pattern for NON-digits and special characters
    public static final Pattern VALID_NAME_REGEX = Pattern.compile("^[0-9<>.*;\",#%&()=+!\\s-]+$");
    /**
     *Description: validates if name input is less than 2 characters and if the name contains any digits or special characters
     * @param input
     * @return valid (returns true if string passes the two tests)
     */
    public static boolean validateName(String input) {
        boolean valid = true;
        Matcher matcher = VALID_NAME_REGEX.matcher(input);
        //string length is 2 characters or below 
        if (input.length() < 2) {
            JOptionPane.showMessageDialog(null, "Name must be atleast 2 characters", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        } //Checks if user has entered non-alphbetical value i.e. numbers & special characters   
        // "\W" is regular expression for non-aplhabet characters    input.matches(".*\\W.*")
        else if (matcher.find() == true) {
            JOptionPane.showMessageDialog(null, "Name cannot contain Numbers/Special Characters", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

    /**
     *Description: Checks if age input is empty or contains non-digit characters
     * @param input
     * @return valid (returns true if string passes the two tests)
     */
    public static boolean validateAge(String input) {
        boolean valid = true;
        
        //Checks if user as entered an empty value
        if (input.length() < 1) {
            JOptionPane.showMessageDialog(null, "Must enter an Age value", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        //Checks if input contains NON-digit values
        else if (input.matches(".*\\D.*")) {
            JOptionPane.showMessageDialog(null, "Age can only contain numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

    /**
     *Description: Checks if Contact No. input is empty or contains non-digit characters
     * @param input
     * @return valid (returns true if string passes the two tests)
     */
    public static boolean validateContactNumber(String input) {
        boolean valid = true;

        //Checks if user as entered an empty value 
        if (input.length() < 1) {
            JOptionPane.showMessageDialog(null, "Must Enter a Contact Number", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        //Checks if input contains NON-digit values
        else if (input.matches(".*\\D.*")) {
            JOptionPane.showMessageDialog(null, "Contact Number only contain digits", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

    //Regex patter for Valid email address
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Description: Checks if email input is empty and if input follows valid email address pattern
     * @param input
     * @return valid
     */
    public static boolean validateEmail(String input) {
        boolean valid = true;
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(input);
        //Check if input is empty
        if (input.length() < 1) {
            JOptionPane.showMessageDialog(null, "Must Enter an Email", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        } 
        //Check if email input follows Email Regex Pattern
            else if (matcher.find() == false) {
            JOptionPane.showMessageDialog(null, "Must Enter a valid Email address", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

    /**
     * Description: Checks if address input is empty
     * @param input
     * @return valid
     */
    public static boolean validateAddress(String input) {
        boolean valid = true;
        //Checks if input is empty 
        if (input.length() < 1) {
            JOptionPane.showMessageDialog(null, "Must Enter an Address", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

    /**
     * Description: Checks if any of the Gender Radio buttons have been selected
     * @param radMale
     * @param radFemale
     * @return valid
     */
    public static boolean validateGender(Boolean radMale, Boolean radFemale) {
        boolean valid = true;
        
        //If radio button group has been left unselected, provide error message
        if ((radMale == false) && (radFemale == false)) {
            JOptionPane.showMessageDialog(null, "Must Select a Gender", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

}
