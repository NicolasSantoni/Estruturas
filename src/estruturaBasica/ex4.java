/*
 * Modificar o método que remove um elemento pelo índice para o último elemento removido public T remove();
 */
package estruturaBasica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ex4 {
    public static void main(String[] args) {
        Lista nomes = new Lista(1);
        Scanner lerDados = new Scanner(System.in);
        String ler;
        for (int i = 0; i < 5; i++) {
            System.out.println("Indique o "+(i+1)+"° nome:");
            ler = lerDados.next();
            nomes.adiciona(ler);
        }
        System.out.println("Removendo a última posição...");
        nomes.removeul();
        System.out.println(nomes);
    }
}
