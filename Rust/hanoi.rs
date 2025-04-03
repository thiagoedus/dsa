fn hanoi(n: i32, a: char, b: char, c: char) {
    if n > 0 {
        hanoi(n-1, a, c, b);
        println!("Mover o disco do topo de {} para {}", a,  b);
        hanoi(n-1, c, b, a);
    }
}

fn main() {
    hanoi(3, 'A', 'B', 'C');
}
