import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int royal_size = scan.nextInt();
        int[][] area = new int[royal_size + 6][royal_size + 6];
        int[][] posArea = new int[royal_size + 6][royal_size + 6];

        for(int i=0; i<royal_size + 6; i++){
            for(int ii=0; ii<royal_size + 6; ii++){
                area[i][ii] = -1;
            }
        }

        int wall_1 = 3, wall_2 = 3, count=0;
        while(wall_1 >= 0){
            for(int i=wall_1; i<wall_2 + royal_size; i++){
                for(int ii=wall_1; ii<wall_2 + royal_size; ii++){
                    if(area[i][ii] == -1) area[i][ii] = count;
                }
            }
            wall_1--;
            wall_2++;
            count++;
        }
        
        int colossus=0, armored=0, war_hammer=0, attack=0, deviant=0, survey=0;
        while(true){
            int pos_r = scan.nextInt();
            int pos_c = scan.nextInt();
            int titan = scan.nextInt();

            if(pos_r < 0 || pos_r >= royal_size + 6 || pos_c < 0 || pos_c >= royal_size + 6 || titan < 0 || titan > 9) break;

            posArea[pos_r][pos_c] = titan;
            if(area[pos_r][pos_c] != 0){
                switch (titan) {
                    case 9:
                        colossus++;
                        break;
                    case 8:
                        armored++;
                        break;
                    case 6:
                        war_hammer++;
                        break;
                    case 4:
                        attack++;
                        break;
                    case 1:
                        deviant++;
                        break;
                    default:
                        survey++;
                        break;
                }
            }
        }

        System.out.println("WALL MAP [" + ((royal_size + 6)*(royal_size + 6)) + "]");
        for(int i=0; i<royal_size + 6; i++){
            for(int ii=0; ii<royal_size + 6; ii++){
                System.out.print(posArea[i][ii] + " ");
            }
            System.out.println();
        }
        System.out.println("WALL MAP [" + ((royal_size + 6)*(royal_size + 6)) + "]");

        for(int i=0; i<royal_size + 6; i++){
            for(int ii=0; ii<royal_size + 6; ii++){
                if((posArea[i][ii] == 9 || posArea[i][ii] == 8 || posArea[i][ii] == 6 || posArea[i][ii] == 4 || posArea[i][ii] == 1)&& (area[i][ii] != 0)){
                    switch (area[i][ii]){
                        case 1:
                            System.out.print("Wall Sina ");
                            break;
                        case 2:
                            System.out.print("Wall Rose ");
                            break;
                        case 3:
                            System.out.print("Wall Maria ");
                            break;
                    }
                    System.out.print(i + " " + ii + " ");
                    switch (posArea[i][ii]) {
                        case 9:
                            System.out.println("Colossus Titan");
                            break;
                        case 8:
                            System.out.println("Armored Titan ");;
                            break;
                        case 6:
                            System.out.println("War Hammer Titan ");;
                            break;
                        case 4:
                            System.out.println("Attack Titan ");;
                            break;
                        case 1:
                            System.out.println("Deviant ");;
                            break;
                    }
                }
            }
        }


        System.out.println("Survey Corps " + survey);
        System.out.println("Deviant " + deviant);
        System.out.println("Attack Titan " + attack);
        System.out.println("War Hammer Titan " + war_hammer);
        System.out.println("Armored Titan " + armored);
        System.out.println("Colossus Titan " + colossus);
    }
}
