public interface ICarCalculator
{
    public void customerDetails();
    public void loanAmount();
    public void loanDuration();
    public double loanInterestRate(double loanAmount);
    public double downPaymentAmount(double loanAmount);

}
