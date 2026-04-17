let num = parseInt(prompt("Número:"));
let i = 1, div = 0;
do {
    if (num % i === 0) div++;
    i++;
} while (i <= num);
console.log(div === 2 ? "Primo" : "Não é primo");