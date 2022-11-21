import java.util.Scanner;

public class demo25 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input characters: ");
        char characters = scanner.next().charAt(0);
        if(characters == 'z' || characters =='Z'){
            System.out.println("a");
        }else if(characters>='a' && characters<'z'){
            characters +=1;
            System.out.println(characters);
        }else if(characters >='A' && characters <'Z'){
            characters+=33;
            System.out.println(characters);
        }else{
            System.out.println("INVALID");
        }
    }
}
