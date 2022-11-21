public class ql_sinhvien {
    public static void main(String[] agrs) {
        employee el = new employee(8,"Peter","Tan",2500);
        System.out.println(el);
        // el.setSalary(999);
        // System.out.println(el);
        // System.out.println(el.getId());
        // System.out.println(el.getFirstName());
        // System.out.println(el.getLastName());
        // System.out.println(el.getName());
        // System.out.println(el.getSalary());
        // System.out.println(el.getAnnualSalary());
        // System.out.println(el.RaiseSalary(50));
        // System.out.println(el.toString());

        el.setSalary(999);
        System.out.println(el);  // toString();
        System.out.println("id is: " + el.getId());
        System.out.println("firstname is: " + el.getFirstName());
        System.out.println("lastname is: " + el.getLastName());
        System.out.println("salary is: " + el.getSalary());
  
        System.out.println("name is: " + el.getName());
        System.out.println("annual salary is: " + el.getAnnualSalary()); // Test method
  
        // Test raiseSalary()
        System.out.println(el.RaiseSalary(10));
        System.out.println(el);


    }
}
