import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int player = scan.nextInt();
        char[] team1 = new char[player];
        char[] team2 = new char[player];
        for(int i=0; i<player; i++){
            team1[i] = scan.next().charAt(0);
        }
        for(int i=0; i<player; i++){
            team2[i] = scan.next().charAt(0);
        }
        int winScore = scan.nextInt();

        int score1=0, score2=0;
        for(int i=0; i<str.length(); i++){
            for(int ii=0; ii<player; ii++){
                if(str.charAt(i) == team1[ii]) score1++;
            }
            for(int ii=0; ii<player; ii++){
                if(str.charAt(i) == team2[ii]) score2++;
            }

            if(score1 == winScore || score2 == winScore) break;
        }

        if(score1 > score2){
            System.out.println("1");
            System.out.println(score1 + " " + score2);
        }else if(score1 < score2){
            System.out.println("2");
            System.out.println(score2 + " " + score1);
        }else{
            System.out.println("draw");
            System.out.println(score1 + " " + score2);
        }
    }
}
