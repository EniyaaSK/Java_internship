import java.util.Scanner;

public class Sipcalculator {
   public static void main(String[] args) {
       Scanner amt = new Scanner(System.in);
       System.out.println("Enter monthly investment:");
       double monthlyInvestment = amt.nextDouble();
       System.out.println("Enter the expected returns in percentage:");
       double expectedReturnInPer = amt.nextDouble();
       System.out.println("Enter period in Years:");
       int PeriodInYears = amt.nextInt();
       double PrincipleAmount = monthlyInvestment * 12 * PeriodInYears;
       double EstimateReturns = (PrincipleAmount * expectedReturnInPer) / 100;
       double totalAmount = PrincipleAmount + EstimateReturns;
       System.out.println("Principle Amount:" + PrincipleAmount);
       System.out.println("Estimated returns:" + EstimateReturns);
       System.out.println("Total Amount:" + totalAmount);
       amt.close();

   }
}



