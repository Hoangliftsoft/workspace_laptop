import java.util.Scanner;

public class demo15 {
    // ham tong chu so
    private static int tongChuSo(int n){
        int sum=0;
        while(n!=0){
            int cup = n%10;
            sum+=cup;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input FirstNumber: ");
        int fir=scanner.nextInt();
        System.out.print("Input SecondNumber: ");
        int sec=scanner.nextInt();

        if(tongChuSo(fir)==tongChuSo(sec)){
            System.out.print(fir+" "+sec);
        }else if(tongChuSo(fir)<tongChuSo(sec)){
            System.out.print(fir+" "+sec);
        }else if(tongChuSo(fir)>tongChuSo(sec)){
            System.out.print(sec+" "+fir);
        }

    }
}
