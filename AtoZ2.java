import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int shortest=Integer.MAX_VALUE, distance=0;

        for(int i=0; i<str.length(); i++){
            if(str.indexOf('A', i) == -1) break;
            
            for(int ii=0; ii<str.length(); ii++){
                if(str.indexOf('Z', ii) == -1) break;
                
                distance = str.indexOf('A', i) - str.indexOf('Z', ii);
                if(distance < 0) distance *= -1;
                if(shortest > distance){
                    shortest = distance;
                } 
            }
        }

        System.out.println(shortest + 1);
    }
}
