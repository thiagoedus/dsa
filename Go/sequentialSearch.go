package main
import (
    "fmt"
    "math/rand"
    "time"
)

func sequentialSearch(vetor[] int, n int) int {
    for i := 0; i < len(vetor); i++ {
        if (n == vetor[i]) {
            fmt.Printf("\n%d encontrado na posição %d", n, i)
            return i
        }
    }
    fmt.Printf("\nElemento %d não encontrado no vetor", n)
    return -1
}

func main() {
    rand.Seed(time.Now().UnixNano())

    var vetor[16]int
    
    for i := 0; i < len(vetor); i++ {
        vetor[i] = rand.Intn(25)
    }

    
    fmt.Println(vetor)
    
    sequentialSearch(vetor[:], 24)
    
}
