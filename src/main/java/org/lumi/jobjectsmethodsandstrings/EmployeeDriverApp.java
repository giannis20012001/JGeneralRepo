package org.lumi.jobjectsmethodsandstrings;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 18/2/2017.
 */

public class EmployeeDriverApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Johann", "Strauss", 100);
        Employee employee2 = new Employee("Archimedes ", "Syracuse", 200);

        System.out.printf("The yearly salary of %s %s is %f%n",
                employee1.getFirstName(),
                employee1.getLastName(),
                (employee1.getMonthlySalary() * 12));
        System.out.printf("The yearly salary of %s %s is %f%n",
                employee2.getFirstName(),
                employee2.getLastName(),
                (employee2.getMonthlySalary() * 12));

        employee1.setMonthlySalary((employee1.getMonthlySalary() * 0.1) + employee1.getMonthlySalary());
        employee2.setMonthlySalary((employee2.getMonthlySalary() * 0.1) + employee2.getMonthlySalary());

        System.out.printf("%nThe yearly salary of %s %s after giving him a 10%% raise is %f%n",
                employee1.getFirstName(),
                employee1.getLastName(),
                (employee1.getMonthlySalary() * 12));
        System.out.printf("The yearly salary of %s %s after giving him a 10%% raise is %f%n",
                employee2.getFirstName(),
                employee2.getLastName(),
                (employee2.getMonthlySalary() * 12));

    }

}
