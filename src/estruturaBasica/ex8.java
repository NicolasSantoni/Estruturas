/*
 * Método que retorna o último índice que determinado elemento aparece na lista e retorna o índice, semelhante ao buscaElemento(),
 * porém lá ele encerra o método no momento que encontrar o elemento, aqui quero que ele continue pesquisando e encontre a última posição.
 * public int ultimaPosicaoElemento(T elemento);
 */
package estruturaBasica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ex8 {
    public static void main(String[] args) {
        Lista nomes = new Lista(1);
        Scanner lerDados = new Scanner(System.in);
        String ler;
        for (int i = 0; i < 5; i++) {
            System.out.println("Indique o "+(i+1)+"° nome:");
            ler = lerDados.next();
            nomes.adiciona(ler);
        }
        System.out.println("Indique o elemento a ser buscado:");
        ler = lerDados.next();
        if (nomes.ultimaPosicaoElemento(ler)>=0) {
            System.out.println("Elemento localizado pela última vez na posição "+nomes.ultimaPosicaoElemento(ler));
        }
        else{
            System.out.println("Elemento não localizado");
        }
    }
}
