import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Worker worker1 = new Worker("Aleksandra Wójcik", 5300, 1, "2024-05-17", "Worker");
        Worker worker2 = new Worker("Adam Nowak", 4200, 2, "2022-11-01", "Worker");
        Worker worker3 = new Worker("Kamil Kowalski", 3200, 2, "2019-04-01", "Worker");
        Manager manager = new Manager("Kuba Wilk", 2700, 3, "2003-01-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println("Comparing worker2 with other employees:");
        System.out.println("worker2 equals worker1: " + worker2.equals(worker1));
        System.out.println("worker2 equals worker2: " + worker2.equals(worker2));
        System.out.println("worker2 equals worker3: " + worker2.equals(worker3));
        System.out.println("worker2 equals manager: " + worker2.equals(manager));
    }
}