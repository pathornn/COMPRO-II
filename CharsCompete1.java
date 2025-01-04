import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char target1 = scan.next().charAt(0);
        char target2 = scan.next().charAt(0);
        int winScore = scan.nextInt();

        int score1=0, score2=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target1){
                score1++;
            }else if(str.charAt(i) == target2){
                score2++;
            }

            if(score1 == winScore || score2 == winScore) break;
        }

        if(score1 > score2){
            System.out.println(target1);
            System.out.println(score1 + " " + score2);
        }else if(score1 < score2){
            System.out.println(target2);
            System.out.println(score2 + " " + score1);
        }else{
            System.out.println("draw");
            System.out.println(score1 + " " + score2);
        }
    }
}
