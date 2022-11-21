package Btvn_4_11_Write_intArray_class_in_opp_style;

import java.util.Scanner;

public class IntArray {
    private int n;
    private int[] a;

    public static Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.print("Nhap so phan tu: ");
        n = sc.nextInt();
        a = new int[100];
        for(int i=0;i<n;++i){
            System.out.print("a["+i+"]= ");
            a[i] = sc.nextInt();
        }
    }

    public void output(){
        System.out.print("Phan tu trong mang : ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }

    public void add(int vitri,int val){
        for(int i = n;i>vitri;--i){
            a[i] = a[i-1];
        }
        a[vitri] = val;
        n+=1;
        System.out.print("\nPhan tu trong mang sau khi add : ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }

    public void delete(int vitri){
        for(int i = vitri;i<n-1;++i){
            a[i] = a[i+1];
        }
        n-=1;
        System.out.print("\nPhan tu trong mang sau khi delete : ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }

    public void search(int vitri){
        System.out.println("\nVi tri "+vitri+" co gia tri la : "+a[vitri]);
    }

    public void tangDan(){
        for(int i=0;i<n-1;++i){
            for(int j=i+1;j<n;++j){
                if(a[i]>=a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.print("Mang tang dan : ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }

    public void giamDan(){
        for(int i=0;i<n-1;++i){
            for(int j=i+1;j<n;++j){
                if(a[i]<=a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.print("Mang giam dan : ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }


}
