function alterarStatus(id) {
    let gameClicado = document.getElementById(`game-${id}`);
    let imagem = gameClicado.querySelector(".dashboard__item__img");
    let botao = gameClicado.querySelector(".dashboard__item__button");


    if (imagem.classList.contains("dashboard__item__img--rented")) {
        let confirmarDevolucao = confirm("Você tem certeza que deseja devolver este jogo?");
        if (!confirmarDevolucao) {
            return; // Sai da função se o usuário cancelar
        }
        imagem.classList.remove("dashboard__item__img--rented");
        imagem.classList.add("dashboard__item__img");
    } else {
        imagem.classList.add("dashboard__item__img--rented");
    }

    if (botao.classList.contains("dashboard__item__button--return")) {
        botao.classList.remove("dashboard__item__button--return");
        botao.classList.add("dashboard__item__button");
        botao.textContent = "Alugar";
    } else {
        botao.classList.add("dashboard__item__button--return");
        botao.textContent = "Devolver";
    }

    contarJogosAlugados();
}

function contarJogosAlugados() {
    // Seleciona todos os itens da lista de jogos
    let jogos = document.getElementsByClassName("dashboard__items__item");
    let alugados = 0;

    // Percorre a lista e verifica se o jogo está alugado
    for (let i = 0; i < jogos.length; i++) {
        let imagem = jogos[i].querySelector(".dashboard__item__img");
        if (imagem.classList.contains("dashboard__item__img--rented")) {
            alugados++;
        }
    }

    // Imprime no console a quantidade de jogos alugados
    console.log(`Total de jogos alugados: ${alugados}`);
}

