package exercise1;

public abstract class Insurance {
    public String type;
    public double monthlyCost;

    //======================================= Getters =======================================

    public String getType(){
        return type;
    }
    public double getMonthlyCost(){
        return monthlyCost;
    }

    //======================================= Abstract Methods =======================================
    public abstract void setInsuranceCost(double insuranceCost);

    public abstract void displayInfo();

}

