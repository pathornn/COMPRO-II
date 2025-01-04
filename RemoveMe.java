import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int order = scan.nextInt();
        for(int i=0; i<order; i++){
            int operate = scan.nextInt();
            String target = scan.next();

            if(str.indexOf(target) == -1){
                System.out.println(str);
                continue;
            }
            
            if(operate == 1){
                str = str.substring(0, str.indexOf(target)) + str.substring(str.indexOf(target) + target.length());
            }else{
                str = str.substring(0, str.lastIndexOf(target)) + str.substring(str.lastIndexOf(target) + target.length());
            }

            System.out.println(str);
        }
    }
}
