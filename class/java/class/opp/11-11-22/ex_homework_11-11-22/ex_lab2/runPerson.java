public class runPerson {
    public static void main(String[] agrs){
        Person p = new Person("Person",19,"AddressPerson");
        Employee e = new Employee("Employee", 20, "AddressEmployee",8000);

        // Person
        System.out.println("Details : "+p.detailsPerson());


        // Employee
        System.out.println("\nSalary : "+e.salary_calculation());
        System.out.println("Details Employee: "+e.detailsEmloyee());
    }
}
 