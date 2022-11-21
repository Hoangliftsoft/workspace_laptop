import java.util.Scanner;

public class demo7 {
    // ham dao nguoc
    private static void doiViTri(int n,int []a){
        int i = 0;
        while(n!=0){
            a[i] = n%10;
            n/=10;
            ++i;
        }
        if(a[0]!=0){
            System.out.print(a[0]);
        }
        for(int j = i -2;j>=1;--j){
            System.out.print(a[j]);
        }
        System.out.print(a[i-1]);
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n= scanner.nextInt();
        int[] a = new int[n];
        doiViTri(n,a);
    }
}
