let num = parseInt(prompt("Número:"));
let div = 0;
for (let i = 1; i <= num; i++) {
    if (num % i === 0) div++;
}
console.log(div === 2 ? "Primo" : "Não é primo");