let limite = parseInt(prompt("Limite:"));
let a = 0, b = 1, prox = 0;
do {
    console.log(prox);
    a = b;
    b = prox;
    prox = a + b;
} while (prox <= limite);