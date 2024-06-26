package emp;

public class Company {

    public static void main(String args[]) {
        Employee[] employees = {
            new Secretary("Duke", 1, "Secretary", 800),
            new Sales("Tuxi", 2, "Sales", 1200)
        };

        printEmployee(employees, false);
        
        System.out.println("\n[인센티브 100 지급]");
        
       for (Employee emp : employees) {
           emp.incentive(100);
        
            
       }
        
        printEmployee(employees, true);
       
    }

    public static void printEmployee(Employee[] emp, boolean isTax) {
        System.out.println("name department salary extra pay");
        System.out.println("--------------------------------------------------------");

        for (Employee e : emp) {
            System.out.print(e.getName() + "  " + e.getDepartment() + "  "
            		 + e.getSalary());

            if (e instanceof Sales) {
                System.out.print("  " + ((Sales) e).getExtraPay());
            }

            System.out.println();
        }

        if (isTax) {
            System.out.println("\nname department salary tax extra pay");
            System.out.println("--------------------------------------------------------");

            for (Employee e : emp) {
                System.out.print(e.getName() + "  " + e.getDepartment() + "  " + e.getSalary() + "  " + e.tax());

                if (e instanceof Sales) {
                    System.out.print("  " + ((Sales) e).getExtraPay());
                }

                System.out.println();
            }
        }
    }
}