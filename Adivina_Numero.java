/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Scanner
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Adivina_Numero {
    public static void main(String[] args) {
        int random_num = (int)(Math.random() * 100.0);
        int elegido_num = 120;
        int intentos = 0;
        
        while (random_num != elegido_num) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Adivina el n\u00famero (del 0 al 100):");
            elegido_num = entrada.nextInt();
            if (random_num == elegido_num) continue;
            System.out.println("#### N\u00famero incorrecto ####");
            if (random_num - 15 > elegido_num || elegido_num > random_num + 15) {
                System.out.println("INTENTOS: " + ++intentos);
                System.out.println("PISTA: Algo lejos a\u00fan!\n");
                continue;
            }
            if (random_num - 8 > elegido_num || elegido_num > random_num + 8) {
                System.out.println("INTENTOS: " + ++intentos);
                System.out.println("PISTA: Est\u00e1s cerca!\n");
                continue;
            }
            if (random_num - 1 > elegido_num || elegido_num > random_num + 1) {
                System.out.println("INTENTOS: " + ++intentos);
                System.out.println("PISTA: Est\u00e1s muy CERCA!!!\n");
                continue;
            }
            if (random_num - 1 == elegido_num || elegido_num == random_num + 1) {
                System.out.println("INTENTOS: " + ++intentos);
                System.out.println("PISTA: CASI LO TIENES!!!\n");
                continue;
            }
            if (elegido_num <= 100 && elegido_num >= 0) continue;
            System.out.print("Escribe n\u00fameros del 0 al 100.\n");
        }
        System.out.println("############################");
        System.out.println("N\u00famero correcto, FELICIDADES!");
        System.out.println("############################");
    }
}

