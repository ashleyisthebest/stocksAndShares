package stocksandshares;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Random;

public class StocksAndShares {

    static int[] xInt = new int[18];
    static int[] yInt = new int[18];
    static String[] yString = new String[18];

    static int yCoord[] = new int[18];

    public static void main(String[] args) {


        // Drawing the Y Axis
        for (int i = 0; i < yInt.length - 1; i++) {
            yString[i] = "┤";
        }

        // Drawing the X Axis 
        yString[yInt.length - 1] = "└";
        for (int i = 0; i < xInt.length - 1; i++) {
            yString[yInt.length - 1] = yString[yInt.length - 1] + "┬";
        }
        yString[yInt.length - 1] = yString[yInt.length - 1] + " " + xInt.length;

        generateCoordinate();
        addCoordinate();
        drawGraph();
       }
    

    public static void drawGraph() {

        // Prints the total Y axis num
        System.out.println(yInt.length);

        // Prints out each line of Y array
        for (int i = 0; i < yInt.length; i++) {
            System.out.println(yString[i]);
        }

    }

    public static void generateCoordinate() {

        Random random = new Random();

        for (int i = 0; i < yInt.length; i++) {
            yCoord[i] = random.nextInt(18);
        }

    }

    public static void addCoordinate() {

        for (int i = 0; i < xInt.length-1; i++) {
            
            // 
            for(int a = 0; a < yCoord[i]; a++){
                yString[i] = yString[i] + " ";
            }
           
            yString[i] = yString[i] + "×";
            
        }

    }

}
