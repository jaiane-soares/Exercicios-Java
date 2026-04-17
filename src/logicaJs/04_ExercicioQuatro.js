let contador = 1;
let soma = 0;
while (contador <= 5) {
    let num = parseFloat(prompt(`Digite o ${contador}º número:`));
    soma += num;
    contador++;
}
console.log("A média é:", soma / 5);