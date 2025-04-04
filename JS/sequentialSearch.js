function sequentialSearch(vetor, n) {
    for (let i = 0; i < vetor.length; i++) {
        if (n == vetor[i]) {
            console.log(`${n} encontrado na posição ${i}`);
            return i;
        }
    }
    
    console.log(`Elemento ${n} não encontrado no vetor`);
    return -1;
}

let vetor = [];
for (let i = 0; i < 16; i++) {
  vetor.push(Math.floor(Math.random() * 25) + 1); 
}

console.log(vetor);

sequentialSearch(vetor, 17)

