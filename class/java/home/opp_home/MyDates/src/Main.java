package MyDates.src;

public class Main {
    public static void main(String[] agrs){
        MyDate md1 = new MyDate(31, 1, 2021);
        MyDate md2 = new MyDate(31, 1, 2021);
        MyDate md3 = new MyDate(30, 1, 2021);
        // System.out.println("Day = "+md.getDay());
        // md.setDay(23);
        // System.out.println("Day = "+md.getDay());

        // System.out.println("Month = "+md.getMonth());
        // md.setMonth(7);
        // System.out.println("Month = "+md.getMonth());

        // System.out.println("Year = "+md.getYear());
        // md.setYear(4444);
        // System.out.println("Year = "+md.getYear());
        
        System.out.println("Date : "+md1);
        System.out.println("md1 so sanh md2: " + md1.equals(md2));
        System.out.println("md1 so sanh md3: " + md1.equals(md3));

        System.out.println("Hashcode : "+md1.hashCode());
        System.out.println("Hashcode : "+md2.hashCode());
        System.out.println("Hashcode : "+md3.hashCode());
        

    }
}
