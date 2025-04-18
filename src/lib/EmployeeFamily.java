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

	private List<String> childNames = new ArrayList<>();
	private List<String> childIdNumbers = new ArrayList<>();
        
        
	  public void setSpouse(String spouseName, EmployeeInfo personalInformation) {
		this.spouseName = spouseName;
		this.spouseIdNumber = personalInformation.getIdNumber();
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
}
