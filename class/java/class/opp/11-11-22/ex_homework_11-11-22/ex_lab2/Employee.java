public class Employee extends Person{
    private double salary;

    public Employee(String name, int age, String address,double salary){
        super(name, age, address);
        this.salary = salary;
    }

    public double salary_calculation(){
        return salary;
    }

    public String detailsEmloyee() {
        return detailsPerson()+"\n+ Salary=" + salary;
    }

    

}
