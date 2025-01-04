import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        if(str.indexOf('A') < str.indexOf('Z')){
            System.out.println(str.substring(str.indexOf('A'), str.indexOf('Z') + 1));
        }else{
            for(int i=str.indexOf('A'); i>=str.indexOf('Z'); i--){
                System.out.print(str.charAt(i));
            }
        }
    }
}
