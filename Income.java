import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();

        int order = scan.nextInt();
        int[][] map = new int[row][col];
        for(int i=0; i<order; i++){
            int point_row = scan.nextInt();
            int point_col = scan.nextInt();

            int size_row = scan.nextInt();
            int size_col = scan.nextInt();

            if(point_row-1 < 0 || point_row-1 > row || point_col-1 < 0 || point_col - 1> col || point_row + size_row - 1 > row || point_col + size_col - 1 > col){
                continue;
            }else{
                boolean avaliable = true;
                for(int ii=point_row-1; ii<point_row + size_row - 1; ii++){
                    for(int iii=point_col-1; iii<point_col + size_col - 1; iii++){
                        if(map[ii][iii] == 1) avaliable = false; 
                    }
                }
    
                if(avaliable == true){
                    for(int ii=point_row-1; ii<point_row + size_row - 1; ii++){
                        for(int iii=point_col-1; iii<point_col + size_col - 1; iii++){
                            map[ii][iii] = 1;
                        }
                    }
                }
            }

        }

        int[][] price = new int[row][col];
        int sum=0;
        for(int i=0; i<row; i++){
            for(int ii=0; ii<col; ii++){
                price[i][ii] = scan.nextInt();
                sum += price[i][ii]*map[i][ii];
            }
        }

        System.out.println(sum);
    }
}
