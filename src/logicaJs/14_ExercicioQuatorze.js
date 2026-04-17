let num = parseInt(prompt("Digite um número para o fatorial:"));
let resultado = 1, i = num;
while (i > 1) {
    resultado *= i;
    i--;
}
console.log(`O fatorial de ${num} é ${resultado}`);