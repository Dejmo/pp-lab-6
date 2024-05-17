import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Aleksandra Wójcik", 5300, 1, "2024-05-17", "Worker");
        Worker worker2 = new Worker("Adam Nowak", 4200, 2, "2022-11-01", "Worker");
        Worker worker3 = new Worker("Kamil Kowalski", 3200, 3, "2019-04-01", "Worker");
        Worker worker4 = new Worker("Oliwia Roza", 5100, 4, "2023-05-01", "Worker");
        Manager manager = new Manager("Kuba Wilk", 2700, 5, "2003-01-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}