let i = 1, soma = 0;
do {
    prompt("Nome:");
    soma += parseInt(prompt("Idade:"));
    i++;
} while (i <= 5);
console.log("Média:", soma / 5);