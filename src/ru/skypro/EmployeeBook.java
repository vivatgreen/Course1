package ru.skypro;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }
    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double calculateTotalSalary() {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();

            }
        }
        return result;
    }

    public Employee employeeMinSalary() {
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

    public Employee employeeMaxSalary() {
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

    public double calculateAvarageSalary() {
        int amount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amount++;

            }
        }
        return calculateTotalSalary() / amount;
    }

    public void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());

            }
        }
    }

    public void indexSalary(int percent) {
        double multiply = percent / 100.0;
        for (Employee employee : employees) {
            if (employee != null) {
                double previousSalary = employee.getSalary();
                employee.setSalary(previousSalary + (previousSalary * multiply));
            }
        }
    }

    public Employee findEmployeeWithMinSalaryDepartment(int departmentNumber) {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                if (result == null || employee.getSalary() < result.getSalary()) {
                    result = employee;
                }
            }
        }

        return result;
    }

    public Employee findEmployeeWithMaxSalaryDepartment(int departmentNumber) {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                if (result == null || employee.getSalary() > result.getSalary()) {
                    result = employee;
                }
            }
        }

        return result;
    }

    public double calculateDepartmentTotalSalary(int departmentNumber) {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                result += employee.getSalary();
            }
        }
        return result;
    }

    public double calculateDepartmetAvarageSalary(int departmentNumber) {
        int amaunt = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                amaunt++;
            }
        }
        return calculateDepartmentTotalSalary(departmentNumber) / amaunt;
    }

    public void indexDepartmentSalary(int percent, int departmentNumber) {
        double multiply = percent / 100.0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                double previousSalary = employee.getSalary();
                employee.setSalary(previousSalary + (previousSalary * multiply));
            }

        }
    }

    public void printDepartmentEmployee(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee.getId() +
                        " " + employee.getFullName() +
                        " " + employee.getSalary());
            }
        }
    }

    public void printLessReceivingEmployees(double salaryThrashHold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryThrashHold) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }

        }
    }

    public void printMostReceivingEmployees(double salaryThrashHold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salaryThrashHold) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }

        }
    }

    public void fireEmployee(String firstName, String lastName, String patronymic, int departmentNumber) {
        for (int removedIdx = 0; removedIdx < this.employees.length; removedIdx++) {
            Employee employee = this.employees[removedIdx];
            if (employee == null) {
                continue;
            }
            if (employee.getFirstName().equals(firstName)
                    && employee.getLastName().equals(lastName)
                    && employee.getPatronymic().equals(patronymic)
                    && departmentNumber == employee.getDepartmentNumber()) {

                Employee[] newEmployees = new Employee[this.employees.length - 1];
                System.arraycopy(this.employees, 0, newEmployees, 0, removedIdx);
                if (this.employees.length != removedIdx) {
                    System.arraycopy(this.employees, removedIdx + 1, newEmployees, removedIdx,
                            this.employees.length - removedIdx - 1);
                }
                this.employees = newEmployees;
                return;
            }
        }
    }

    public void hireEmployee (Employee newEmployee) {
        Employee[] newEmployees = new Employee[this.employees.length + 1];
        System.arraycopy(this.employees, 0, newEmployees, 0, this.employees.length);
        newEmployees[this.employees.length] = newEmployee;
        this.employees = newEmployees;
    }

    public void changeSalary (String firstName, String lastName, String patronymic, double newSalary) {
        Employee employee = findByNames (firstName, lastName, patronymic);
            if (employee != null) {
                employee.setSalary(newSalary);
            }
        }

        public void changeDepartment(String firstName, String lastName, String patronymic, int newDepartmentNumber) {
        Employee employee = findByNames (firstName, lastName, patronymic);
            if (employee != null) {
                employee.setDepartmentNumber(newDepartmentNumber);
            }
        }
        private Employee findByNames (String firstName, String lastName, String patronymic) {
            for (Employee employee : employees) {
                if (employee.getFirstName().equals(firstName)
                        && employee.getLastName().equals(lastName)
                        && employee.getPatronymic().equals(patronymic)) {
                    return employee;
                }
            }
            return null;
        }

    public void printDepartmentEmployees() {
        for (int departmentNumber = 1; departmentNumber <= 5; departmentNumber++) {
            System.out.println("Номер отдела: " + departmentNumber + ":");
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                    System.out.println(employee);
                }
            }
        }
    }
}
