import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        int[] storage1 = new int[8];

        for(int i=0; i<str1.length(); i++){
            storage1[str1.charAt(i) - 'A']++;
        }
        for(int i=0; i<8; i++){
            System.out.print(storage1[i] + " ");
        }
    }
}
