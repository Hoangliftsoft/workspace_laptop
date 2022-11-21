import java.util.Scanner;

public class demo18 {
    // ham dao nguoc(reverse)
    private static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev = rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    // ham dem so lan xuat hien
    private static void countSnt(int n){
        int reverse=reverse(n),coppy=n;
        int count_2 =0,count_3 =0,count_5 =0,count_7 =0;
        while(coppy!=0){
            int cup = coppy%10;
            if(cup == 2)    ++count_2;
            if(cup == 3)    ++count_3;
            if(cup == 5)    ++count_5;
            if(cup == 7)    ++count_7;
            coppy /=10;
        }
        while(reverse!=0){
            int cup=reverse%10;
            if(cup == 2&&count_2!=0)    {System.out.print("2 "+count_2+"\n"); count_2=0;}
            if(cup == 3&&count_3!=0)    {System.out.print("3 "+count_3+"\n"); count_3=0;}
            if(cup == 5&&count_5!=0)    {System.out.print("5 "+count_5+"\n"); count_5=0;}
            if(cup == 7&&count_7!=0)    {System.out.print("7 "+count_7+"\n"); count_7=0;}
            reverse/=10;
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n=scanner.nextInt();
        countSnt(n);

    }
}
