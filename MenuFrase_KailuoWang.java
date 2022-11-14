import java.util.Scanner;

public class MenuFrase_KailuoWang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion = "";
        String frase = "";
        String enter = "";
        do{
            System.out.println("Opcion a - Añadir a la frase (añadiendo a la frase ya existente)");
            System.out.println("Opcion b - Indicar la ultima frase introducida");
            System.out.println("Opcion c - Indicar el número de palabras que tiene la frase");
            System.out.println("Opcion d - Indicar cuantas veces a aparece un carácter en la frase");
            System.out.println("Opcion e - Limpiar frase");
            System.out.println("Opcion s - Salir");
            System.out.print("Indique la opción que quiere realizar: ");
            opcion = sc.nextLine();
            switch (opcion)
            {
                case "a":
                    System.out.println("Introducir a la frase:");
                    String introducirFrase = sc.nextLine();
                    frase = frase + " " + introducirFrase;
                    System.out.println("Pulse la tecla ENTER para continuar....");
                    enter = sc.nextLine();
                    break;


                case "b":
                    System.out.println("La frase actualmente es: \""+frase+"\"");
                    System.out.println("Pulse la tecla ENTER para continuar....");
                    enter = sc.nextLine();
                    break;


                case "c":
                    System.out.println((frase.split(" ").length)-1);

                    System.out.println("Pulse la tecla ENTER para continuar....");
                    enter = sc.nextLine();
                    break;



                case "d":
                    String caracter = sc.nextLine();
                    System.out.println(frase.indexOf(caracter));


                    System.out.println("Pulse la tecla ENTER para continuar....");
                    enter = sc.nextLine();
                    break;



                case "e": System.out.println("e");



                    System.out.println("Pulse la tecla ENTER para continuar....");
                    enter = sc.nextLine();
                    break;



                case "s": System.out.println("s");
                
                
                
                    System.out.println("Pulse la tecla ENTER para continuar....");
                    enter = sc.nextLine();
                    opcion = "s";

                    break;
            }
        } while (opcion != "s");
        System.out.println("Hasta la proxima");

    }
}
