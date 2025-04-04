import random

def sequentialSearch(vetor, n):
    for i in range(len(vetor)):
        if n == vetor[i]:
            print(f"{n} encontrado na posição {i}")
            return i
    print(f"Elemento {n} não encontrado no vetor")
    return -1

vetor = []

vetor = [random.randint(0, 25) for i in range(16)]

print(vetor)

sequentialSearch(vetor, 23)
