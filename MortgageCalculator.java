import java.util.Scanner;

class MortgageCalculator
{
   public static void main(String[] args)
   {
      Scanner k = new Scanner(System.in);
      
      double HomePrice;//The Price of the home
      double MortInterest; //The interest rate of the loan
      int MortYears; //The number of years one would need to pay off the mortgage
      
      System.out.print("What is the price of your home? ");
      HomePrice = k.nextDouble();
      
      System.out.print("What is the interest rate on your loan? Please enter as a decimal: ");
      MortInterest = k.nextDouble();
     
      System.out.print("How many yeaars are on the loan? ");
      MortYears = k.nextInt();     
            
      double MortPayments = MortYears * 12; //The amount of total payments within the loan
      
      double MonthlyInterest = MortInterest / 12; //The monthly interest applied to the loan
      
      double Powers = Math.pow((1 + MonthlyInterest), MortPayments); //First part of the mortgage formula
      
      double num = Powers - 1; //Second part of the mortgage formula
      
      double numdoc = MonthlyInterest / num; //Third part of the mortgage formula
      
      double FinalTotal = numdoc * Powers * HomePrice; //Final product of the mortgage formula
      
      System.out.print("Data given: " + '\n' + "Home Price: $" + HomePrice + '\n' + "Interest Rate: " + MortInterest + "%" + '\n' +
      "Term in Years: " + MortYears + '\n' + "Number of total payments: " + MortPayments + '\n' + "Monthly Mortgage Payment: " + FinalTotal);
   }
}
      
      