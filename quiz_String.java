import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String map = scanner.nextLine();            //ให้ตำแหน่งของตัวอักษรแต่ละตัวมา 26 ตัว
        String str = scanner.nextLine();            //ป้อนข้อความที่เข้ารหัส

        int[] ch = new int[27];                     //
        for(int i=0; i<map.length(); i++){          //แยกข้อความจาก map ให้เป็นตัวอักษรแต่ละตำแหน่ง
            ch[i] = map.charAt(i);                  //
        }                                           //

        ch[26] = '_';                               //กรณีเจอเว้นวรรค

        int[] code = new int[str.length()];         //สร้างตัวเก็บโค้ดไว้แปลงทีหลัง
        int count=0;                                //ไว้นับจำนวนตัวอักษรที่จะแสดงผล (รวม '_' ด้วย) 
        boolean check=false;                        //check ตัวนี้เอาไว้เช็คว่าเจอตัวเลขที่ติดกันหรือยัง
        for(int i=1; i<str.length(); i++){                                                                              
            if((str.charAt(i-1) < 'A' || str.charAt(i-1) > 'Z') && (str.charAt(i) < 'A' || str.charAt(i) > 'Z')){       //ให้ i เริ่มต้นที่ 1 จากนั้นเช็คว่าตัวอักษรที่ตำแหน่ง i-1 และ i ต้องไม่อยู่ใน A-Z
                code[count] = Integer.parseInt(str.substring(i-1, i+1));                                                //เมื่อเข้ากรณีนี้แล้ว ให้แปลงจาก String เป็น Int เช่น '03' -> 3
                i++;                                                                                                    //ให้ +i เพิ่มเพราะถ้าไม่ทำมันจะไปเช็คตัวอักษรที่เคยเช็คไปแล้วก่อนหน้า
                count++;                                                                                                //เมื่อเจอตัวเลขติดกันแล้ว จึงให้ check = true
                check = true;                                                                                              
            }else if(check){            //เมื่อเช็คได้ว่า i-1 และ i ไม่ใช่ตัวเลข และเจอตัวเลขที่ติดกันแล้วก่อนหน้านั้น (check = true)
                code[count] = 26;       //แสดงว่าต้องใส่ '_' แทนการเว้นวรรค
                count++;
                check = false;          //ให้ check = false ดังเดิมเพื่อป้องกันเข้า else if ซ้ำ
            }
        }

        String result = "";             //สร้าง result ไว้แสดงผลทีเดียว
        for(int i=0; i<count; i++){     
            result += ch[code[i]];      //ให้เพิ่มตัวอักษรตามตำแหน่งของ code ที่เก็บมาไปเรื่อยๆ
        }

        System.out.println(result);     
    }
}
