package kethuademo;

public class KeThuaDemo {
    public static void main(String[] args) {
        
        Person p = new Person("Duy",19);
        System.out.println(p); //System.out.println(p.toString());
        System.out.println(p.Hello());
        
        Student s = new Student("Duy",19, 8.5);
        System.out.println(s);    
        System.out.println(s.Hello());
    }
}
