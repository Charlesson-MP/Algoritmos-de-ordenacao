package Bubble;

public class BubbleSort {
    private int[] vetor;
    private int comparacoes;
    private int trocas;
    
    public BubbleSort(int[] vetor) {
        this.vetor = vetor;
        this.comparacoes = 0;
        this.trocas = 0;
    }

    public int[] getVetor() {
        return this.vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getComparacoes() {
        return this.comparacoes;
    }

    private void setComparacoes(int comp) {
        this.comparacoes = comp;
    }

    public int getTrocas() {
        return this.trocas;
    }

    private void setTrocas(int trocas) {
        this.trocas = trocas;
    }

    public void getSortStatus() {
        this.imprimirVetor();
        System.out.println("Comparacoes: " + this.getComparacoes());
        System.out.println("Trocas: " + this.getTrocas());
    }

    public void imprimirVetor() {
        System.out.println("<---------------------------->");
        for(int i = 0; i < this.getVetor().length; i++) {
            System.out.print(this.getVetor()[i] + " ");
        }
        System.out.println();
    }

    public void trocarElemento(int posicaoFinal, int posicaoInicial, int[] vetor) {
        int temp = vetor[posicaoFinal];
        vetor[posicaoFinal] = vetor[posicaoInicial];
        vetor[posicaoInicial] = temp;
        this.setTrocas(this.getTrocas() + 1);
        this.setVetor(vetor);
    }

    public void ordenar() {
        for(int i = 0; i < this.getVetor().length; i++) {
            for(int j = this.getVetor().length - 1; j > i; j--) {
                this.setComparacoes(this.getComparacoes() + 1);
                if(vetor[j] < vetor[j - 1])
                    trocarElemento(j, j - 1, this.getVetor());
            }
        }
    }
}