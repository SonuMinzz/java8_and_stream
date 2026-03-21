import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {

    public List<Employee> getEmployees() {

        return Stream.of(
                new Employee(101, "rahul", 50000, "IT", 25, "M"),
                new Employee(102, "mohan", 60000, "IT", 28, "M"),
                new Employee(103, "reeta", 70000, "HR", 23, "F"),
                new Employee(104, "babita", 40000, "HR", 29, "F"),
                new Employee(105, "amit", 50000, "SALES", 20, "M")
        ).collect(Collectors.toList());
    }
}
