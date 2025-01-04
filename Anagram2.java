import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int[] storage1 = new int[8];
        int[] storage2 = new int[8];  

        for(int i=0; i<str1.length(); i++){
            storage1[str1.charAt(i) - 'A']++;
        }
        for(int i=0; i<str2.length(); i++){
            storage2[str2.charAt(i) - 'A']++;
        }

        int count=0;
        for(int i=0; i<8; i++){
            System.out.print(storage1[i] + " ");
        }
        System.out.println();
        for(int i=0; i<8; i++){
            System.out.print(storage2[i] + " ");
        }
        System.out.println();

        int temp=0;
        for(int i=0; i<8; i++){
            if(storage1[i] == storage2[i]){
                System.out.print("0 ");
            }else{
                temp = storage1[i] - storage2[i];
                if(temp < 0) temp *= -1;
                System.out.print(temp + " ");
                count++;
            }
        }
        System.out.println();

        if(count > 3){
            System.out.println("no");
        }else{
            System.out.println("anagram");
        }
    }
}
