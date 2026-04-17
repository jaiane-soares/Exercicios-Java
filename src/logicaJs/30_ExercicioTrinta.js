let soma = 0, qtd = 0, nome;
do {
    nome = prompt("Nome (ou 'fim' para sair):");
    if (nome.toLowerCase() !== "fim") {
        soma += parseInt(prompt(`Idade de ${nome}:`));
        qtd++;
    }
} while (nome.toLowerCase() !== "fim");
console.log("Média:", qtd > 0 ? soma / qtd : 0);