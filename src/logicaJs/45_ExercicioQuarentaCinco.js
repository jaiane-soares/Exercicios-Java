let soma = 0, qtd = 0;
for (let nome = ""; nome.toLowerCase() !== "fim"; ) {
    nome = prompt("Nome (ou 'fim' para sair):");
    if (nome.toLowerCase() !== "fim") {
        soma += parseInt(prompt(`Idade de ${nome}:`));
        qtd++;
    }
}
console.log("Média das idades:", qtd > 0 ? soma / qtd : 0);