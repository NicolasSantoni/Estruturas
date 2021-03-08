/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaBasica;

/**
 *
 * @author Nicolas
 */
public class Lista {
    private String[] elementos;
    private int tamanho;
    public Lista(int tamanhoInicial){
        tamanho = 0;
        elementos = new String[tamanhoInicial];
    }
    /**
     * Método que adiciona um elemento no final da lista
     * @param elemento elemento a ser adicionado
     * @return true caso o elemento seja adicionado a lista ou false em caso de algum erro
     */
    public boolean adiciona(String elemento){
        aumentaCapacidade();
        if(tamanho<elementos.length){
          elementos[tamanho] = elemento;
          tamanho++;
          return true;
        }
        return false;
    }
    /**
     * Adiciona um elemento a qualquer posição da lista, desde que ela seja válida
     * @param posicao posição da lista onde adicionar o elemento
     * @param elemento o elemento a ser adicionado na lista
     * @return true em caso de sucesso e lança uma IllegalArgumentException em caso de falha
     */
    public boolean adiciona(int posicao, String elemento){
        aumentaCapacidade();
        if (!(posicao>=0 && posicao<tamanho)) {
            throw new IllegalArgumentException(posicao+" não é uma posiçãp válida");
        }
        for (int i = tamanho-1; i >= posicao; i--) {
            elementos[i+1]=elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }
    /**
     * Permite remover um elemento de determinada posição
     * @param posicao posição que deseja apagar
     * @throws IllegalArgumentException caso a posição seja inválida
     */
    public boolean remove(int posicao){
        if (!(posicao>=0 && posicao<tamanho)) {
            throw new IllegalArgumentException(posicao+" não é uma posição válida");
        }
        for (int i = posicao; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return true;
    }
    /**
     * Método que busca um elemento pela posição no vetor
     * @param posicao pos~ção do elemento pesquisado
     * @return o elemento da posição, caso a posição seja inválida o método retorna um IllegalArgumentException
     */
    public String obterElemento(int posicao){
        if (!(posicao>=0 && posicao<tamanho)) {
            throw new IllegalArgumentException(posicao+" não é uma posiçãp válida");
        }
        return elementos[posicao];
    }
    /**
     * Método que pesquisa a posição de determinado elemento na lista
     * @param elemento elemento a ser buscado
     * @return a posição do elemento na lista ou -1 caso o elemento não seja encontrado
     */
    public int buscaElemento(String elemento){
        int retorno = -1;
        for (int i = 0; i < tamanho && retorno<0; i++) {
            if (elementos[i].equals(elemento)) {
                retorno = i;
            }
        }
        return retorno;
    }
    /**
     * Exercício 1: Construtor que me permite omitir o tamanho da lista
     */
    private void aumentaCapacidade(){
        if (tamanho==elementos.length) {
            String[] listaAux = new String[elementos.length*2];
//            System.arraycopy(elementos, 0, listaAux, 0, elementos.length);
            for (int i = 0; i < elementos.length; i++) {
                listaAux[i] = elementos[i];
            }
            elementos = listaAux;
        }
    }
    @Override
    public String toString(){
        String retorno = "[";
        if (tamanho>0) {
            for (int i = 0; i < tamanho-1; i++) {
                retorno+=elementos[i]+", ";
            }
            retorno+=elementos[tamanho-1]+"]";
        }
        else{
            retorno+="]";
        }
        return retorno;
    }
    /**
     * Exercício 2: Método que pesquisa e diz se existe ou não
     * @param elemento elemento a ser buscado
     * @return true se a string for encontrada ou false se não
     */
    public boolean contem(String elemento){
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Permite remover um elemento de determinada posição
     * @param posicao posição que deseja apagar
     * @throws IllegalArgumentException caso a posição seja inválida
     */
    public boolean remove(String pesquisa){
        int posicao = -1;
        for (int i = 0; i < 5; i++) {
            if (elementos[i].equals(pesquisa)) {
                posicao = i;
            }
        }
        if (posicao == -1) {
            throw new IllegalArgumentException("Este nome não existe na lista");
        }
        for (int i = posicao; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return true;
    }
    /**
     * Exercício 4: Modificar o método que remove um elemento pelo índice para o último elemento removido
     * @return true
     */
    public boolean removeul(){
        int t=0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i]==null&&t==0) {
                for (int j = 0; j < tamanho-1; j++) {
                    if (j==i) {
                        elementos[j]=elementos[i+1];
                    }
                    else
                        elementos[j] = elementos[j];
                }
                tamanho--;
                t=1;
            }
        }
        return true;
    }
    /**
     * Exercício 5: Método para limpar a lista
     */
    public void limpar(){
        for (int i = 0; i < elementos.length; i++) {
            elementos[i]=null;
        }
        tamanho=0;
    }
    /**
     * Exercício 6: Criar o método que retorne o tamanho da lista
     * @return tamanho da lista
     */
    public int tamanho(){
        return tamanho;
    }
    /**
     * Exercício 7: Criar o método que verifica se a lista está vazia
     * @return true se estiver vazia e false caso contrário
     */
    public boolean estaVazia(){
        if (tamanho==0) {
            return true;
        }
        return false;
    }
    /**
     * Exercício 8: Método que retorna o último índice que determinado elemento
     * @param elemento elemento a ser buscado
     * @return o último local encontrado do elemento
     */
    public int ultimaPosicaoElemento(String elemento){
        int retorno = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                retorno = i;
            }
        }
        return retorno;
    }
}
