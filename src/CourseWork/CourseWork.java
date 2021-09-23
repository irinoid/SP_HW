package CourseWork;

import java.util.Objects;

public class CourseWork {

        public static void main(String[] args) {
            //int id;
            Employee[] employee = new Employee[10];
            employee[Employee.getId()] = new Employee("Иванов Иван Иванович", 1, 100_000);
            employee[Employee.getId()] = new Employee("Петров Петр Петрович", 2, 200_000);
            employee[Employee.getId()] = new Employee("Киркоров Филлип Бедросович", 3, 300_000);
            employee[Employee.getId()] = new Employee("Питт Брэд Степанович", 4, 400_000);
            employee[Employee.getId()] = new Employee("Дудь Юрий Юрьевич", 5, 500_000);
            employee[Employee.getId()] = new Employee("Собчак Ксения Анатольевна", 1, 600_000);
            employee[Employee.getId()] = new Employee("Милонов Виталий Валентинович", 2, 700_000);
            employee[Employee.getId()] = new Employee("Басков Николай Викторович", 3, 800_000);
            employee[Employee.getId()] = new Employee("Васильев Василий Васильевич", 4, 900_000);
            employee[Employee.getId()] = new Employee("Капелько Ирина Николаевна", 5, 1_000_000);

            getAllEmpoyeesInfo(employee);
            System.out.println("Затраты на ЗП в месяц составят: " + calculateSalarySum(employee));
            System.out.println("Сотрудник с минимальной зарплатой" + employee[findMinSalaryEmp(employee)]);
            System.out.println("Сотрудник с максимальной зарплатой" + employee[findMaxSalaryEmp(employee)]);
            System.out.println("Средняя зарплата = " + calculateAverageSalary(employee) + " рублей.");
            getAllEmpoyeesName(employee);
            int arg = 10;
            indexSalary(employee, arg);
            //проверка getAllEmpoyeesInfo(employee);
            int idDep = 4;
            System.out.println("Сотрудник отдела №" + idDep + " с минимальной ЗП по отделу" + getMinDepSalaryEmployee(employee, idDep));
            System.out.println("Сотрудник отдела №" + idDep + " с максимальной ЗП по отделу" + getMaxDepSalaryEmployee(employee, idDep));
            System.out.println("Сумма затрат на ЗП по отделу №" + idDep + " составила: " + calculateDepSalary(employee, idDep));
            System.out.println("Средняя ЗП по отделу №" + idDep + " составила: " + calculateDepSalary(employee, idDep) / calculateDepEmpNumber(employee, idDep));
            indexDepSalary(employee, idDep, arg);
            System.out.println("Сотрудники отдела №" + idDep + ":");
            printEmploeeDep(employee, idDep);
            double salaryX = 500_000;
            System.out.println("Сотрудники c ЗП меньше " + salaryX + ":");
            printEmpSalLessX(employee, salaryX);
            System.out.println("Сотрудники c ЗП больше (либо равной) " + salaryX + ":");
            printEmpSalMoreX(employee, salaryX);
        }

        public static void getAllEmpoyeesInfo(Employee[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("№" + (i + 1) + arr[i]);
            }
        }

        public static void getAllEmpoyeesName(Employee[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].getName());
            }
        }

        public static int calculateSalarySum(Employee[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i].salary;
            }
            return sum;
        }

        public static int findMinSalaryEmp(Employee[] arr) {
            int minSalId = 0;
            double minSal = arr[0].salary;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].salary < minSal) {
                    minSalId = i;
                }
            }
            return minSalId;
        }

        public static int findMaxSalaryEmp(Employee[] arr) {
            int maxSalId = 0;
            double maxSal = arr[0].salary;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].salary > maxSal) {
                    maxSalId = i;
                }
            }
            return maxSalId;
        }

        public static int calculateAverageSalary(Employee[] arr) {
            int AvSal = 0;
            AvSal = calculateSalarySum(arr) / arr.length;
            return AvSal;
        }

        public static void indexSalary(Employee[] arr, int arg) {

            for (int i = 0; i < arr.length; i++) {
                arr[i].setSalary(arr[i].getSalary() + (arr[i].getSalary() * arg / 100));
            }
        }

        public static void indexDepSalary(Employee[] arr, int depId, int arg) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].department == depId) {
                    arr[i].setSalary(arr[i].getSalary() + (arr[i].getSalary() * arg / 100));
                }
            }
        }

        public static Employee getMinDepSalaryEmployee(Employee[] arr, int dep) {
            double minSal = 0;
            int minSalId = 0;
            int i = 0;
            while (minSal == 0) {
                if (arr[i].department == dep) {
                    minSal = arr[i].salary;
                    minSalId = i;
                } else {
                    i++;
                }
            }

            for (i = 0; i < arr.length; i++) {
                if ((arr[i].department == dep) && (arr[i].salary < minSal)) {
                    minSalId = i;
                }
            }

            return arr[minSalId];
        }

        public static Employee getMaxDepSalaryEmployee(Employee[] arr, int dep) {
            double maxSal = 0;
            int maxSalId = 0;
            int i = 0;
            while (maxSal == 0) {
                if (arr[i].department == dep) {
                    maxSal = arr[i].salary;
                    maxSalId = i;
                } else {
                    i++;
                }
            }

            for (i = 0; i < arr.length; i++) {
                if ((arr[i].department == dep) && (arr[i].salary > maxSal)) {
                    maxSalId = i;
                }
            }

            return arr[maxSalId];
        }

        public static double calculateDepSalary(Employee[] arr, int dep) {
            double SumDepSalary = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].department == dep) {
                    SumDepSalary += arr[i].salary;
                }
            }

            return SumDepSalary;
        }

        public static int calculateDepEmpNumber(Employee[] arr, int dep) {
            int depEmpNumber = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].department == dep) {
                    depEmpNumber++;
                }
            }
            return depEmpNumber;
        }

        public static void printEmploeeDep(Employee[] arr, int dep) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].department == dep) {
                    System.out.println("ФИО: " + arr[i].getName() + " ЗП: " + arr[i].getSalary());
                }
            }
        }

        public static void printEmpSalMoreX(Employee[] arr, double x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].salary >= x) {
                    System.out.println("ID: " + (i + 1) + " - ФИО: " + arr[i].getName() + " ЗП: " + arr[i].getSalary());
                }
            }
        }

        public static void printEmpSalLessX(Employee[] arr, double x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].salary < x) {
                    System.out.println("ID: " + (i + 1) + " - ФИО: " + arr[i].getName() + " ЗП: " + arr[i].getSalary());
                }
            }
        }
    }

