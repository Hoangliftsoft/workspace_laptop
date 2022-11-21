import java.util.Scanner;

public class demo10 {

    // hàm kiểm tra số nguyên tố
    private static int is_snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0)  return 0;
        }
        return 1;
    }

    // hàm kiểm tra số tăng dần
    private static int is_so_tang_dan(int n){
        int cpy = n%10;
        n/=10;
        while(n!=0){
            int tmp = n%10;
            if(cpy <= tmp)  return 0;
            cpy = tmp;
            n/=10;
        }
        return 1;
    }


    // hàm kiểm tra số tăng dần
    private static int is_so_giam_dan(int n){
        int cpy = n%10;
        n/=10;
        while(n!=0){
            int tmp = n%10;
            if(cpy >= tmp)  return 0;
            cpy = tmp;
            n/=10;
        }
        return 1;
    }
    public static void main(String[] agrs){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int digit = scanner.nextInt();
        int count=0;
        for(int i=(int)Math.pow(10, digit-1);i<=Math.pow(10, digit);++i){
            if(is_snt(i)==1 && (is_so_tang_dan(i)==1 || is_so_giam_dan(i)==1)){
                ++count;
            }
        }
        System.out.println("--> Co "+count+" so tang giam");
        scanner.close();
    }
}
