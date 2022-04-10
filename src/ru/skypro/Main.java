package ru.skypro;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Лев", "Полянский", "Николаевич", 78_580, 1);
        employees[1] = new Employee("Cергей", "Сошин", "Александрович", 95_600, 2);
        employees[2] = new Employee("Михаил", "Кудрин", "Викторович", 88_200, 3);
        employees[3] = new Employee("Виталий", "Тузовский", "Андреевич", 91_500, 4);
        employees[4] = new Employee("Павел", "Ракчеев", "Анатольевич", 101_950, 5);
        System.out.println(calculateTotalSalary());
        System.out.println(employeeMinSalary());
        System.out.println(employeeMaxSalary());
        System.out.println(calculateAvarageSalary());
        printEmployees();
        printFullName();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();

            }
        }
        return result;
    }

    public static Employee employeeMinSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (result == null || employee.getSalary() < result.getSalary()) {
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee employeeMaxSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (result == null || employee.getSalary() > result.getSalary()) {
                    result = employee;
                }
            }
        }
        return result;
    }
        public static double calculateAvarageSalary () {
            int amount = 0;
            for (Employee employee : employees) {
                if (employee != null) {
                    amount++;

                }
            }
            return calculateTotalSalary() / amount;
        }
        public static void printFullName () {
            for (Employee employee : employees) {
                if (employee != null) {
                    System.out.println(employee.getFullName());

                }
            }
        }
    }
