package main
import "fmt"

func hanoi(n int, a, b, c rune) {
    if (n > 0) {
        hanoi(n-1, a, c, b)
        fmt.Println("Mover o disco do topo de", string(a), "para", string(b))
        hanoi(n-1, c, b, a)
    }
}

func main() {
    hanoi(3, 'A', 'B', 'C')
}
