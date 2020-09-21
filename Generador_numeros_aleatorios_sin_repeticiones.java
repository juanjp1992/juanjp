
import java.io.PrintStream;

public class Generador_numeros_aleatorios {
    public static void main(String[] args) {
        int[] n = new int[36];
        for (int i = 0; i < n.length; ++i) {
            int numero_random = (int)(Math.random() * 100.0);
            if (numero_random == n[i]) continue;
            n[i] = numero_random;
        }
        int ancho_matriz = n.length - 1;
        for (int j = 0; j <= n.length - 1; ++j) {
            int numero_random = (int)(Math.random() * 100.0);
            System.out.println("J =" + j + " ANCHO MATRIZ = " + ancho_matriz);
            if (n[j] == n[ancho_matriz] && j != ancho_matriz) {
                System.out.println("NUMERO REPETIDO, n[" + j + "] = n[" + ancho_matriz + "]");
                System.out.print("CAMBIADO = " + n[j] + " por ");
                n[j] = numero_random;
                System.out.print(String.valueOf((int)n[j]) + "\n");
                if (n[j] == n[ancho_matriz] && j != ancho_matriz) {
                    System.out.println("coincide as\u00ed que resto 1.");
                    --j;
                } else if (j == n.length - 1) {
                    System.out.println("Cambio");
                    j = 0;
                    --ancho_matriz;
                }
            }
            if (j != n.length - 1) continue;
            System.out.println("Cambio externo");
            if (j == n.length - 1 && ancho_matriz == 0) {
                j = n.length + 1;
                continue;
            }
            j = 0;
            --ancho_matriz;
        }
        System.out.println("#### NUMEROS ALEATORIOS SIN REPETICIONES ####")
        for (int z = 0; z < n.length; ++z) {
            System.out.println("VARIABLE n[" + z + "] = " + n[z]);
        }
    }
}

