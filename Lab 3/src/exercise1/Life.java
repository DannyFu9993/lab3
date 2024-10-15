package exercise1;

public class Life extends Insurance {

    public Life(){
        this.type = "Life insurance";
    }

    public void setInsuranceCost(double insuranceCost){
        this.monthlyCost = insuranceCost;
    }

    public void displayInfo(){
        System.out.println("Insurance Type: " + getType() + ", monthly Cost: $" + getMonthlyCost());
    }
}
