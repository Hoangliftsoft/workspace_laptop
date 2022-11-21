package Btvn_1_11_Employee;

public class Employee{
    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id,String name,String department,double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setId(String val){
        this.id = val;
    }
    
    public String getId(){
        return this.id;
    }

    public String details(){
        return "ID : "+this.id+"\nName : "+this.name+"\nDepartment : "+department+"\nSalary : "+salary;
    }

}
