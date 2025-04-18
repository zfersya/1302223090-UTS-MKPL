package lib;

import java.util.List;

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

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

        
        
}
