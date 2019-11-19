import java.util.Scanner;

public class CarCalculator implements ICarCalculator
{
    Scanner readIn = new Scanner( System.in );

    String customerName;
    double loanAmount;
    int loanDurationInYears;
    double interestRate;
    double downPaymentAmount;


    public void customerDetails()
    {
        /* Ask the user to enter their name and read the
           details entered at the keyboard using the Scanner
           class. Then assign the input value to the String
           variable called customerName
        */
        System.out.print("Enter your name: ");
        customerName = readIn.next();

        // Display a welcome message
        System.out.println("Hello "+ customerName);
    }

    public void loanAmount()
    {
        /* Ask the user to enter amount of the loan
           they require and read the details entered at
           the keyboard using the Scanner class.
           Then assign the input value to the double
           variable called loanAmount
        */
        System.out.print("Enter the amount you wish to borrow for the car loan: ");
        loanAmount = readIn.nextDouble();
    }

    public void loanDuration()
    {
        /* Ask the user to enter the number of years
           the loan will be taken over and read the
           keyboard using the Scanner class.
           Then assign the input value to the int
           variable called loanDurationInYears
        */
        System.out.print("Over how many years do you wish to pay of the loan: ");
        loanDurationInYears = readIn.nextInt();
    }


    public double loanInterestRate(double loanAmountPassedIn)
    {
        /* Calculate the rate of interest that is to be paid on the loan.
           Assign the calculated interest rate to the variable of
           data type double called interestRate
        */

        if (loanAmountPassedIn < 10000)
        {
            interestRate = 0.06;  // 6%
        }
        else
        {
            interestRate = 0.10;  // 10%
        }
        return interestRate;
    }

    public double downPaymentAmount(double loanAmountPassedIn)
    {
        /* Calculate the down payment amount for the required loan.
           Assign the calculated down payment to the variable of
           data type double called downPaymentAmount
        */

        if (loanAmountPassedIn < 10000)
        {
            downPaymentAmount = loanAmountPassedIn * 0.10;  // 10%
        }
        else
        {
            downPaymentAmount = loanAmountPassedIn * 0.20;  // 20%
        }
        System.out.println(downPaymentAmount);
        return downPaymentAmount;
    }

    public double repaymentAmount(double loanAmountPassedIn, int durationyears)
    {
        // Should give a balance of 5000 - 500 = 4500
        double remainingBalance = loanAmountPassedIn - downPaymentAmount(loanAmountPassedIn);
        int months = durationyears * 12;

        // Should give 4500/36 = 125
        double monthlyBalance = remainingBalance / months;

        // Should give 125 * 0.10 /100 = .125
        double interest = monthlyBalance * loanInterestRate(remainingBalance ) / 100;

        // Should give 125 + .125 = 125.125
        double monthlyPayment = monthlyBalance + interest;
        System.out.println("Your monthly payment is $" + monthlyPayment);
        return monthlyPayment;
    }

}