
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class emp_salary {

    //Q1. Filter Employees by Salary
    //Given a list of Employee objects, return all employees whose salary is greater than 50,000.

    String name;
    double salary;

    //method has same name of class for this operator
    emp_salary(String name,double salary){
     this.name=name;
     this.salary=salary;
    }

    // Create a method which return the employee
    public String getEmployee(){

    return name;
    }

    public Double getSalary(){

        return salary;
    }

    // main method
    public static void main(String[] args){

        // list of employee with salary
        List<emp_salary> emplist= new ArrayList<>();
        emplist.add(new emp_salary("Debdep",51000.0));
        emplist.add(new emp_salary("Piush",151000.0));
        emplist.add(new emp_salary("John",1000.0));
        emplist.add(new emp_salary("David",151.0));

        // employee list having salary above 50000
        List<emp_salary> filteredNameSalaryList = emplist.stream().filter(x->x.getSalary()>50000)
                .collect(Collectors.toList());

        //Printing result
        filteredNameSalaryList.forEach(x->System.out.print(x.getEmployee()+ " "));



    }

}
