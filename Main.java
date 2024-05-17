import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Damian Bukowski", 4100, 1, "2024-08-01", "Worker");
        Worker worker2 = new Worker("Patrycja Kwaśniak", 4200, 2, "2022-10-10", "Worker");
        Worker worker3 = new Worker("Dawid Żul", 4300, 3, "2018-07-27", "Worker");
        Worker worker4 = new Worker("Dominik Jajko", 4400, 4, "2023-11-21", "Worker");
        Manager manager1 = new Manager("Mateusz Królik", 5500, 5, "2007-05-06", "Manager");
        Manager manager2 = new Manager("Darek Kwaśny", 5500, 2, "2005-06-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);
        employees.add(manager2);


        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Całkowita pensja wszystkich pracowników: " + totalSalary);

   
        double totalManagerSalary = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Całkowita pensja wszystkich Managerów: " + totalManagerSalary);

        
        double totalWorkerSalary = employees.stream()
                .filter(employee -> employee instanceof Worker)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Całkowita pensja wszystkich Workerów: " + totalWorkerSalary);

    
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee employee : employees) {
            idMap.computeIfAbsent(employee.hashCode(), k -> new ArrayList<>()).add(employee);
        }

        idMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .forEach(entry -> {
                    System.out.println("Employees with the same ID: ");
                    entry.getValue().forEach(employee -> {
                        System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                                ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() +
                                ", Salary: " + employee.getSalary() + ")");
                    });
                });
    }
}