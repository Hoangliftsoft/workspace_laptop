import java.util.Scanner;

public class demo24 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input characters: ");
        char characters = scanner.next().charAt(0);

        if(characters>='a'&&characters<='z'){
            characters -=32;
            System.out.println(characters);
        }else{
            System.out.println(characters);
        }
    }
}
