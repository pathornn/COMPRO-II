import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int count=1, longest=1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1) || str.charAt(i) == str.charAt(i-1) + 1){
                count++;
            }else{
                if(count > longest) longest = count;
                count=1;
            }
        }

        if(count > longest) longest = count;
        System.out.println(longest);

    }
}
