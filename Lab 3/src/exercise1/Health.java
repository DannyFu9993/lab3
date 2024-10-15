package exercise1;

public class Health extends Insurance {

    public Health(){
        this.type = "Health insurance";
    }

    public void setInsuranceCost(double insuranceCost){
        this.monthlyCost = insuranceCost;
    }

    public void displayInfo(){
        System.out.println("Insurance Type: " + getType() + ", monthly Cost: $" + getMonthlyCost());
    }
}
