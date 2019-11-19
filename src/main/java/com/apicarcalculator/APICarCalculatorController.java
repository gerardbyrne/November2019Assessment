package com.apicarcalculator;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration

public class APICarCalculatorController
{
    // Here we use @GetMapping which has no path attached to it
    @RequestMapping("/hello")
    public String getHello() {
        // We now return the template called hello
        // which is really hello.html
        return "hello";
    }

    // http://localhost:8080/interestrate?amount=10000
    @RequestMapping(value = "/interestrate", method = RequestMethod.GET)
    @ResponseBody
    public String loanInterestRate(@RequestParam("amount") double loanAmountPassedIn)
    {
        /* Calculate the rate of interest that is to be paid on the loan.
           Assign the calculated interest rate to the variable of
           data type double called interestRate
        */
        double interestRate;

        if (loanAmountPassedIn < 10000)
        {
            interestRate = 0.06;  // 6%
        }
        else
        {
            interestRate = 0.10;  // 10%
        }
        System.out.println("The interest rate is " + interestRate);

        return "<html>" + "<title>" + "Car Loan Calculator" + "</title>"
                + "<body><h1>" + interestRate + "<br></br></h1></body>" + "</html>";
    }


    // http://localhost:8080/downpayment?downpayment=10000
    @RequestMapping(value = "/downpayment", method = RequestMethod.GET)
    @ResponseBody
    public String downPaymentAmount(@RequestParam("downpayment") double loanAmountPassedIn)
    {
        /* Calculate the down payment amount for the required loan.
           Assign the calculated down payment to the variable of
           data type double called downPaymentAmount
        */
        double downPaymentAmount;

        if (loanAmountPassedIn < 10000)
        {
            downPaymentAmount = loanAmountPassedIn * 0.10;  // 10%
        }
        else
        {
            downPaymentAmount = loanAmountPassedIn * 0.20;  // 20%
        }
        return "<html>" + "<title>" + "Car Loan Calculator" + "</title>"
            + "<body><h1>" + downPaymentAmount + "<br></br></h1></body>" + "</html>";
    }

}
