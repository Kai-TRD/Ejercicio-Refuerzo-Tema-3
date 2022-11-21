package masEjerciciosDeBucles;

import java.util.Scanner;

public class cifradoDescifrado {
    public static void main(String[] args) {
        /*
            Modifica el programa anterior para que aparezca un menú donde podremos elegir cifrar, descifrar y salir.
        */
        Scanner sc = new Scanner(System.in);

            System.out.println("===============================");
            System.out.println("  Eligue una de las opciones:");
            System.out.println("  ---------------------------");
            System.out.println("   1 - Cifrar");
            System.out.println("   2 - Descifrar");
            System.out.println("   3 - Salir");
            System.out.println("===============================");
            sc.nextInt();
            int opciones = sc.nextInt();

            switch (opciones){
            
                case 1:
                    sc.nextLine();
                    System.out.println("Escrieme un texto para cifrar:");
                    String texto = sc.nextLine();
                    System.out.println("Dime el factor para cifrar(int):");
                    int factor = sc.nextInt();
                    int caracteresTexto = texto.length();
                    int contador = 0;
                    System.out.println("================================");

                    char[] caracteres =texto.toCharArray();

                    System.out.print("\t"+factor);
                    while(contador < caracteresTexto){
                        
                        int cifrado = (int)(caracteres[contador])+factor;
                        char cifradoCaracter = (char)cifrado;
                        System.out.print(cifradoCaracter);
                        contador++;
                    }
                    System.out.println();
                break;

                case 2:
                sc.nextLine();
                System.out.println("Escrieme un texto para descifrar:");
                String textodescifrar = sc.nextLine();
                
                caracteresTexto = textodescifrar.length();
                contador = 1;
                System.out.println("================================");

                char[] caracteresDescifrar =textodescifrar.toCharArray();

                while(contador < caracteresTexto){
                    int factorDescifrado = caracteresDescifrar[0];
                    int descifrado = (int)(caracteresDescifrar[contador])-factorDescifrado;
                    char descifradoCaracter = (char)descifrado;
                    System.out.print(descifradoCaracter);
                    contador++;
                    
                break;







            }
        sc.close();
        }
    }
}
