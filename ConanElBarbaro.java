import java.util.Scanner;

public class ConanElBarbaro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //************ASIGNACIONES**************
            //Vida de Conan
            final int VIDACONAN = 4;
            int atkConan = 0;
            int defConan = 0;
            String armaConan = "";
        
        //*******Zombies**********
            int numeroZombies = (int)(Math.random()*6+5);


        //*******ARMAS**********
            //Espada de 2 manos
            final int atkEspada2Manos = 60;
            final int defEspada2Manos = 40;
            //Hacha
            final int atkHacha =70;
            final int defHacha =30;
            //Espada corta y escudo
            final int atkEspadaMasEscudo = 30;
            final int defEspadaMasEscudo = 70;
        System.out.println(" ===============================");
        System.out.println("||   Escoje tu arma            ||");
        System.out.println(" ===============================");
        System.out.println("|| 1. Espada de dos manos      ||");
        System.out.println("||     atk:"+atkEspada2Manos+"   def:"+defEspada2Manos+"         ||");
        System.out.println("|| 2. Hacha                    ||");
        System.out.println("||     atk:"+atkHacha+"   def:"+defHacha+"         ||");
        System.out.println("|| 3. Espada corta con escudo  ||");
        System.out.println("||     atk:"+atkEspadaMasEscudo+"   def:"+defEspadaMasEscudo+"         ||");
        System.out.println(" ===============================");
        System.out.print("Selecciona una de las opciones: ");
        int elegirArma = sc.nextInt();
        switch (elegirArma){
            case 1: 
                atkConan = atkEspada2Manos;
                defConan = defEspada2Manos;
                armaConan = "Espada de dos manos";
                break;
            case 2:
                atkConan = atkHacha;
                defConan = defHacha;
                armaConan = "Hacha";
                break;
            case 3:
                atkConan = atkEspadaMasEscudo;
                defConan = defEspadaMasEscudo;
                armaConan = "Espada corta con escudo";
                break;
        }
        System.out.println("El arma elegida es: " + armaConan);
            boolean zombieMuerto = false;
            final int VIDAZOMBIE = 1;
            final int DEFZOMBIE = 70;
            final int ATKZOMBIIE = 50;

            //Combate
            for (int i = 0; i < numeroZombies; i++) {
                //Ataca Conan
                while(zombieMuerto == false)
                {
                    int atacaConan = (int)Math.random()*atkConan;
                    int defiendeZombie = (int)Math.random()*DEFZOMBIE;
                    defiendeZombie = DEFZOMBIE-atacaConan;
                    if (defiendeZombie < 0){
                        zombieMuerto = true;
                        
                    }
                }
                













            }





    }
}
