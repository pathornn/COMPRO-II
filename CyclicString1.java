import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int num = scanner.nextInt();
        int add = num - str.length();

        for(int i=0; i<num/str.length(); i++){
            System.out.print(str);
        }
        for(int i=0; i<num - num/str.length()*str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}
