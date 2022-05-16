package ru.skypro;

import java.util.Objects;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private double salary;
    private int departmentNumber;

    private static int numberId;

    public Employee(String firstName, String lastName, String patronymic, double salary, int departmentNumber) {
        this.id = ++numberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && Double.compare(employee.salary, salary) == 0
                && departmentNumber == employee.departmentNumber
                && firstName.equals(employee.firstName)
                && lastName.equals(employee.lastName)
                && patronymic.equals (employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, patronymic, salary, departmentNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", salary=" + salary +
                ", departmentNumber=" + departmentNumber +
                '}';
    }
}
