import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    Employee() {
        this.employeeId = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    void addBonus(double bonusAmount) {
        this.bonus += bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = basicSalary * bonusPercentage / 100;
        this.bonus += percentageBonus + extraReward;
    }

    double calculateTotalSalary() {
        return basicSalary + bonus;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id1 = scanner.nextInt();
        scanner.nextLine();
        String name1 = scanner.nextLine();
        double sal1 = scanner.nextDouble();
        double fixedBonus1 = scanner.nextDouble();

        Employee emp1 = new Employee();
        emp1.setEmployeeDetails(id1, name1, sal1);
        emp1.addBonus(fixedBonus1);

        int id2 = scanner.nextInt();
        scanner.nextLine();
        String name2 = scanner.nextLine();
        double sal2 = scanner.nextDouble();
        double initialBonus2 = scanner.nextDouble();
        double bonusPercent = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        Employee emp2 = new Employee(id2, name2, sal2, initialBonus2);
        emp2.addBonus(bonusPercent, extraReward);

        System.out.println("Employee 1");
        emp1.displayEmployee();
        System.out.println();
        System.out.println("Employee 2");
        emp2.displayEmployee();

        scanner.close();
    }
}