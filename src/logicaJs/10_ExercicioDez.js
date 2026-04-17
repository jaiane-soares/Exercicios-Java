let contador = 1;
let a = 0, b = 1;

while (contador <= 20) {
    console.log(a);
    let proximo = a + b;
    a = b;
    b = proximo;
    contador++;
}