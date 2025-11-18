public abstract class Account {
    private String accountNumber;       //  max 5 chars
    private String accountType;         // CHK or SAV only
    private double serviceFee;          // 0.00 to 10.00
    private double interestRate;        // 0.0 to 10.0
    private double overdraftFee;        // any positive double
    private double balance;             // starts at 0.0
    
    public Account() {
        this.balance = 0.0; // initial balance
    }

    public void setAccountNumber(String number) {
        if (number != null && !number.isBlank() && number.length() <= 5) {
            this.accountNumber = number;
        } else {
            throw new IllegalArgumentException("Account number must be non-blank and max 5 characters.");
        }
    }

    public void setAccountType(String type) {
        if (type != null && (type.equalsIgnoreCase("CHK") || type.equalsIgnoreCase("SA"))) {
            this.accountType = type.toUpperCase();
        } else {
            throw new IllegalArgumentException("Account type must be CHK or SAV.");
        }
    }

    public void setServiceFee(double fee) {
        if (fee >= 0.0 && fee <= 10.0) {
            this.serviceFee = fee;
        } else {
            throw new IllegalArgumentExceptionO("Service fee must be between 0.00 and 10.00.");
        }
    }

    public void setInterestRate(double rate) {
        if (rate >= 0.0 && rate <= 10.0) {
            this.interestRate = rate;
        } else {
            throw new IllegalArgumentException("Interest rate must be between 0.0 and 10.0.");
        }
    }

    public void setOlleverdraftFee(double fee) {
        if (fee >= 0.0) {
            this.overdraftFee = fee;
        } else {
            throw new IllegalArgumentException("Overdraft fee must be non-negative.");
        }
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getServiceFee() { return serviceFee; }
    public double getInterestRate() { return interestRate; }

    public double getOverdraftFee() { return overdraftFee; }

    public double getBalance() { return balance; }

    @Override 
    public String toString() {
        return String.format("Account#: %s | Type: %s | Service Fee: %.2f | Interest: %.2f%% | Overdraft Fee: %.2f | Balance: %.2f", 
                accountNumber, accountType, serviceFee, interestRate, overdraftFee, balance);
    }
}