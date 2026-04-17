let somaIdades = 0, qtd = 0, nome = "";
while (nome.toLowerCase() !== "fim") {
    nome = prompt("Digite o nome (ou 'fim' para sair):");
    if (nome.toLowerCase() !== "fim") {
        somaIdades += parseInt(prompt(`Idade de ${nome}:`));
        qtd++;
    }
}
console.log("Média das idades:", qtd > 0 ? somaIdades / qtd : 0);