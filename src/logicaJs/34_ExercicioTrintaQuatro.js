let soma = 0;
for (let i = 1; i <= 5; i++) {
    soma += parseFloat(prompt(`${i}º número:`));
}
console.log("Média:", soma / 5);