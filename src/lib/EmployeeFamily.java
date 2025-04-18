/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fersya
 */
public class EmployeeFamily {
    	private String spouseName;
	private String spouseIdNumber;
	private List<String> childNames;
	private List<String> childIdNumbers;

    public EmployeeFamily(String spouseName, String spouseIdNumber, List<String> childNames, List<String> childIdNumbers) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
        this.childNames = childNames;
        this.childIdNumbers = childIdNumbers;
    }
        
    public int getNumberOfChildren(){
        return childNames.size();
    }
    

    public List<String> getChildNames() {
        return childNames;
    }

    public void setChildNames(List<String> childNames) {
        this.childNames = childNames;
    }

    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    }

    public void setChildIdNumbers(List<String> childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }
    
        
	  public void setSpouse(String spouseName, EmployeeInfo personalInformation) {
		this.spouseName = spouseName;
		this.spouseIdNumber = personalInformation.getIdNumber();
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}

      
        
}
