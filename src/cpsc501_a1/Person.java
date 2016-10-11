package cpsc501_a1;

/**
 *
 * @author Sartaj Hundal
 */
class Person {
  private String name;
  // To be refactored into "TelephoneNumber"
  // officeAreaCode and officeNumber are attributes
  // of a TelephoneNumber, not a person.
  private String officeAreaCode;
  private String officeNumber;

  public String getName() {
    return name;
  }
  public String getTelephoneNumber() {
    return ("(" + officeAreaCode + ") " + officeNumber);
  }
  public String getOfficeAreaCode() {
    return officeAreaCode;
  }
  public void setOfficeAreaCode(String arg) {
    officeAreaCode = arg;
  }
  public String getOfficeNumber() {
    return officeNumber;
  }
  public void setOfficeNumber(String arg) {
    officeNumber = arg;
  }
}