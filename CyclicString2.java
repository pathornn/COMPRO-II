import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int num = scanner.nextInt();
        int add = num - str.length();

        for(int i=0; i<num/str.length(); i++){
            if(i%2 == 0){
                System.out.print(str);
            }else{
                for(int ii=str.length()-1; ii>=0; ii--){
                    System.out.print(str.charAt(ii));
                }
            }
        }

        if((num/str.length())%2 == 0){
            for(int i=0; i<num - num/str.length()*str.length(); i++){
                System.out.print(str.charAt(i));
            }
        }else{
            for(int i=str.length() -1; i>=str.length() - (num - (num/str.length()*str.length())); i--){
                System.out.print(str.charAt(i));
            } 
        }
    }
}
