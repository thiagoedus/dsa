#include <iostream>
#include <random>
#include <cstdio>

int sequentialSearch(int* vetor, int tam, int n) {
    for (int i = 0; i < tam; i++) {
        if (n == vetor[i]) {
            printf("\n%d encontrado na posição %d", n, i);
            return n;
        }
    }
    printf("\nElemento não encontrado no vetor");
    return -1;
}

int main()
{
    
    int tam = 16;
    int* vetor = new int[tam];
    
    for (int i = 0; i < tam; i++) {
        vetor[i] = rand() % 30;
        printf("%d ", vetor[i]);
    }
    
    sequentialSearch(vetor, tam, 23);
    
    delete[] vetor;

    return 0;
}
