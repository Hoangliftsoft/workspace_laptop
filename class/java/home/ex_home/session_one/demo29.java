import java.util.Scanner;

public class demo29 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Day: ");
        int n = scanner.nextInt();

        int year = n/365;
        int week = (n-(year*365))/7;
        int day = n-(year * 365) - (week * 7);

        System.out.println("Year: "+year+"\nWeek: "+week+"\nDay: "+day);
    }
}
