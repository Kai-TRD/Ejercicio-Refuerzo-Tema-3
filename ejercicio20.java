import java.util.Scanner;

import javax.swing.SpinnerDateModel;
public class ejercicio20 {
    public static void main(String[] args) {
        /*     +
         *    + +
         *   +   +
         *  +++++++
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la piramide: ");
        int altura = sc.nextInt();
        sc.nextLine();
        System.out.print("Dime un caracter: ");
        String caracter = sc.nextLine();
        sc.close();

        int ancho = 1;
        int espacio = altura-1;

        for (int i = 1; i <= altura-1; i++) {
            
            for (int j = espacio; j > 0; j-=1) {
                System.out.print(" ");
            }
            System.out.print(caracter);

            for (int j = 0; j <= ancho-3; j++) {
                System.out.print(" ");
            }

            if (i > 1 ){
                System.out.print(caracter);
            }
            ancho = ancho + 2;
            espacio = espacio - 1;
            System.out.println();
        }



        for (int i = 0; i <= altura+altura - 2; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
