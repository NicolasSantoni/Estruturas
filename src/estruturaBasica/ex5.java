/*
 * Método para limpar a lista public void limpar();
 */
package estruturaBasica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ex5 {
    public static void main(String[] args) {
        Lista nomes = new Lista(1);
        Scanner lerDados = new Scanner(System.in);
        String ler;
        for (int i = 0; i < 5; i++) {
            System.out.println("Indique o "+(i+1)+"° nome:");
            ler = lerDados.next();
            nomes.adiciona(ler);
        }
        System.out.println("Limpando o array...");
        nomes.limpar();
        System.out.println(nomes);
    }
}
