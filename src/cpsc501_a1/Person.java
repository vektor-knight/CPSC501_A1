package cpsc501_a1;

/**
 *
 * @author Sartaj Hundal
 */
class Person {
  private String name;
  // Now, we must introduce a foreign method from
  // the newly created TelephoneNumber class.
  // Then, the attributes of Person that are used
  // in the getters and setters here will be accessing
  // data from the TelephoneNumber class instead.
  private final TelephoneNumber officePhone = new TelephoneNumber();
  
  public String getName() {
    return name;
  }
  public String getTelephoneNumber() {
   return officePhone.getAreaCode();
  }
  public String getOfficeAreaCode() {
   // Instead of returning data local to Person's scope,
   // we will now query TelephoneNumber instead.
   // return ("(" + officeAreaCode + ") " + officeNumber);
   return officePhone.getAreaCode();
  }
  public void setOfficeAreaCode(String arg) {
    officePhone.setAreaCode(arg);
  }
  public String getOfficeNumber() {
    return officePhone.getAreaCode();
  }
  public void setOfficeNumber(String arg) {
    officePhone.setNumber(arg);
  }
}