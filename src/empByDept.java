import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class empByDept {

    String name;
    String department;

    empByDept(String name,String department){
        this.name= name;
        this.department=department;
    }

    public String getName(){ return name;}
    public String getDepartment(){ return department;}

    public static void main(String[] args){
        // creating list of people having physics , chemistry, math department

        List<empByDept> all = new ArrayList<>();
        all.add(new empByDept("Debdep", "physics"));
        all.add(new empByDept("Piyush", "Math"));
        all.add(new empByDept("John", "chemistry"));
        all.add(new empByDept("Virat", "physics"));
        all.add(new empByDept("Sachin", "Math"));
        all.add(new empByDept("Sourav", "chemistry"));

        Map<String,List<empByDept>> groupByDept =  all.stream().collect(Collectors.groupingBy(empByDept::getDepartment));
        groupByDept.forEach((department, name) -> {
            System.out.println(department + ": " + name.stream()
                    .map(x->x.getName())
                    .collect(Collectors.joining(", ")));
        });



    }
}
