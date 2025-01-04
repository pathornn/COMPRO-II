import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int count=0;
        for(int i=2; i<str.length(); i++){
            if(str.charAt(i) - 2 == str.charAt(i-2) && str.charAt(i) - 1 == str.charAt(i-1)) count++;
        }

        System.out.println(count);
    }
}
