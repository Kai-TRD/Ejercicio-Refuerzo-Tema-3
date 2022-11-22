import java.util.Scanner;

public class tandaDePenaltis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cantidadPenaltis = 10;
        String puntuacionJugador = "";
        int numGolJugador = 0;
        String puntuacionCPU = "";
        int numGolCPU = 0;
        int modo = 1;
        String tipo = "";
        int turno = 1;


        System.out.println("¿Cual es tu nombre?...");
        String nombre = sc.nextLine();
        System.out.println("");
        System.out.println("EMPIEZA LA TANDA DE PANALTIS");
        do{
            System.out.println("TURNO "+ turno);
            if(modo%2 == 0){
                tipo = " intenta parar";
            } else {
                tipo = " tira";
            }
            // char[] caracteres =puntuacion.toCharArray();
            System.out.println(nombre + " "+ "\t" + puntuacionJugador);
            System.out.println("CPU "+ "\t" + puntuacionCPU);
            System.out.println(nombre + tipo + " (I (izquierda), D (derecha) o C (centro))");
            String direccionPelota = sc.nextLine();
            int internDireccion = 0;
            switch(direccionPelota){
                case "I":
                    internDireccion = 1;
                break;
                case "D":
                    internDireccion = 2;
                break;
                case "C":
                    internDireccion = 3;
                break;
            }

            int defensaCPU = (int)(Math.random()*4);

            if (defensaCPU == internDireccion){
                System.out.println("-GOL DE " + nombre +"-");
                numGolJugador++;
                puntuacionJugador = puntuacionJugador + "O";
            }
            if (defensaCPU != internDireccion){
                System.out.println("-PARADA-");
                numGolCPU++;
                puntuacionCPU = puntuacionCPU + "O";
            }
            cantidadPenaltis--;
            modo ++;
            turno++;
            if ( cantidadPenaltis == 0 && numGolJugador == numGolCPU){
                cantidadPenaltis += 2;
            }
        }while (cantidadPenaltis !=0);

        System.out.println("========================");
        System.out.println(numGolJugador);
        System.out.println(numGolCPU);
        if (numGolJugador > numGolCPU){
            System.out.println("--Gana " + nombre+"--");
        }
        if (numGolJugador < numGolCPU){
            System.out.println("--Gana CPU--");
        }
    }
}
