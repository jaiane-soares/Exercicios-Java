let somaIdades = 0;
for (let i = 1; i <= 5; i++) {
    prompt("Nome:");
    somaIdades += parseInt(prompt("Idade:"));
}
console.log("Média:", somaIdades / 5);