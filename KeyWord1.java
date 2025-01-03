import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        int duplicate = 0;
        for(int i=0; i<n; i++){
            for(int ii=0; ii<n; ii++){

                if(str[i] == ""){
                    break;
                }

                if(str[i].equalsIgnoreCase(str[ii]) && duplicate == 1){
                    str[ii] = "";
                }else if(str[i].equalsIgnoreCase(str[ii]) && str[ii] != ""){
                    duplicate = 1;
                    System.out.print(str[i] + " ");
                }
            }
            duplicate=0;
        }
    }
}
