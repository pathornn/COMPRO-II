import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int shortest = str1.length();
        if(str1.length() > str2.length()) shortest = str2.length();

        String result="";
        for(int i=0; i<shortest; i++){
            if((str1.charAt(i) == '(' || str1.charAt(i) == ')' || str1.charAt(i) == '{' || str1.charAt(i) == '}') && (str2.charAt(i) == '(' || str2.charAt(i) == ')' || str2.charAt(i) == '{' || str2.charAt(i) == '}')){
                result += str1.charAt(i);    //เช็ค **วงเล็บ** string 1 และ string 2 
            }
            
            else if(Character.isDigit(str1.charAt(i)) == true && Character.isDigit(str2.charAt(i)) == true){
                result += str1.charAt(i);    //เช็ค **ตัวเลข** string 1 และ 2
            }
            
            else if(Character.isUpperCase(str1.charAt(i)) == true && Character.isUpperCase(str2.charAt(i)) == true){
                result += str1.charAt(i);    //เช็ค **ตัวอักษรพิมพ์ใหญ่** string 1 และ 2
            }
            
            else if(Character.isLowerCase(str1.charAt(i)) == true && Character.isLowerCase(str2.charAt(i)) == true){
                result += str1.charAt(i);    //เช็ค **ตัวอักษรพิมพ์เล็ก** string 1 และ 2
            }
            
            else if(str1.charAt(i) == '(' || str1.charAt(i) == ')' || str1.charAt(i) == '{' || str1.charAt(i) == '}'){
                result += str1.charAt(i);    //เช็ค **วงเล็บ** string 1
            }
            
            else if(str2.charAt(i) == '(' || str2.charAt(i) == ')' || str2.charAt(i) == '{' || str2.charAt(i) == '}'){
                result += str2.charAt(i);     //เช็ค **วงเล็บ** string 2
            }
            
            else if(Character.isDigit(str1.charAt(i)) == true){
                result += str1.charAt(i);     //เช็ค **ตัวเลข** string 1
            }
            
            else if(Character.isDigit(str2.charAt(i)) == true){
                result += str2.charAt(i);    //เช็ค **ตัวเลข** string 2
            }
            
            else if(Character.isUpperCase(str1.charAt(i))){
                result += str1.charAt(i);     //เช็ค **ตัวอักษรพิมพ์ใหญ่** string 1
            }
            
            else if(Character.isUpperCase(str2.charAt(i))){
                result += str2.charAt(i);    //เช็ค **ตัวอักษรพิมพ์ใหญ่** string 2
            }
        }

        System.out.println(result);
    }
}
