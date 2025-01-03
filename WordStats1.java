import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] str = new String[n];

        String temp = scan.nextLine();

        for(int i=0; i<n; i++){
            str[i] = scan.nextLine();
        }

        int[] storage = new int[26];
        for(int i=0; i<n; i++){
            storage[str[i].charAt(0) - 'A']++;
        }

        for(int i=0; i<26; i++){
            if(storage[i] > 0) System.out.println(String.format("%c %d", 'A'+i, storage[i]));
        }
    }
}
