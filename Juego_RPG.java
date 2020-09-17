
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Juego_RPG {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String wait_text = "";
        String nombre_pj = "";
        double vida_pj = 100.0;
        double game_over = 0.0;
        boolean win = false;
        System.out.println("?###############################");
        System.out.println("#   _           __ __ ?         # ");
        System.out.println("#  /_\\ |\\/||\\ ||_ |__ ||  ||\\/| #");
        System.out.println("# /   \\|  || \\||__ __|||__||  | #");
        System.out.println("#                               #");
        System.out.println("#################################");
        System.out.println("########## PULSA ENTER ##########");
        System.out.println("########## PARA EMPEZAR #########");
        System.out.println("#################################");
        wait_text = entrada.nextLine();
        while (vida_pj > 0.0) {
            String nombre_arma;
            System.out.println("Te despiertas y miras a tu alrededor,");
            wait_text = entrada.nextLine();
            System.out.println("no reconoces nada,");
            wait_text = entrada.nextLine();
            System.out.println("ves solo un lugar fr\u00edo y oscuro");
            wait_text = entrada.nextLine();
            System.out.println("con un ambiente algo h\u00famedo");
            wait_text = entrada.nextLine();
            System.out.println("solo ilumado por unas tenues luces");
            wait_text = entrada.nextLine();
            System.out.println("de unas piedras repartidas a lo ancho y largo de la cueva");
            wait_text = entrada.nextLine();
            System.out.println("que brillan en la oscuridad");
            wait_text = entrada.nextLine();
            System.out.println("...........");
            wait_text = entrada.nextLine();
            System.out.println("No recuerdas como llegaste hasta ah\u00ed...");
            wait_text = entrada.nextLine();
            System.out.println("+ \u00a1\u00bfComo me llamo?!.");
            wait_text = entrada.nextLine();
            System.out.println("ummm......");
            wait_text = entrada.nextLine();
            System.out.println("Haces un esfuerzo y un breve recuerdo");
            wait_text = entrada.nextLine();
            System.out.println("de tu persona te llega a la mente.");
            wait_text = entrada.nextLine();
            while (nombre_pj == "") {
                System.out.println("(Escribir) Nombre Personaje: ");
                nombre_pj = entrada.nextLine();
                if (nombre_pj != " ") continue;
                System.out.println("Incorrecto, Escribe tu nombre, Por favor");
            }
            System.out.println("+ Ah ya recuerdo, mi nombre es " + nombre_pj + "...");
            wait_text = entrada.nextLine();
            System.out.println("Te levantas como puedes, ");
            wait_text = entrada.nextLine();
            System.out.println("con movimientos a\u00fan un poco lentos ");
            wait_text = entrada.nextLine();
            System.out.println("y empiezas a andar a traves de la cueva. ");
            wait_text = entrada.nextLine();
            System.out.println("de camino, encuentras un cofre. ");
            wait_text = entrada.nextLine();
            System.out.println("lo abres y encuentras tres objetos. ");
            wait_text = entrada.nextLine();
            System.out.println("Una Espada, un Hacha y una Maza, ");
            wait_text = entrada.nextLine();
            System.out.println("debes elegir uno ya que son objetos muy pesados.\n");
            wait_text = entrada.nextLine();
            System.out.println("(Escribe)\n### ELIGE UNO ###\n1. Espada\n2. Hacha\n3. Maza\n");
            System.out.print("ELECCI\u00d3N: ");
            int cofre1 = entrada.nextInt();
            boolean espada = false;
            double dmg_espada = 0.3;
            boolean hacha = false;
            double dmg_hacha = 0.7;
            boolean maza = false;
            double dmg_maza = 0.5;
            switch (cofre1) {
                case 1: {
                    espada = true;
                    System.out.println("### A\u00f1adiste ESPADA al INVENTARIO ###\n");
                    wait_text = entrada.nextLine();
                    break;
                }
                case 2: {
                    hacha = true;
                    System.out.println("### A\u00f1adiste HACHA al INVENTARIO ###\n");
                    wait_text = entrada.nextLine();
                    break;
                }
                case 3: {
                    maza = true;
                    System.out.println("### A\u00f1adiste MAZA al INVENTARIO ###\n");
                    wait_text = entrada.nextLine();
                }
            }
            double dmg_arma = 0.0;
            if (espada) {
                dmg_arma = dmg_espada;
                nombre_arma = "espada";
            } else if (hacha) {
                dmg_arma = dmg_hacha;
                nombre_arma = "hacha";
            } else if (maza) {
                dmg_arma = dmg_maza;
                nombre_arma = "maza";
            }
            System.out.println("\u00a1De REPENTE escuchas algo!!");
            wait_text = entrada.nextLine();
            System.out.println("Un ruido que viene de m\u00e1s adelante, ");
            wait_text = entrada.nextLine();
            System.out.println("te armas de valent\u00eda y contin\u00faas el camino ");
            wait_text = entrada.nextLine();
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            wait_text = entrada.nextLine();
            System.out.println("Entre las sombras algo parece moverse,");
            wait_text = entrada.nextLine();
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            wait_text = entrada.nextLine();
            System.out.println("se distingue la silueta de un c\u00e1nido, ");
            wait_text = entrada.nextLine();
            System.out.println("unos ojos rojos aparecen, ");
            wait_text = entrada.nextLine();
            System.out.println("y en un abrir y cerrar de ojos, ");
            wait_text = entrada.nextLine();
            System.out.println("la bestia se abalanza sobre ti,  ");
            wait_text = entrada.nextLine();
            System.out.println("lanz\u00e1ndote bruscamente contra el suelo!!");
            wait_text = entrada.nextLine();
            int huida_monstruo = 0;
            double dmg_monstruo1 = Math.random() + 2.5;
            while (huida_monstruo < 6) {
                System.out.println("Entre forcejeo, debes elegir una opci\u00f3n:\n1. LIBERARTE y LUCHAR!\n2. RENDIRSE\n");
                System.out.print("ELECCI\u00d3N: ");
                int eleccion_monstruo = entrada.nextInt();
                dmg_monstruo1 = Math.random() + 2.5;
                System.out.println("");
                if (eleccion_monstruo == 1) {
                    huida_monstruo = (int)(Math.random() * 10.0);
                    if (huida_monstruo >= 5) continue;
                    System.out.print("#### No lograste escapar, el c\u00e1nido te inflingi\u00f3 ");
                    System.out.printf("%1.2f", new Object[]{dmg_monstruo1});
                    System.out.println(" de da\u00f1o. ####");
                    System.out.println("***************************");
                    System.out.print("**** Vida " + nombre_pj + ":");
                    System.out.printf("%1.2f", new Object[]{vida_pj -= dmg_monstruo1});
                    System.out.println(" *****");
                    System.out.println("***************************\n");
                    System.out.println("Vuelve a Intentarlo");
                    continue;
                }
                if (eleccion_monstruo != 2) continue;
                vida_pj = 0.0;
                huida_monstruo = 15;
            }
            if (vida_pj == 0.0) {
                System.out.println("...Elegiste la opci\u00f3n f\u00e1cil...\n");
            } else {
                System.out.println("Haciendo un gran esfuerzo\n");
                wait_text = entrada.nextLine();
                System.out.println("logras apartar al c\u00e1nido de encima tuyo");
                wait_text = entrada.nextLine();
                System.out.println("y coger el arma que se te hab\u00eda ca\u00eddo al suelo.");
                wait_text = entrada.nextLine();
                System.out.println("\u00a1\u00a1Ahora ha llegado el momento de LUCHAAR!!");
                wait_text = entrada.nextLine();
                double vida_monstruo = 100.0;
                while (vida_monstruo > 0.0 && vida_pj > 0.0) {
                    System.out.println("***************************");
                    System.out.print("**** Vida " + nombre_pj + ":");
                    System.out.printf("%1.2f", new Object[]{vida_pj});
                    System.out.println(" *****");
                    System.out.println("***************************\n");
                    System.out.println("ATAQUES:\n1. EMBESTIDA \n2. GOLPES FURIA\n3. BLOQUEAR\n");
                    System.out.print("ELECCI\u00d3N: ");
                    int ataque_pj = entrada.nextInt();
                    System.out.print("\n\n");
                    dmg_monstruo1 = Math.random() + 2.5;
                    boolean bloqueo_ataques = false;
                    switch (ataque_pj) {
                        case 1: {
                            double ataque_embestida = 15.3 + Math.random();
                            vida_monstruo -= dmg_arma + ataque_embestida;
                            System.out.print("**** Embestiste al enemigo y le causaste ");
                            System.out.printf("%1.2f", new Object[]{dmg_arma + ataque_embestida});
                            System.out.print(" de da\u00f1o. ****\n");
                            wait_text = entrada.nextLine();
                            if (vida_monstruo < 0.0) {
                                vida_monstruo = 0.0;
                            }
                            System.out.println("##################################");
                            System.out.print("###### Vida monstruo: ");
                            System.out.printf("%1.2f", new Object[]{vida_monstruo});
                            System.out.println(" ######");
                            System.out.println("##################################\n");
                            wait_text = entrada.nextLine();
                            break;
                        }
                        case 2: {
                            double ataque_golpesfuria = 5.8;
                            int num_golpes = (int)(Math.random() * 10.0 / 2.0) + 1;
                            vida_monstruo -= ataque_golpesfuria * (double)num_golpes;
                            System.out.print("**** Lograste golpearle " + num_golpes + " veces y le causaste ");
                            System.out.printf("%1.2f", new Object[]{ataque_golpesfuria * (double)num_golpes});
                            System.out.print(" de da\u00f1o. ****\n");
                            wait_text = entrada.nextLine();
                            if (vida_monstruo < 0.0) {
                                vida_monstruo = 0.0;
                            }
                            System.out.println("##################################");
                            System.out.print("###### Vida monstruo: ");
                            System.out.printf("%1.2f", new Object[]{vida_monstruo});
                            System.out.println(" ######");
                            System.out.println("##################################\n");
                            wait_text = entrada.nextLine();
                            break;
                        }
                        case 3: {
                            bloqueo_ataques = true;
                        }
                    }
                    if (!bloqueo_ataques) {
                        vida_pj -= dmg_monstruo1;
                        System.out.print(">>> El c\u00e1nido te inflingi\u00f3 ");
                        System.out.printf("%1.2f", new Object[]{dmg_monstruo1});
                        System.out.print(" de da\u00f1o. <<<<\n\n");
                        wait_text = entrada.nextLine();
                        continue;
                    }
                    System.out.println("**** C\u00e1nido te atac\u00f3, pero lo bloqueaste! ****\n\n");
                    wait_text = entrada.nextLine();
                }
                System.out.println("#### El enemigo cay\u00f3 al suelo, y ganaste este encuentro. ####\n");
                wait_text = entrada.nextLine();
                System.out.println("+ He de salir de aqu\u00ed como sea,");
                wait_text = entrada.nextLine();
                System.out.println("no s\u00e9 cuanto m\u00e1s lograr\u00e9 aguantar.");
                wait_text = entrada.nextLine();
                System.out.println("Continuas con tu camino por la gruta,");
                wait_text = entrada.nextLine();
                System.out.println("Hasta que te encuentras con que la cueva");
                wait_text = entrada.nextLine();
                System.out.println("se divide en tres caminos");
                wait_text = entrada.nextLine();
                boolean seleccion_ruta = false;
                while (!seleccion_ruta) {
                    System.out.println("\nELIGE UN CAMINO:\n1. IZQUIERDA\n2. CENTRO\n3. DERECHA\n");
                    System.out.print("ELECCI\u00d3N: ");
                    int camino_cueva = entrada.nextInt();
                    block10 : switch (camino_cueva) {
                        case 1: {
                            System.out.println("\nEliges ir por la izquierda\n");
                            wait_text = entrada.nextLine();
                            System.out.println("y esperas haber elegido bien...");
                            wait_text = entrada.nextLine();
                            System.out.println(".........");
                            wait_text = entrada.nextLine();
                            System.out.println("+ Este silencio me est\u00e1 matando.....");
                            wait_text = entrada.nextLine();
                            System.out.println("de repente llegas a un camino sin salida, ");
                            wait_text = entrada.nextLine();
                            System.out.println("pero te encuentras con un cofre.");
                            wait_text = entrada.nextLine();
                            System.out.println("\u00bfDeseas abrirlo?:\n1. ABRIR\n2. PASAR DEL COFRE");
                            System.out.print("ELECCI\u00d3N: ");
                            int cofre2 = entrada.nextInt();
                            System.out.println("");
                            switch (cofre2) {
                                case 1: {
                                    System.out.println("Encuentras una botella con un tono rojizo\n");
                                    wait_text = entrada.nextLine();
                                    System.out.println("y un dibujo de una hoja");
                                    wait_text = entrada.nextLine();
                                    System.out.println("grabado en el cristal.");
                                    wait_text = entrada.nextLine();
                                    System.out.println("Debes elegir que hacer con ella: \n1. BEBER\n2. DEJAR");
                                    System.out.print("ELECCI\u00d3N: ");
                                    int beber = entrada.nextInt();
                                    System.out.println("");
                                    switch (beber) {
                                        case 1: {
                                            System.out.println("Te la tomas y empiezas a sentirte m\u00e1s energico");
                                            wait_text = entrada.nextLine();
                                            System.out.println("***************************");
                                            System.out.print("**** Vida " + nombre_pj + ":");
                                            System.out.printf("%1.2f", new Object[]{vida_pj += 25.0});
                                            System.out.println(" *****");
                                            System.out.println("***************************\n");
                                            wait_text = entrada.nextLine();
                                            break block10;
                                        }
                                        case 2: {
                                            System.out.println("La dejas, cierras el cofre y vuelves atr\u00e1s en el camino");
                                            wait_text = entrada.nextLine();
                                        }
                                    }
                                    break block10;
                                }
                                case 2: {
                                    System.out.println("Cierras el cofre y vuelves atr\u00e1s en el camino");
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("\nEliges ir por el centro,");
                            wait_text = entrada.nextLine();
                            System.out.println("\npero algo empieza a no darte buena espina...");
                            wait_text = entrada.nextLine();
                            System.out.println(".........");
                            wait_text = entrada.nextLine();
                            System.out.println("Se empiezan a escuchar unos gru\u00f1idos...");
                            wait_text = entrada.nextLine();
                            System.out.println("+ Lo que me tem\u00eda...");
                            wait_text = entrada.nextLine();
                            System.out.println("que mala suerte!!");
                            wait_text = entrada.nextLine();
                            System.out.println("El c\u00e1nido empieza a acercarse r\u00e1pidamente hac\u00eda a ti,");
                            wait_text = entrada.nextLine();
                            System.out.println("es hora de luchar!");
                            wait_text = entrada.nextLine();
                            double vida_monstruo2 = 100.0;
                            while (vida_monstruo2 > 0.0 && vida_pj > 0.0) {
                                System.out.println("***************************");
                                System.out.print("**** Vida " + nombre_pj + ":");
                                System.out.printf("%1.2f", new Object[]{vida_pj});
                                System.out.println(" *****");
                                System.out.println("***************************\n");
                                System.out.println("ATAQUES:\n1. EMBESTIDA \n2. GOLPES FURIA\n3. BLOQUEAR\n");
                                System.out.print("ELECCI\u00d3N: ");
                                int ataque_pj = entrada.nextInt();
                                System.out.print("\n\n");
                                dmg_monstruo1 = Math.random() + 2.5;
                                boolean bloqueo_ataques = false;
                                switch (ataque_pj) {
                                    case 1: {
                                        double ataque_embestida = 15.3 + Math.random();
                                        vida_monstruo2 -= dmg_arma + ataque_embestida;
                                        System.out.print("**** Embestiste al enemigo y le causaste ");
                                        System.out.printf("%1.2f", new Object[]{dmg_arma + ataque_embestida});
                                        System.out.print(" de da\u00f1o. ****\n");
                                        wait_text = entrada.nextLine();
                                        if (vida_monstruo2 < 0.0) {
                                            vida_monstruo2 = 0.0;
                                        }
                                        System.out.println("##################################");
                                        System.out.print("###### Vida monstruo: ");
                                        System.out.printf("%1.2f", new Object[]{vida_monstruo2});
                                        System.out.println(" ######");
                                        System.out.println("##################################\n");
                                        wait_text = entrada.nextLine();
                                        break;
                                    }
                                    case 2: {
                                        double ataque_golpesfuria = 5.8;
                                        int num_golpes = (int)(Math.random() * 10.0 / 2.0) + 1;
                                        vida_monstruo2 -= ataque_golpesfuria * (double)num_golpes;
                                        System.out.print("**** Lograste golpearle " + num_golpes + " veces y le causaste ");
                                        System.out.printf("%1.2f", new Object[]{ataque_golpesfuria * (double)num_golpes});
                                        System.out.print(" de da\u00f1o. ****\n");
                                        wait_text = entrada.nextLine();
                                        if (vida_monstruo2 < 0.0) {
                                            vida_monstruo2 = 0.0;
                                        }
                                        System.out.println("##################################");
                                        System.out.print("###### Vida monstruo: ");
                                        System.out.printf("%1.2f", new Object[]{vida_monstruo2});
                                        System.out.println(" ######");
                                        System.out.println("##################################\n");
                                        wait_text = entrada.nextLine();
                                        break;
                                    }
                                    case 3: {
                                        bloqueo_ataques = true;
                                    }
                                }
                                if (!bloqueo_ataques) {
                                    vida_pj -= dmg_monstruo1;
                                    System.out.print(">>> El c\u00e1nido te inflingi\u00f3 ");
                                    System.out.printf("%1.2f", new Object[]{dmg_monstruo1});
                                    System.out.print(" de da\u00f1o. <<<<\n\n");
                                    wait_text = entrada.nextLine();
                                    continue;
                                }
                                System.out.println("**** C\u00e1nido te atac\u00f3, pero lo bloqueaste! ****\n\n");
                                wait_text = entrada.nextLine();
                            }
                            System.out.println("#### El enemigo cay\u00f3 al suelo, y ganaste este encuentro. ####\n");
                            wait_text = entrada.nextLine();
                            break;
                        }
                        case 3: {
                            seleccion_ruta = true;
                        }
                    }
                }
                win = true;
            }
            vida_pj = 0.0;
        }
        if (vida_pj <= 0.0 && !win) {
            System.out.println("#####################\n######GAME#OVER######\n#####################");
        } else if (vida_pj <= 0.0 && win) {
            System.out.println("###############################");
            System.out.println("FELICIDAAADEES! Lograste salir de la cueva!");
            wait_text = entrada.nextLine();
            System.out.println("Ahora solo te falta recordar... ");
            wait_text = entrada.nextLine();
            System.out.println("que hac\u00edas ah\u00ed y donde te encuentras ahora mismo....\n\n");
            System.out.println("~~ Continuar\u00e1 ~~");
            System.out.println("###############################");
            vida_pj = 150.0;
        } else {
            System.out.println("Algo va mal...");
        }
    }
}

