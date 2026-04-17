let limite = parseInt(prompt("Limite Fibonacci:"));
for (let a = 0, b = 1, prox = 0; prox <= limite; prox = a + b) {
    console.log(prox);
    a = b;
    b = prox;
}