package exercise3;

import java.util.Scanner;

public class ProcessMortgage{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //Mortgage array, with size of 3
        Mortgage[] mortgageArray = new Mortgage[3];

        //This is asked once, and will be applied to all mortgages on top of the prime rate.
        System.out.println("Welcome to your mortgage application. Enter your interest rate: ");
        double interestRate = input.nextDouble();
        for (int i = 0; i < mortgageArray.length ; i++){

            Mortgage mortgage = null;

            System.out.println("==================== Application: " + (i+1) + "============================");

            System.out.println("We need some information.");
            System.out.println("Is this for business or personal mortgage? Enter business, or personal:");
            String mortgageType = input.next().toLowerCase();
            if (mortgageType.equals("business")){
                mortgage = new BusinessMortgage();
                mortgage.setInterest(interestRate);
            }
            else if (mortgageType.equals("personal")){
                mortgage = new PersonalMortgage();
                mortgage.setInterest(interestRate);
            }

            System.out.println("What is your name?.");
            String customerNameInput = input.next();
            mortgage.setCustomerName(customerNameInput);


            System.out.println("We need some information. Enter your mortgage number: ");
            int mortgageNumberInput = input.nextInt();
            mortgage.setMortgageNumber(mortgageNumberInput);


            System.out.println("How many terms? Enter 1, 3, or 5.");
            int termsInput = input.nextInt();
            //To default to 1 on unrecognised terms
            if (termsInput == Mortgage.shortTerm || termsInput == Mortgage.mediumTerm || termsInput == Mortgage.longTerm){
                mortgage.setTerm(termsInput);
            }
            else {
                mortgage.setTerm(mortgage.shortTerm);
            }


            System.out.println("How much do you want to borrow?");
            double amountToBorrow = input.nextDouble();
            //To prevent from borrowing more than 300K
            if (amountToBorrow > mortgage.maxAmount){
                mortgage.setAmount(mortgage.maxAmount);
            }
            else {
                mortgage.setAmount(amountToBorrow);
            }

            mortgageArray[i] = mortgage;
        }
        //Printing the mortgage info
        for (int i = 0 ; i < mortgageArray.length ; i++){
            System.out.println("==================== Application: " + (i+1) + "============================");
            mortgageArray[i].displayInfo();
            System.out.println("==================== Application: " + (i+1) + "============================");
        }


    }
}
