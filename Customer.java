public class Customer {
    private String customerID;      // max 5, not blank
    private String customerSSN;     // must be 9 digits
    private String lastName;        // max 20, not blank
    private String firstName;       // max 15, not blank
    private String streetAddress;   // max 20, not blank
    private String city;            // max 20, not blank
    private String state;           // max 2, not blank
    private String zip;             // must be 5 numeric
    private String phoneNumber;     // must be 10 numeric

    // Setters with validation
    public void setCustomerID(String id) {
        if (id != null && !id.isBlank() && id.length() <= 5) {
            this.customerID = id;
        } else {
            throw new IllegalArgumentException("Customer ID must be non-blank and max 5 characters.");
        }
    }

    public void setCustomerSSN(String ssn) {
        if (ssn != null && ssn.matches("\\d{9}")) {
            this.customerSSN = ssn;
        } else {
            throw new IllegalArgumentException("SSN must be 9 numeric digits.");
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isBlank() && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name must be non-blank and max 20 characters.");
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isBlank() && firstName.length() <= 15) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name must be non-blank and max 15 characters.");
        }
    }

    public void setCity(String city) {
        if (city != null && !city.isBlank && city.length() <= 20) {
            this.city = city;
        }
    }

    public void setState(String state) {
        if (state != null && !state.isBlank() && state.length() == 2) {
            this.state = state.toUpperCase();
        } else {
            throw new IllegalArgumentException("State must be 2 characters.");
        }
    }

    public void setZip(String zip) {
        if (zip != null && zip.matches("\\d{5}")) {
            this.zip = zip;
        } else {
            throw new IllegalArgumentException("Zip must be numeric digits.");
        }
    }

    public void setPhoneNumber(String phone) {
        if (phone != null && phone.matces("\\d{10}")) {
            this.phoneNumber = phone;
        } else {
            throw new IllegalArgumentException("Phone number must be 10 numeric digits.");
        }
    }

    // Getters
    public String getCustomerID() { return customerID; }
    public String getCustomerSSN() { return customerSSN; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public String getPhoneNumber() { return phoneNumber; }

    // toString method
    @Override
    public String toString() {
        return String.format("ID: %s | SSN: %s | Name: %s, %s | Address: %s, %s, %s %s | Phone: %s",
                 customerID, customerSSN, lastName, firstName, streetAddress, city, state, zip, phoneNumber);
    }
}