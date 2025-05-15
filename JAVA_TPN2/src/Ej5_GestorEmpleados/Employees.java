import java.util.ArrayList;

public class Employees {
    private class Employee {
        int fileNumber;
        String name;
        double wage;
        String reasonForIncrease;

        public Employee(int fileNumber, String name, double wage, String reasonForIncrease) {
            this.fileNumber = fileNumber;
            this.name = name;
            this.wage = wage;
            this.reasonForIncrease = reasonForIncrease;
        }
    }

    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(int fileNumber, String name, double wage, String reasonForIncrease) {
        employeeList.add(new Employee(fileNumber, name, wage, reasonForIncrease));
    }

    public void percentageIncrease(int fileNumber, double percentage, String reason) {
        for (Employee emp : employeeList) {
            if (emp.fileNumber == fileNumber) {
                emp.wage += emp.wage * (percentage / 100);
                emp.reasonForIncrease = reason;
                System.out.println("╔═══════════════════════════╗");
                System.out.println("║ ¡Aumento aplicado a " + emp.name + "!");
                System.out.println("║ Motivo: " + reason);
                System.out.println("╚═══════════════════════════╝");
                break;
            }
        }
    }

    public void fixedAmountIncrease(int fileNumber, double fixedAmount, String reason) {
        for (Employee emp : employeeList) {
            if (emp.fileNumber == fileNumber) {
                emp.wage += fixedAmount;
                emp.reasonForIncrease = reason;
                System.out.println("╔═══════════════════════════╗");
                System.out.println("║ ¡Aumento aplicado a " + emp.name + "!");
                System.out.println("║ Motivo: " + reason);
                System.out.println("╚═══════════════════════════╝");
                break;
            }
        }
    }

    public void showEmployeesInfo() {
        System.out.println("\n╔═════════════════════════════════════════════════════╗");
        System.out.println("║ ¡Aquí van los empleados más geniales de la empresa! ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
        for (Employee emp : employeeList) {
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║ Nombre: " + emp.name);
            System.out.println("║ Legajo: " + emp.fileNumber);
            System.out.println("║ Salario: $" + emp.wage);
            System.out.println("║ Motivo del aumento: " + emp.reasonForIncrease);
            System.out.println("╚════════════════════════════════════════════════════╝");
        }
    }
}
