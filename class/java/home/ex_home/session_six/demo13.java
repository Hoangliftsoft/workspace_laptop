import java.util.Scanner;

public class demo13 {
    // ham ve hinh thoi
    private static void hthoi(int n){
        int count = 1;
        for(int i=1;i>=1;i+=count){
            for(int j=1;j<n+i;++j){
                if(j<=n-i){
                    System.out.print("~");
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
            if(i==n)
                count=-1;
        }
    }

    // private static void hthoi(int n){
    // Begin: hinh ben trai
        // int count_left=1;
        // outer: for(int i=1;i<=n;i+=count_left){
        //     if(i==0)    break outer;
        //     for(int j=n-i;j>=1;--j){
        //         System.out.print("~");
        //     }
        //     System.out.print("\n");
        //     if(i==n)
        //         count_left=-1;
        // }
    // End: hinh ben trai

    // Begin: hinh ben phai
        // int count_right=1;
        // for(int i=1;i>=1;i+=count_right){
        //     for(int j=2;j<=i*2;++j){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        //     if(i==n)    
        //         count_right=-1;
        // }
    // End: hinh ben phai
    // }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n= scanner.nextInt();
        hthoi(n);
    }
}
