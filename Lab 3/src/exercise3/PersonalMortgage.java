package exercise3;

public class PersonalMortgage extends Mortgage{
    public double primeRate = 2;
    public String mortgageType = "Personal mortgage";

    public PersonalMortgage(){
    }
    //Override or else it'll be stuck at whatever user put for interest rate.
    public void setInterest(double interestInput){
        interestRate = interestInput + primeRate;
    }
}
