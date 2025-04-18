package lib;

public class TaxFunction {
    private static final int belumMenikah = 54000000; 
    private static final int menikah = 4500000; 
    private static final int menikahMemilikiAnak = 4500000; 
    private static final int anakMaksimal = 3; 

    public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        if (numberOfMonthWorking > 12) {
            System.err.println("More than 12 month working per year");
            return -1; 
        }
        numberOfChildren = Math.min(numberOfChildren, anakMaksimal); 
        int totalIncome = calculateTotalIncome(monthlySalary, otherMonthlyIncome, numberOfMonthWorking);
        int nonTaxableIncome = calculateNonTaxableIncome(isMarried, numberOfChildren);
        int taxableIncome = totalIncome - deductible - nonTaxableIncome;
        return Math.max((int) Math.round(0.05 * taxableIncome), 0); 
    }

    private static int calculateTotalIncome(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking) {
        return (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
    }

    private static int calculateNonTaxableIncome(boolean isMarried, int numberOfChildren) {
        int nonTaxableIncome = belumMenikah; 
        if (isMarried) {
            nonTaxableIncome += menikah; 
        }
        nonTaxableIncome += numberOfChildren * menikahMemilikiAnak; 
        return nonTaxableIncome;
    }
}