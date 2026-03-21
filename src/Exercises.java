import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String args[])
    {

         EmployeeData employeeData=new EmployeeData();
        List<Employee>employeeList=employeeData.getEmployees();

       // System.out.println(employeeList);

        //Exercises:

/*
        //1️⃣ Find all employees in IT department
      employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("IT"))
              .collect(Collectors.toList()).forEach(s->System.out.println(s));

*/

        //2️⃣ Find employee with highest salary

   Employee employee=employeeList.stream().max((e1, e2)-> (int) (e1.getSalary()-e2.getSalary()))
           .orElseThrow(()->new RuntimeException("Issue in operation"));

   System.out.println((employee));




    }

}
