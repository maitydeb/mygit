import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class maxSalary {

    double salary;
    String name;

    maxSalary(double salary, String name){
        this.salary=salary;
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args){
        List<maxSalary> employeeList = new ArrayList<>();
        employeeList.add(new maxSalary(100000.0,"Debdep"));
        employeeList.add(new maxSalary(1000.0,"John"));

        Optional<maxSalary> result = employeeList.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));

        result.ifPresent(x->System.out.print("highest paying employee-->"+ x.getName() +" "+x.getSalary()));
    }
}