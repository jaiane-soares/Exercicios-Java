let num = parseInt(prompt("Digite um número:"));
let i = 1;
let divisores = 0;

while (i <= num) {
    if (num % i === 0) {
        divisores++;
    }
    i++;
}

if (divisores === 2) {
    console.log(`${num} é primo.`);
} else {
    console.log(`${num} não é primo.`);
}