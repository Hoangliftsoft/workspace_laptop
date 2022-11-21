package kethuademo;

public class Student extends Person {
    private double mark;

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
    }
        
    public String result(){
        String t;
        if (mark<5)      t="Yeu";
        else if (mark<7) t="Trung binh";
        else if (mark<8) t="Kha";
        else             t="Gioi";
        return t;
    }
    
    @Override
    public String Hello(){
        return super.Hello()+"  I'm a student";
    }

    @Override
    public String toString() {
        return super.toString()+" result: "+result();
    }    
}
