fn sequentialSearch(vetor: &Vec<i32>, n: i32) -> i32 {
    for (i, valor) in vetor.iter().enumerate() {
        if *valor == n {
            println!("{} encontrado na posição {}", n, i);
            return i as i32;
        }
    }
    println!("Elemento {} não encontrado no vetor", n);
    -1
}


fn main() {

    let vetor = vec![21, 19, 4, 7, 17, 16, 23, 2, 13, 20, 7, 13, 24, 22, 1, 17];
    
    
    for v in &vetor {
        print!("{} ", v);
    }
    
    println!();
    
    sequentialSearch(&vetor, 21);

}
