package ru.skypro;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.hireEmployee(new Employee("Лев", "Полянский", "Николаевич", 78_580, 1));
        employeeBook.hireEmployee(new Employee("Cергей","Сошин", "Александрович", 95_600, 2));
        employeeBook.hireEmployee(new Employee("Михаил", "Кудрин", "Викторович", 88_200, 3));
        employeeBook.hireEmployee(new Employee("Виталий", "Тузовский", "Андреевич", 91_500, 4));
        employeeBook.hireEmployee(new Employee("Павел", "Ракчеев", "Анатольевич", 101_950, 5));

//        employeeBook.printEmployees();

//        System.out.println();
//        employeeBook.fireEmployee("Павел", "Ракчеев", "Анатольевич", 5);
//        employeeBook.printEmployees();

        employeeBook.printDepartmentEmployees();


//        employeeBook.indexDepartmentSalary(50, 2);
//       employeeBook.printDepartmentEmployees();


//        employeeBook.indexSalary(50);
 //       employeeBook.printDepartmentEmployees();

    }
}
