package exercise3;

public class BusinessMortgage extends Mortgage{
    public double primeRate = 1;
    public String mortgageType = "Business mortgage";

    public BusinessMortgage(){
    }
    //Override or else it'll be stuck at whatever user put for interest rate.
    public void setInterest(double interestInput){
        interestRate = interestInput + primeRate;
    }
}
