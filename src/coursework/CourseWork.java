package coursework;

import java.util.Arrays;

public class CourseWork {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 200_000);
        employees[2] = new Employee("Киркоров Филлип Бедросович", 3, 300_000);
        employees[3] = new Employee("Питт Брэд Степанович", 4, 400_000);
        employees[4] = new Employee("Дудь Юрий Юрьевич", 5, 500_000);
        employees[5] = new Employee("Собчак Ксения Анатольевна", 1, 600_000);
        employees[6] = new Employee("Милонов Виталий Валентинович", 2, 700_000);
        employees[7] = new Employee("Басков Николай Викторович", 3, 800_000);
        employees[8] = new Employee("Васильев Василий Васильевич", 4, 900_000);
        employees[9] = new Employee("Капелько Ирина Николаевна", 5, 1_000_000);

        getAllEmployeesInfo();
        System.out.println("Затраты на ЗП в месяц составят: " + calculateSalarySum());
        System.out.println("Сотрудник с минимальной зарплатой" + findMinSalaryEmp());
        System.out.println("Сотрудник с максимальной зарплатой" + findMaxSalaryEmp());
        System.out.println("Средняя зарплата = " + calculateAverageSalary() + " рублей.");
        getAllEmployeesName();
        int percent = 10;
        indexSalary(percent);
        //проверка getAllEmployeesInfo(employee);
        int idDep = 4;
        System.out.println("Сотрудник отдела №" + idDep + " с минимальной ЗП по отделу" + getMinDepSalaryEmployee(idDep));
        System.out.println("Сотрудник отдела №" + idDep + " с максимальной ЗП по отделу" + getMaxDepSalaryEmployee(idDep));
        System.out.println("Сумма затрат на ЗП по отделу №" + idDep + " составила: " + calculateDepSalary(idDep));
        System.out.println("Средняя ЗП по отделу №" + idDep + " составила: " + calculateDepSalary(idDep) / calculateDepEmpNumber(idDep));
        indexDepSalary(idDep, percent);
        System.out.println("Сотрудники отдела №" + idDep + ":");
        printEmployeeDep(idDep);
        double salaryX = 500_000;
        System.out.println("Сотрудники c ЗП меньше " + salaryX + ":");
        printEmpSalLessX(salaryX);
        System.out.println("Сотрудники c ЗП больше (либо равной) " + salaryX + ":");
        printEmpSalMoreX(salaryX);
    }

    public static void getAllEmployeesInfo() {
        for (Employee employee : employees) {
            System.out.println("№" + employee.getId() + employee);
        }
    }

    public static void getAllEmployeesName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static int calculateSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalaryEmp() {
        int minSalId = 0;
        double minSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSal) {
                minSalId = i;
            }
        }
        return employees[minSalId];
    }

    public static Employee findMaxSalaryEmp() {
        int maxSalId = 0;
        double maxSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSal) {
                maxSalId = i;
            }
        }
        return employees[maxSalId];
    }

    public static int calculateAverageSalary() {
        return calculateSalarySum() / employees.length;
    }

    public static void indexSalary(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));
        }
    }

    public static void indexDepSalary(int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double increasingAmount = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + increasingAmount);
            }
        }
    }

    public static Employee getMinDepSalaryEmployee(int dep) {
//        double minSal = 0;
//        int minSalId = 0;
//        int i = 0;
//        while (minSal == 0) {
//            if (employees[i].getDepartment() == dep) {
//                minSal = employees[i].getSalary();
//                minSalId = i;
//            } else {
//                i++;
//            }
//        }
//
//        for (i = 0; i < employees.length; i++) {
//            if ((employees[i].getDepartment() == dep) && (employees[i].getSalary() < minSal)) {
//                minSalId = i;
//            }
//        }

//        return employees[minSalId];

        double minSalary = Double.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == dep) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }

        if (result == null) {
            System.out.println("Сотрудник не найден");
        }
        return result;
    }

    public static Employee getMaxDepSalaryEmployee(int dep) {
        double maxSalary = Double.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == dep) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }

        if (result == null) {
            System.out.println("Сотрудник не найден");
        }
        return result;
    }

    public static double calculateDepSalary(int dep) {
        double sumDepSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == dep) {
                sumDepSalary += employee.getSalary();
            }
        }
        return sumDepSalary;
    }

    public static long calculateDepEmpNumber(int dep) {
//        int depEmpNumber = 0;
//        for (Employee employee : employees) {
//            if (employee.getDepartment() == dep) {
//                depEmpNumber++;
//            }
//        }
//        return depEmpNumber;
        return Arrays.stream(employees).map(e -> {
            if (e.getDepartment() == dep) {
                return 1;
            } else {
                return 0;
            }
        }).count();
    }

    public static void printEmployeeDep(int dep) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == dep) {
                System.out.println("ФИО: " + employee.getName() + " ЗП: " + employee.getSalary());
            }
        }
    }

    public static void printEmpSalMoreX(double x) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= x) {
                System.out.println("ID: " + employee.getId() + " - ФИО: " + employee.getName() + " ЗП: " + employee.getSalary());
            }
        }
    }

    public static void printEmpSalLessX(double x) {
        for (Employee employee : employees) {
            if (employee.getSalary() < x) {
                System.out.println("ID: " + employee.getId() + " - ФИО: " + employee.getName() + " ЗП: " + employee.getSalary());
            }
        }
    }
}

