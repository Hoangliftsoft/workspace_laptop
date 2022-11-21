public class employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName(){
        return this.firstName+" "+this.lastName;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }

    public int RaiseSalary(int percent){
        return (this.salary+(this.salary*(percent/100)));
    }

    public String toString(){
        return "Id = "+this.id+", Name = "+this.firstName+this.lastName+", Salary = "+this.salary;
    }










    // public void setId(int id) {
    //     this.id = id;
    // }

    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }

    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }



}