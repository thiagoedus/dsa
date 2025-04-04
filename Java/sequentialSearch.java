import java.util.Random;

public class Main
{
    
    public static int sequentialSearch(int vetor[], int n) {
        for (int i = 0; i < vetor.length; i++) {
            if (n == vetor[i]) {
                System.out.printf("\n%d encontrado na posição %d", n, i);
                return i;
            }
        }
        System.out.printf("\nElemento %d não encontrado no vetor", n);
        return -1;
    }
    
	public static void main(String[] args) {
		
        Random rand = new Random();
        
        int[] vetor = new int[16];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(25);
            System.out.printf("%d ", vetor[i]);
        }
        
        sequentialSearch(vetor, 23);
        
	}
}

