// Superclass Employee
class Employee {
    // Attributes
    private String employeeID;
    private String name;
    private double basicSalary;

    // Constructor
    public Employee() {
        this.employeeID = "";
        this.name = "";
        this.basicSalary = 0.0;
    }

    // Method to set employee details
    public void setDetails(String employeeID, String name, double basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to retrieve employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
    }

    // Getter for basic salary
    public double getBasicSalary() {
        return basicSalary;
    }
}

// Subclass SeniorEngineer
class SeniorEngineer extends Employee {
    // Additional attributes
    private double projectBonus;
    private double performanceBonus;

    // Constructor
    public SeniorEngineer() {
        super(); // Calls the constructor of the superclass Employee
        this.projectBonus = 0.0;
        this.performanceBonus = 0.0;
    }

    // Method to set senior engineer details
    public void setDetails(String employeeID, String name, double basicSalary, double projectBonus, double performanceBonus) {
        super.setDetails(employeeID, name, basicSalary); // Calls the superclass method
        this.projectBonus = projectBonus;
        this.performanceBonus = performanceBonus;
    }

    // Method to calculate and display total monthly income
    public void calculateAndDisplayTotalIncome() {
        double totalIncome = getBasicSalary() + projectBonus + performanceBonus;
        displayDetails(); // Display general employee details
        System.out.println("Project Bonus: $" + projectBonus);
        System.out.println("Performance Bonus: $" + performanceBonus);
        System.out.println("Total Monthly Income: $" + totalIncome);
    }
}

// Main class
public class TechStrom {
    public static void main(String[] args) {
        // Create an instance of SeniorEngineer
        SeniorEngineer seniorEngineer = new SeniorEngineer();

        // Set the details for the senior engineer
        seniorEngineer.setDetails("SE12345", "Alice Johnson", 5000.00, 1500.00, 2000.00);

        // Calculate and display the total monthly income
        seniorEngineer.calculateAndDisplayTotalIncome();
    }
}
