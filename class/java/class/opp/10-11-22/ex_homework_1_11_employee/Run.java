package Btvn_1_11_Employee;

public class Run {
    public static void main(String[] agrs){
        Employee e = new Employee("1","Nguyen Van A","Phong A",8000);
        Manager m = new Manager("2", "Nguyen Van B","Phong B", 9000, "Title ", 1000);
        
        // Em ployee
        e.setId("2");
        System.out.println("ID : "+e.getId());
        System.out.println("Details : "+e.details());

        // Manager
        m.setTitle("Title New");
        System.out.println("Title : "+m.getTitle());
        System.out.println("Details : "+m.details());
    }
}
