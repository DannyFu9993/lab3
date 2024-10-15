package exercise3;

public abstract class Mortgage implements MortgageConstants {
    String customerName = "No name";
    public int mortageNumber = 0;
    public String mortgageType = "None";
    public double interestRate = 0;
    public int term = 1;
    public double primeRate = 0;
    public double amount = 0;

    public void displayInfo() {
        System.out.println("Customer name: " + getCustomerName() +
                "\n Mortgage number: " + getMortgageNumber() +
                "\n Type: " + getMortgageType() +
                "\n Interest: " + getInterest() +
                "\n Terms: " + getTerm() +
                "\n Borrowed amount: " + getAmount());
    }

    //============================== Customer Name =========================
    public void setCustomerName(String nameInput){
        customerName = nameInput;
    }
    public String getCustomerName(){
        return customerName;
    }

    //============================== Mortgage Number =========================
    public void setMortgageNumber(int numberInput){
        mortageNumber = numberInput;
    }
    public int getMortgageNumber(){
        return mortageNumber;
    }

    //============================== Mortgage Type =========================
    public void setType(String typeInput){
        mortgageType = typeInput;
    }
    public String getMortgageType(){
        return mortgageType;
    }

    //============================== Interest =========================
    public void setInterest(double interestInput){
        interestRate = interestInput + primeRate;
    }
    public double getInterest(){
        return interestRate;
    }

    //============================== Term =========================
    public void setTerm(int termInput){
        term = termInput;
    }
    public int getTerm(){
        return term;
    }
    //============================== Borrowed amount =========================
    public void setAmount(double amountInput){
        amount = amountInput;
    }
    public double getAmount(){
        return amount;
    }


}

