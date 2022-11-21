package Btvn_1_11_Employee;

public class Manager extends Employee {
    private String title;
    private double position_allowance;

    public Manager(String id,String name,String department,double salary,String title,double position_allowance){
        super(id,name,department,salary);
        this.title = title;
        this.position_allowance = position_allowance;
    }
    
    public void setTitle(String val){
        this.title = val;
    }

    public String getTitle(){
        return this.title;
    }

    public String details(){
        return "Title : "+title+"\nPosition Allowance : "+position_allowance;
    }

}
