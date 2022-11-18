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
            int partidasGanadas = 0;
            int partidasPerdidas = 0;

        //*******Zombies**********



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
        Boolean volverAJugar = true;
        while(volverAJugar == true){
            volverAJugar = true;
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
            sc.nextLine();
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
            int vidaAhoraConan = VIDACONAN;
            System.out.println("El arma elegida es: " + armaConan);


            int numeroZombies = (int)(Math.random()*6+5);
            System.out.println("Hay "+numeroZombies+" Zombies");
            System.out.println(" =========================");
            System.out.println("|| BATALLA               ||");
            System.out.println(" =========================");
            System.out.println("   Partidas ganadas: "+partidasGanadas);
            System.out.println("   Partidas perdidas: "+partidasPerdidas);
                final int DEFZOMBIE = 70;
                final int ATKZOMBIIE = 50;
                int sumaZombie = 1;

                //Combate
                while (numeroZombies > 0 && vidaAhoraConan > 0) 
                    {
                        System.out.println("---------------------Zombie "+sumaZombie);
                        //Ataca Conan---------------
                        double atacaConan = Math.random()*atkConan;
                        System.out.println("Conan - Ataca - "+(int)atacaConan);
                        
                        double defiendeZombie = Math.random()*DEFZOMBIE;
                        System.out.println("Zombie - Defiende - "+(int)defiendeZombie);
                        
                        if (atacaConan > defiendeZombie){
                            System.out.println("---Conan mató al zombie---");
                            numeroZombies--;
                            sumaZombie++;
                        } 
                        else
                        if (defiendeZombie > atacaConan){
                            System.out.println("---Zombie se defensio---");
                            double atacaZombie = Math.random()*ATKZOMBIIE;
                            System.out.println("Zombie - Ataca - "+(int)atacaZombie);

                            double defiendeConan = Math.random()*defConan;
                            System.out.println("Conan - Defiende - "+(int)defiendeConan);

                            if (atacaZombie < defiendeConan){
                                System.out.println("---Conan se defendio---");
                            }
                            if (defiendeConan < atacaZombie){
                                System.out.println("^^^^Conan recivio daño^^^^");
                                vidaAhoraConan--;
                                System.out.println("---------------------------Vida de conan "+vidaAhoraConan);
                            }
                        }
                    }
                if(vidaAhoraConan > 0){
                    partidasGanadas++;
                    System.out.println("Conan consiguio el tesoro!");
                    System.out.println("-------------------------------------");
                    System.out.println("⠀⠀⠀⠀⠀⠰⠿⠿⠿⢿⣿⣷⣶⣶⣶⣦⣤⣤⣤⣤⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⢰⣶⣦⠀⣶⣤⣤⣤⣤⣍⣉⣉⣉⡙⠛⠛⠛⠛⠏⣰⣿⡆⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⢿⡿⢠⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⣿⣿⣿⣿⣆⠸⣿⡇⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠘⡇⢸⣿⣿⣿⣿⣿⣿⣿⡏⠀⠹⠟⠙⣿⣿⣿⠄⢻⡇⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠊⣉⡉⢋⣩⡉⠻⠛⠁⣾⣀⣴⡀⢛⡉⢠⣷⠈⠇⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⣠⣼⣿⣿⣿⣿⣿⣷⣿⠀⢿⣿⣿⣿⡿⢁⠚⠛⠃⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠤⠾⠿⣿⡿⠛⣿⣿⣿⣿⣿⣷⣦⣌⣉⣉⣠⣾⡷⠂⣠⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⢰⣶⣶⣶⣦⠀⠀⣤⣌⣉⠉⣉⡙⠛⠛⠛⠻⠟⢁⣴⣾⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⣆⠻⣿⣿⢇⣸⠀⣯⢉⣿⠀⣿⣿⣿⣿⣿⣷⠀⣿⣿⣿⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⣿⣷⡔⠐⣾⣿⠀⠛⠚⠿⠀⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⠿⠋⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠰⣦⡄⠀⠀⠈⠉⠉⠉⠉⠛⠛⠛⠛⠻⠿⠿⠿⠿⠀⠛         ");
                } 
                
                else
                if(vidaAhoraConan <= 0){
                    partidasPerdidas++;
                    System.out.println("Conan ha muerto!");
                    System.out.println(" _______________");
                    System.out.println("|               |");
                    System.out.println("|   GAME OVER   |");
                    System.out.println(" _______________");
                }
                System.out.print("¿Quieres volver a jugar?(s/n): ");
                String preguntaVolverAjugar = sc.nextLine();
                if (preguntaVolverAjugar.equals("n")){volverAJugar = false;}
        }
        sc.close();
    }
}

