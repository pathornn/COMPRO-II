import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int count=1, longest=1;
        int start=0, startLongest=1, stop=0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1) || str.charAt(i) == str.charAt(i-1) + 1){
                if(count == 1){
                    start=i;
                }
                count++;
            }else{
                if(count > longest){
                    longest = count;
                    startLongest = start;
                    stop = i;
                }
                count=1;
            }
        }

        if(count > longest){
            longest = count;
            startLongest = start;
            stop = str.length();
        }
        
        System.out.println(longest);
        if(longest == 1){
            System.out.println(str.substring(0, 1));
        }else{
            System.out.println(str.substring(startLongest-1, stop));
        }
        

    }
}
