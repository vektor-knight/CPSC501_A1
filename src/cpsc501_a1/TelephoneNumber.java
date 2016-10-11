package cpsc501_a1;

/**
 *
 * @author Sartaj Hundal
 */
public class TelephoneNumber {
    
    // These fields were moved from the class "Person"
    // using the "move field" refactoring.
    private String officeAreaCode;
    private String officeNumber;
    
    // Before "Introduce Foreign Method" refactoring
    // can be applied, need mutator and accessor
    // corresponding to above attributes in this class.
    
    public String getAreaCode() {
        return officeAreaCode;
    }
    
    public void setAreaCode(String arg) {
        officeAreaCode = arg;
    }

    public String getNumber() {
        return officeNumber;
    }
    
    public void setNumber(String arg) {
        officeNumber = arg;
    }
}