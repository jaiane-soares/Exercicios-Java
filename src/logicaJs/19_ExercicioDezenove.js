let i = 1, soma = 0;
do {
    soma += parseFloat(prompt(`${i}º número:`));
    i++;
} while (i <= 5)
console.log(soma / 5);