import java.beans.EventSetDescriptor;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class piramide {
    public static void main(String[] args) {
        /*     +
         *    +++
         *   +++++
         *  +++++++
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura de la piramide: ");
//        int altura = sc.nextInt();
        int altura = 4;

        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= altura; j++) {
                System.out.print("*");
            }

            System.out.println("");
        
        }
    }
}
