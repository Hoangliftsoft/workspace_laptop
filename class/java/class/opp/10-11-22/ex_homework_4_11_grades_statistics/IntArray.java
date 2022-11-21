package Btvn_4_11_GradesStatistics;

import java.util.Scanner;

public class IntArray {
    private int n;
    private int[] a;

    public static Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;++i){
            System.out.print("Enter the grade for student "+i+" : ");
            a[i] = sc.nextInt();
        }
    }

    public void The_grades_are(){
        System.out.print("The grades are: ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }

    public double Average(){
        double sum=0;
        for(int i =0;i<n;++i){
            sum+=a[i];
        }
        return (double)sum/n;
    }

    public int Minimum(){
        int min = a[0];
        for(int i=0;i<n;++i){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public int Maximum(){
        int max = a[0];
        for(int i=0;i<n;++i){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }





    
}
