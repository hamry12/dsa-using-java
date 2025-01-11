package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

    private static List<Employee> employeeList;
    static {
        Project p1=new Project("P001", "Project1", "ABC", "Lead1");
        Project p2=new Project("P002", "Project2", "XYZ", "Lead3");
        Project p3=new Project("P003", "Project3", "PQR", "Lead2");
        Project p4=new Project("P004", "Project4", "MNO", "Lead4");
        Project p5=new Project("P005", "Project5", "ABC", "Lead1");
        Project p6=new Project("P006", "Project6", "PQR", "Lead3");

        employeeList= new ArrayList<>();
        employeeList.add(new Employee(1, "Gunja", "IT", Arrays.asList(p3,p1), 45897.0, "Female"));
        employeeList.add(new Employee(1, "Chandan", "IT", Arrays.asList(p4,p1,p5), 73000.0, "Male"));
        employeeList.add(new Employee(1, "Pallavi", "Design", Arrays.asList(p2,p4), 63000.0, "Female"));
        employeeList.add(new Employee(1, "Shivam", "Law", Arrays.asList(p3,p1), 39879.0, "Male"));
        employeeList.add(new Employee(1, "Pragati", "IT", Arrays.asList(p1), 57000.0, "Female"));
        employeeList.add(new Employee(1, "Chandranshu", "IT", Arrays.asList(p2,p3), 145897.0, "Male"));
        employeeList.add(new Employee(1, "Shradha", "QA", Arrays.asList(p5), 51000.0, "Female"));
        employeeList.add(new Employee(1, "Smriti", "SAP", Arrays.asList(p2), 93000.0, "Female"));
    }

    public static void main(String[] args) {
        System.out.println("For Each -->");
        employeeList.forEach(emp->{
            System.out.println(emp.getName()+"\t"+emp.getGender());
        });

        System.out.println("\n##Filter Method -->");
        List<Employee> filteredEmployee= employeeList
                .stream()
                .filter(emp->emp
                        .getDept()
                        .equalsIgnoreCase("IT") &&
                        emp.getSalary()>51000)
                .toList();

        filteredEmployee.forEach(System.out::println);

        System.out.println("\n ### Map--->");
        Set<String> departmnetList= employeeList.stream().map(Employee::getDept).collect(Collectors.toSet());
        System.out.println(departmnetList);

        System.out.println("##Project Names-->");
        List<Stream<String>> projectStreamList= employeeList
                .stream()
                .map(
                        emp->emp.getProjects()
                                .stream()
                                .map(Project::getName)
                ).toList();

        System.out.println("\n## FlatMap-->");
        List<String> projectList= employeeList.stream()
                .flatMap(emp->emp.getProjects().stream())
                .distinct()
                .map(Project::getName)
                .toList();
        System.out.println(projectList);

        System.out.println("\n## Sorted--->");
        List<Employee> sortedEmployee= employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .toList();
        System.out.println(sortedEmployee);

        System.out.println("\n## Min and Max");
        Optional<Employee> optMaxList = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(optMaxList.get());

        System.out.println("\n## GroupBy Gender");
        Map<String, List<Employee>> groupedList= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(groupedList);

        System.out.println("\n##Gender and their names");
        Map<String, List<String>> groupedGenderName= employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.mapping(Employee::getName, Collectors.toList())
                        )
                );
        System.out.println(groupedGenderName);

        System.out.println("\n##Gender and their counts");
        Map<String, Long> groupedGenederCount= employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()
                        )
                );
        System.out.println(groupedGenederCount);

        System.out.println("\n## Highest Salary From Each Department");
        Map<String, Optional<Employee>> collect = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        )
                );
        System.out.println(collect);
    }
}
