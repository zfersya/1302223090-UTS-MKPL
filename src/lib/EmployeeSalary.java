package lib;

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

        public int getMonthlySalary() {
            return monthlySalary;
        }

        public int getOtherMonthlyIncome() {
            return otherMonthlyIncome;
        }

        public void setOtherMonthlyIncome(int otherMonthlyIncome) {
            this.otherMonthlyIncome = otherMonthlyIncome;
        }

        public int getAnnualDeductible() {
            return annualDeductible;
        }
        
}
