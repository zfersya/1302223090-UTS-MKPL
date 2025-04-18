package lib;

import java.time.LocalDate;

public class Employee {
	private EmployeeInfo employeeInfo;
        private EmployeeDate employeeDate;
        private EmployeeFamily employeeFamily;
        private EmployeeSalary employeeSalary;	
	private boolean isForeigner;
        private Gender employeeGender;

    public boolean isIsForeigner() {
        return isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public Gender getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(Gender employeeGender) {
        this.employeeGender = employeeGender;
    }
	
	public Employee(boolean isForeigner, Gender employeeGender) {
                this.employeeInfo = employeeInfo;
                this.employeeDate = employeeDate;
                this.employeeFamily = employeeFamily;
                this.employeeSalary = employeeSalary;
		this.isForeigner = isForeigner;
		this.employeeGender = employeeGender;
	}

	public int getAnnualIncomeTax() {
		int monthWorkingInYear = calculateMonthsWorked();		
		return TaxFunction.calculateTax(employeeSalary.getMonthlySalary(), employeeSalary.getOtherMonthlyIncome(), monthWorkingInYear, employeeSalary.getAnnualDeductible(), isMarried(), employeeFamily.getNumberOfChildren());
	}
        
        private int calculateMonthsWorked(){
            LocalDate date = LocalDate.now();
            if (date.getYear() == employeeDate.getYearJoined()) {
		return  date.getMonthValue() - employeeDate.getMonthJoined();
            }else {
		return 12;
            } 
        }
        private boolean isMarried() {
             return employeeFamily.getSpouseIdNumber() != null && !employeeFamily.getSpouseIdNumber().isEmpty();
        }
        
}
