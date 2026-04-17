let contador = 1;
let somaIdades = 0;

while (contador <= 5) {
    let nome = prompt(`Nome da ${contador}ª pessoa:`);
    let idade = parseInt(prompt(`Idade de ${nome}:`));
    somaIdades += idade;
    contador++;
}
console.log("A média das idades é:", somaIdades / 5);