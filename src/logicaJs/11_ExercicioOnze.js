let limite = parseInt(prompt("Digite um número:"));
let i = 1, soma = 0;
while (i <= limite) {
    if (i % 2 === 0) soma += i;
    i++;
}
console.log("Soma dos pares:", soma);