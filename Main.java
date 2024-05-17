import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Damian Bukowski", 4100, 1);
        Worker worker2 = new Worker("Patrycja Kwaśniak", 4200, 2);
        Worker worker3 = new Worker("Dawid Żul", 4100, 3);
        Worker worker4 = new Worker("Dominik Jajko", 4100, 4);
        Manager manager = new Manager("Mateusz Królik", 5500, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println("Wynagrodzenie " + worker.getName() + ": " + worker.getSalary());
            worker.work();
        }

        System.out.println("Wynagrodzenie " + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}