import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == ch1 && str.charAt(i) == ch2){
                System.out.print(i + " ");
                i++;
            }else if(str.charAt(i-1) == ch2 && str.charAt(i) == ch1){
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
