let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do Desafio!';

function botaoClicado() {
    console.log('Clicou no botão console!');
}

function amoJS() {
    console.log('Eu amo JS!');
}

function cidade() {
    let cidade = prompt('Digite o nome de uma cidade:');
alert(`Estive em ${cidade} e lembrei de você!`);
}

function soma() {
    let resultado = 0;
    let num1 = 0;
    let num2 = 0;
    num1 = parseInt(prompt("Escolha um numero"));
    num2 = parseInt(prompt("Escolha um numero"));
    resultado = num1 + num2;

    alert(`A soma de ${num1} e ${num2} é ${resultado}`);
}