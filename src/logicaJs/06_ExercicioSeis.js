let num = parseInt(prompt("Digite um número para ver seus divisores:"));
let i = 1;
while (i <= num) {
    if (num % i === 0) {
        console.log(i);
    }
    i++;
}