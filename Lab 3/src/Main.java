import exercise1.Health;
import exercise1.Insurance;
import exercise1.Life;
import exercise2.*;

import java.util.Scanner;

public class Main {
    static Insurance[] insuranceList = new Insurance[2];
    static int i = 0;
    public static void main(String[] args) {

        //For exercise #1 =====================================================
//        createInsurance();
//        createInsurance();
        //createInsurance();;
        //Will need a second array, to store the monthlyCostInput so it can send to screen manager
        //For exercise #1 =====================================================

        //For exercise #2 =====================================================

        gameTesterJob();
        //For exercise #2 =====================================================
    }

    //For exercise #1 =====================================================
    public static void createInsurance(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of insurance do you want to purchase?");
        String myInsuranceType = scanner.nextLine().toLowerCase();

        System.out.println("How much would you like to pay per month?");
        double monthlyCostInput = scanner.nextDouble();

        Insurance insurance;
        if (myInsuranceType.equals("life")){
            insurance = new Life();
            insuranceList[i] = insurance;
            screenManager(monthlyCostInput);
            i++;
        }
        else if (myInsuranceType.equals("health")){
            insurance = new Health();
            insuranceList[i] = insurance;
            screenManager(monthlyCostInput);
            i++;
        }

    }
    public static void screenManager(double insuranceCost){
            insuranceList[i].monthlyCost = insuranceCost;
            insuranceList[i].displayInfo();
    }
    //For exercise #1 =====================================================

    //For exercise #2 =====================================================
    public static void gameTesterJob(){
        System.out.println("Would you like full time or part time? Select with 1 for full time, or 2 for part time: ");
        Scanner scanner = new Scanner(System.in);
        int jobStatus = scanner.nextInt();

        GameTester gameTester;
        if (jobStatus == 1){
            gameTester = new FullTimeGameTester();
            System.out.println("Welcome to the company.");
            gameTester.determineSalary();
            System.out.println("It has been a month, you are paid: $" + gameTester.salary);
        }
        else if (jobStatus == 2){
            gameTester = new PartTimeGameTester();
            System.out.println("Welcome to the company.");

            gameTester.determineSalary();
            System.out.println("How many hours did you work this month?: ");
            double hours = scanner.nextInt();
            double paycheck = hours * gameTester.salary;
            System.out.println("Your paycheck for " + hours + " hours worked is: " + paycheck);
        }

    }
}

