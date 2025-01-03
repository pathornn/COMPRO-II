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
        int[] count = new int[n];
        for(int i=0; i<n; i++){
            for(int ii=0; ii<n; ii++){
                if(str[i] == ""){
                    break;
                }

                if(str[i].equalsIgnoreCase(str[ii]) && duplicate == 1){
                    str[ii] = "";
                    count[i]++;
                }else if(str[i].equalsIgnoreCase(str[ii])){
                    duplicate = 1;
                    count[i]++;
                    System.out.print(str[i] + " ");
                }
            }
            duplicate=0;
        }

        System.out.println();

        int maxCount=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(count[i] > maxCount) maxCount = count[i];
        }

        System.out.print(maxCount + " ");
        for(int i=0; i<n; i++){
            if(count[i] == maxCount) System.out.print(str[i] + " ");
        }
    }
}
