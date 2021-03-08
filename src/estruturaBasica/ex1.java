/**
 * Construtor que me permite omitir o tamanho da lista e construa uma lista com 10 elementos.
 */
package estruturaBasica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ex1 {
    public static void main(String[] args) {
        Lista nomes = new Lista(1);
        Scanner lerDados = new Scanner(System.in);
        String ler;
        for (int i = 0; i < 10; i++) {
            System.out.println("Indique o "+(i+1)+"° nome:");
            ler = lerDados.next();
            nomes.adiciona(ler);
        }
        System.out.println(nomes);
    }
}
