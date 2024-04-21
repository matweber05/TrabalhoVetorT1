import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {200000, 400000, 600000, 800000, 1000000, 1200000, 1400000};
        int numTestes = 20;

        for (int size : sizes) { // Laço feito para iterar cada elemento do vetor size
            System.out.println("Tamanho do vetor: " + size);
            for (int i = 0; i < numTestes; i++) {
                int[] arr = generateRandomArray(size);

                int startTime = System.currentTimeMillis();
                bubbleSort(arr); // Testando o método Bubblesort
                int endTime = System.currentTimeMillis();

                int duration = endTime - startTime;
                System.out.println("Teste " + (i + 1) + ": " + duration + " ms");
            }
            System.out.println();
        }
    }

    // Gerando vetor aleátorio
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    // Método BubbleSort para ordenação do vetor
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // troca arr[j+1] e arr[i] de posição, ordenando o vetor
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      public static int buscaSimples (int[] arr, int elemento) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemento) {
                return i; // Retorna o índice do valor se encontrado
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
}
