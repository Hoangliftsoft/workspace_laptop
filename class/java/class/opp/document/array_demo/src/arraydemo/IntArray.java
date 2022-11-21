package arraydemo;
import java.util.Scanner;

public class IntArray {
    private int[] a;
    private int n;
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
            n=sc.nextInt();
        a = new int[n];        
        for(int i=0;i<n;i++){
            System.out.print("nhap phan tu "+i+": ");
            a[i]=sc.nextInt();
        }
    }
    
    public  void sapXep(){
       for(int i=0;i<n;i++)
           for(int j=i+1;j<n;j++)
               if (a[i]>a[j]){
                   int t=a[i];
                   a[i]=a[j];
                   a[j]=t;
               }
   }
   
   public void xuat(){
      for(int i=0;i<n;i++)
            System.out.print("  "+ a[i]);
   }
   
   public int sum(){
       int t=0;
       for(int i=0;i<n;i++)     t+=a[i]; 
       return t;
   }
   
   public int demChan(){
       int dem=0;   
       for(int i=0;i<n;i++)
          if(a[i]%2==0) dem+=1;
       return dem;
   }
}
