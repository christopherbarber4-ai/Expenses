package healthcareEmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        boolean running = true;
        int choice;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new ClinicalWorker("Chris Barber", BusinessUnit.UK, 2, 100, Location.LONDON, Specialism.DOCTOR,
                true, 10, 222));
        employees.add(new ClinicalWorker("Dr. Sarah Jones", BusinessUnit.IRE, 12, 67450.00, Location.BRISTOL,
                Specialism.CARE_ASSISTANT, false, 8, 456));
        employees.add(new ClinicalWorker("Dr. Michael Brown", BusinessUnit.IRE, 5, 45230.00, Location.MANCHESTER,
                Specialism.CARE_ASSISTANT, true, 15, 798));
        employees.add(new ClinicalWorker("Dr. Emily White", BusinessUnit.UK, 23, 89670.00, Location.MANCHESTER,
                Specialism.DOCTOR, false, 3, 245));
        employees.add(new ClinicalWorker("Dr. James Taylor", BusinessUnit.International, 8, 52180.00, Location.LEEDS,
                Specialism.DOCTOR, true, 12, 978));
        employees.add(new ClinicalWorker("Dr. Lisa Anderson", BusinessUnit.International, 18, 78920.00, Location.LEEDS,
                Specialism.NURSE, false, 6, 345));

        employees.add(new OperationalWorker("John Smith", BusinessUnit.UK, 7, 42500, Location.LEEDS,
                Department.OPERATIONS, 3, 123));
        employees.add(new OperationalWorker("Mary Johnson", BusinessUnit.IRE, 3, 38200, Location.MANCHESTER,
                Department.HR, 1, 998));
        employees.add(new OperationalWorker("Robert Williams", BusinessUnit.International, 15, 56700, Location.LONDON,
                Department.MARKETING, 5, 685));
        employees.add(new OperationalWorker("Patricia Brown", BusinessUnit.UK, 9, 47300, Location.BRISTOL,
                Department.SALES, 4, 103));
        employees.add(new OperationalWorker("James Davis", BusinessUnit.IRE, 5, 41800, Location.LEEDS,
                Department.OPERATIONS, 2, 275));
        employees.add(new OperationalWorker("Jennifer Miller", BusinessUnit.International, 12, 52400,
                Location.MANCHESTER, Department.HR, 6, 456));
        employees.add(new OperationalWorker("Michael Wilson", BusinessUnit.UK, 2, 35600, Location.LONDON,
                Department.MARKETING, 1, 055));
        employees.add(new OperationalWorker("Linda Moore", BusinessUnit.IRE, 18, 61200, Location.BRISTOL,
                Department.SALES, 7, 678));
        employees.add(new OperationalWorker("David Taylor", BusinessUnit.International, 6, 44900, Location.LEEDS,
                Department.OPERATIONS, 3, 345));
        employees.add(new OperationalWorker("Barbara Anderson", BusinessUnit.UK, 11, 49800, Location.MANCHESTER,
                Department.HR, 4, 603));

        while (running) {
            System.out.println(EmployeeManager.BOLD + "---Welcome to the Employee Management System---" + EmployeeManager.RESET);
            System.out.println();
            System.out.println("1. Add new employee");
            System.out.println("2. Display Employee record");
            System.out.println("3. Run weekly payroll ");
            System.out.println("4. Run Reports");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit System");
            System.out.println("Please enter your choice");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                EmployeeManager.addNewEmployee(employees, scanner);
                break;
            case 2:
                EmployeeManager.displayRecord(employees, scanner);
                break;
            case 3:
                EmployeeManager.payWeeklySalary(employees, scanner);
                break;
            case 4:
                EmployeeManager.chooseReportMenu(employees, scanner);
                break;
            case 5:
                EmployeeManager.deleteEmployee(employees, scanner);
                break;
            case 6:
                System.out.println("Exiting...");
                running = false;
                break;
            default:
                System.out.println("Error, inccorect option selected");
            }
        }
    }
}