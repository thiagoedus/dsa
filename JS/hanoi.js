function hanoi(n, a, b, c) {
    if(n > 0) {
        hanoi(n-1, a, c, b);
        console.log(`Mover o disco do topo de ${a} para ${b}`)
        hanoi(n-1, c, b, a);
    }
}

hanoi(3, 'A', 'B', 'C');
