/*
 * Criar o método que verifica se a lista está vazia public boolean estaVazia();
 */
package estruturaBasica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ex7 {
    public static void main(String[] args) {
        Lista nomes = new Lista(1);
        Scanner lerDados = new Scanner(System.in);
        String ler;
        System.out.println("Deseja adicionar algum nome? S/N");
        String s = lerDados.next();
        if (s.equals("S")||s.equals("s")) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Indique o "+(i+1)+"° nome:");
                ler = lerDados.next();
                nomes.adiciona(ler);
            }
        }
        if (nomes.estaVazia()==false) {
            System.out.println("O tamanho do array é "+nomes.tamanho());
        }
        else
            System.out.println("O array está vazio!");
    }
}
