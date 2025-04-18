/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author Fersya
 */
public class EmployeeSalary {
    	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
        
        public EmployeeSalary(int monthlySalary, int otherMonthlyIncome, int annualDeductible){
            this.monthlySalary = monthlySalary;
            this.otherMonthlyIncome = otherMonthlyIncome;
            this.annualDeductible = annualDeductible;
        }
	
        public void setMonthlySalary(int grade, boolean isForeigner) {	
		if (grade == 1) {
			monthlySalary = 3000000;
		}else if (grade == 2) {
			monthlySalary = 5000000;
			
		}else if (grade == 3) {
			monthlySalary = 7000000;
		}
                if(isForeigner){
                    monthlySalary = (int) (monthlySalary * 1.5);
                }
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
}
