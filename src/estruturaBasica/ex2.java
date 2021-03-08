/*
 * Método que pesquisa e diz se existe ou não public boolean contem();
 */
package estruturaBasica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ex2 {
    public static void main(String[] args) {
        Lista nomes = new Lista(1);
        Scanner lerDados = new Scanner(System.in);
        String ler;
        for (int i = 0; i < 5; i++) {
            System.out.println("Indique o "+(i+1)+"° nome:");
            ler = lerDados.next();
            nomes.adiciona(ler);
        }
        System.out.println("Indique o nome a ser procurado:");
        ler = lerDados.next();
        if (nomes.contem(ler)==true) {
            System.out.println("O nome existe na lista!");
        }
        else
            System.out.println("O nome não existe na lista!");
    }
}
