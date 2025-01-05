import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);

        int count=0, position=0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == ch1 && str.charAt(i) == ch2){
                position = i;
                count++;
                i++;
            }else if(str.charAt(i-1) == ch2 && str.charAt(i) == ch1){
                position = i;
                count++;
                i++;
            }else if((str.charAt(i-1) == ch1 || str.charAt(i-1) == ch2) && (str.charAt(i) != ch1 || str.charAt(i) != ch2)){
                count+=2;
            }else{
                if(count == 1){
                    System.out.print(position + " ");
                    count=0;
                }else{
                    count=0;
                }
            }
        }

        
        if(str.charAt(str.length()-2) == ch1 && str.charAt(str.length()-1) == ch2 && (str.charAt(str.length()-3) != ch1 && str.charAt(str.length()-3) != ch2)){
            System.out.println(str.length()-1);
        }else if(str.charAt(str.length()-2) == ch2 && str.charAt(str.length()-1) == ch1 && (str.charAt(str.length()-3) != ch1 && str.charAt(str.length()-3) != ch2)){
            System.out.println(str.length()-1);
        }
    }
}
