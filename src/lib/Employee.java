package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	private EmployeeInfo employeeInfo;
        private EmployeeDate employeeDate;
        private EmployeeFamily employeeFamily;
        private EmployeeSalary employeeSalary;
	
	private boolean isForeigner;
        private Gender employeeGender;
	
	public Employee(boolean isForeigner, Gender employeeGender) {
//		this.employeeId = employeeId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.idNumber = idNumber;
//		this.address = address;
//		this.yearJoined = yearJoined;
//		this.monthJoined = monthJoined;
//		this.dayJoined = dayJoined;
                this.employeeInfo = employeeInfo;
                this.employeeDate = employeeDate;
                this.employeeFamily = employeeFamily;
                this.employeeSalary = employeeSalary;
		this.isForeigner = isForeigner;
		this.employeeGender = employeeGender;
		
//		childNames = new LinkedList<String>();
//		childIdNumbers = new LinkedList<String>();
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	
      
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
        
}
