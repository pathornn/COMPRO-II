import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int score1=0, score2=0;
        for(int i=0; i<str.length(); i++){
            if(i< str.length()/2){
                score1 += str.charAt(i) - 'A' + 1;
            }else{
                score2 += str.charAt(i) - 'A' + 1;
            }
        }

        System.out.println(score1);
        System.out.println(score2);
    }
}
