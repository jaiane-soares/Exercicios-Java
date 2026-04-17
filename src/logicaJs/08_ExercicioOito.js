let limite = parseInt(prompt("Exibir Fibonacci até:"));
let a = 0, b = 1, proximo = 0;

while (proximo <= limite) {
    console.log(proximo);
    a = b;
    b = proximo;
    proximo = a + b;
}