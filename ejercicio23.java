public class ejercicio23 {
    public static void main(String[] args) {
        
        int sumaTotal = 0;
        int cantidadNumero = 0;
        int numeroNuevo = 0;
        
        int maximo = 0;
        int minimo = 0;

        maximo = numeroNuevo;
        minimo = numeroNuevo;

        int numeroNuevo = (int)(Math.random()*1000);
        
        
        do {
        int numeroNuevo = (int)(Math.random()*1000);

        if (cantidadNumero == 0) 
        {
            maximo = numeroNuevo;
            minimo = numeroNuevo;
        }
        else
        {
            maximo = Math.max(maximo, numeroNuevo);
            minimo = Math.min(minimo, numeroNuevo);
        }

        } while (sumaTotal < 1000);
    }
}
