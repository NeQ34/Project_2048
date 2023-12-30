package firstMileStone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X_SIZE = 3;
        int Y_SIZE = 3;
        int[][] map = new int[X_SIZE][Y_SIZE];
        map[1][1] = 4;
        map[1][2] = 4;
        map[2][1] = 4;
        map[2][2] = 2;

        displayMap(map);
        while(true){
            System.out.print("Podaj akcje:");String akcja = s.next();
            if(akcja.equals("lewo")) lewo();
            else if(akcja.equals("prawo")) prawo();
            else if(akcja.equals("gora")) gora();
            else if(akcja.equals("dol")) dol();
            else System.out.println("Bledne dane");
        }
    }
    public static void displayMap(int[][] map){
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.printf("%-8s",map[i][j]);
            }
            System.out.println();
        }
    }
    public static void lewo(){System.out.println("lewo");}
    public static void prawo(){System.out.println("prawo");}
    public static void gora(){System.out.println("gora");}
    public static void dol(){System.out.println("dol");}
}
