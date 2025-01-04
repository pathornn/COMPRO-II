import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int count=0, startIndex=-1;
        boolean start = true;
        for(int i=2; i<str.length(); i++){
            if(str.charAt(i) - 2 == str.charAt(i-2) && str.charAt(i) - 1 == str.charAt(i-1)){
                if(start){
                    start = false;
                    count++;
                    startIndex = i - 1;
                }else count++;
            }
        }

        System.out.println(count);
        System.out.println(startIndex);
    }
}
