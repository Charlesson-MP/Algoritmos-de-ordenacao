import Bubble.BubbleSort;

public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = {10, 5, 13, 2, 9, 8, 7, 4};
        BubbleSort bs = new BubbleSort(vetor);

        bs.imprimirVetor();
        bs.ordenar();
        bs.getSortStatus();
    }
}
