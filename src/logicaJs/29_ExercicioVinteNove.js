let num = parseInt(prompt("Número para fatorial:"));
let resultado = 1, i = num;
if (num < 0) {
    console.log("Não existe fatorial de número negativo.");
} else {
    do {
        if (num === 0) break;
        resultado *= i;
        i--;
    } while (i > 1);
    console.log(`Fatorial: ${resultado}`);
}