package Btvn_4_11_GradesStatistics;

public class ArrayRun {
    public static void main(String[] agrs){
        IntArray g = new IntArray();
        g.input();
        g.The_grades_are();
        System.out.print("\nThe average is : "+g.Average());
        System.out.print("\nThe miximum is : "+g.Minimum());
        System.out.print("\nThe maximum is : "+g.Maximum());

    }
}
