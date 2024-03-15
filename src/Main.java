

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Ezgi", "Kardes"));
        employees.add(new Employee(1, "Ezgi", "Kardes"));
        employees.add(new Employee(2, "Ozan", "Azazi"));
        employees.add(new Employee(2, "Zeki", "Müren"));
        employees.add(new Employee(3, "Okyanus", "Aydogan"));
        employees.add(new Employee(3, "Okyanus", "Aydogan"));
        employees.add(new Employee(4, "Can", "Ural"));
        employees.add(new Employee(5, "Osman", "ilhan"));


        Map<Integer, String> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();


        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee == null) {
                System.out.println("null data buldum");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), String.valueOf(employee));
            }
        }

        System.out.println("mevcut:");
        System.out.println(employees);
        System.out.println("tekiller: ");
        System.out.println(employeeMap);
        System.out.println("silinenler: ");
        System.out.println(removedEmployees);


    }


}