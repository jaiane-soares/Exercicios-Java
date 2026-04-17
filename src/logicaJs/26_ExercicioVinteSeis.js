let limite = parseInt(prompt("Número:"));
let i = 1, soma = 0;
do {
    if (i % 2 === 0) soma += i;
    i++;
} while (i <= limite);
console.log(soma);