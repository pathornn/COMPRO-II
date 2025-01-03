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

        int[] longStr = new int[26];
        int[] shortStr = new int[26];
        for(int i=0; i<26; i++) shortStr[i] = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(longStr[str[i].charAt(0) - 'A'] < str[i].length()) longStr[str[i].charAt(0) - 'A'] = str[i].length();

            if(shortStr[str[i].charAt(0) - 'A'] > str[i].length()) shortStr[str[i].charAt(0) - 'A'] = str[i].length();
        }

        for(int i=0; i<26; i++){
            if(longStr[i] > 0) System.out.println(String.format("%c %d %d", 'A'+i, shortStr[i], longStr[i]));
        }
    }
}
