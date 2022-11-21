package kethuademo;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String Hello(){
        return "Hi...my name "+name;
    }
    
    @Override
    public String toString() {
        return "Name=" + name + ", age=" + age;
    }
    
    
    
    
    
}
