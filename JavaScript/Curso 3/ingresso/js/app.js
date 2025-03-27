function comprar() {
    let tipo = document.getElementById('tipo-ingresso').value;
    let qtd = document.getElementById('qtd').value;
    if (qtd > 0) {
        if (tipo == 'pista') {
            comprarPista(qtd);
        } else if (tipo == 'superior') {
            comprarSuperior(qtd);
        } else if (tipo == 'inferior') {
            comprarInferior(qtd)
        }
    } else {
        alert('Quantidade inválida');
    }
}

function comprarPista(qtd) {
    let qtdPista = document.getElementById('qtd-pista');
    if (qtdPista.innerHTML - qtd < 0) {
        alert('Quantidade insuficiente');
        return;
    } else {
        qtdPista.innerHTML = qtdPista.innerHTML - qtd;
        alert('Compra feita com sucesso!');
    }

}

function comprarSuperior(qtd) {
    let qtdSuperior = document.getElementById('qtd-superior');
    if (qtdSuperior.innerHTML - qtd < 0) {
        alert('Quantidade insuficiente');
        return;
    } else {
        qtdSuperior.innerHTML = qtdSuperior.innerHTML - qtd;
        alert('Compra feita com sucesso!');
    }

}

function comprarInferior(qtd) {
    let qtdInferior = document.getElementById('qtd-inferior');
    if (qtdInferior.innerHTML - qtd < 0) {
        alert('Quantidade insuficiente');
        return;
    } else {
        qtdInferior.innerHTML = qtdInferior.innerHTML - qtd;
        alert('Compra feita com sucesso!');
    }

}
